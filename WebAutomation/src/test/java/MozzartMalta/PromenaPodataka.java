package MozzartMalta;
import java.io.IOException;

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

public String Street = "Takovska 41";
public String Zipcode = "11002";
public String City = "Belgrade";
public String Phone = "123456";

	@Test
	public void PromenaPodataka() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.user()).perform();
		lp.account().click();
		MojRacun mr = new MojRacun(driver);
		mr.ChangeData().click();
		Thread.sleep(1000);
		ChangeData cd = new ChangeData(driver);
		cd.Street().clear();
		cd.Street().sendKeys(Street);
		cd.Zipcode().clear();
		cd.Zipcode().sendKeys(Zipcode);
		cd.City().clear();
		cd.City().sendKeys(City);
		cd.Phone().clear();
		cd.Phone().sendKeys(Phone);
		Thread.sleep(1000);
		cd.SaveButton().click();
		cd.OkButton().click();
		log.info("Podaci su promenjeni");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
