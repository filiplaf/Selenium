package MozzartMalta;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	public void promenaPodataka() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.changeData().click();
		wait_time(1);
		ChangeData cd = new ChangeData(driver);
		cd.Street().clear();
		cd.Street().sendKeys("Takovska " + RandomStringUtils.randomNumeric(2));  //Za random broj pored adrese
		cd.Zipcode().clear();
		cd.Zipcode().sendKeys(RandomStringUtils.randomNumeric(5));
		cd.City().clear();
		cd.City().sendKeys(City);
		cd.Phone().clear();
		cd.Phone().sendKeys(RandomStringUtils.randomNumeric(6));
		takeScreenshotMalta(name);
		cd.SaveButton().click();
		wait_time(1);
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
