package MozzartMalta;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.ChangeData;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class PromenaPodataka extends base{
public static Logger log = LogManager.getLogger(base.class.getName());

public String City = "Belgrade";

	@Test
	public void PromenaPodataka() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.user()).perform();
		lp.account().click();
		MojRacun mr = new MojRacun(driver);
		mr.ChangeData().click();
		Thread.sleep(3000);
		ChangeData cd = new ChangeData(driver);
		cd.Street().clear();
		cd.Street().sendKeys("Takovska " + RandomStringUtils.randomNumeric(2));  //Za random broj pored adrese
		cd.Zipcode().clear();
		cd.Zipcode().sendKeys(RandomStringUtils.randomNumeric(5));
		cd.City().clear();
		cd.City().sendKeys(City);
		cd.Phone().clear();
		cd.Phone().sendKeys(RandomStringUtils.randomNumeric(6));
		Thread.sleep(1000);
		cd.SaveButton().click();
		Thread.sleep(3000);
		String title = cd.Title().getText();
		log.info(title);
		cd.OkButton().click();
		log.info("Podaci su promenjeni");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
