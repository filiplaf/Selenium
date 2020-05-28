package MozzartMalta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import pageObjectsMalta.SafechargePage;
import resources.base;

public class UplataNovca extends base{
public static Logger log = LogManager.getLogger(base.class.getName());

public String novac = "5000";

	@Test
	public void uplataNovca() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.deposit().click();
		mr.debitCard().click();
		mr.amount().sendKeys(novac);
		mr.depositButton().click();
		wait_time(1);
		SafechargePage sp = new SafechargePage(driver);
		sp.cardholder().sendKeys("Filip");
		sp.cardNumber().sendKeys("4002629798205148");
		Select day = new Select(sp.day());
		day.selectByIndex(5);
		Select year = new Select(sp.year());
		year.selectByIndex(3);
		sp.cvv().sendKeys("123");
		sp.depositButton().click();
		wait_time(5);
		String title = sp.title().getText();
		if(title.contains("Deposit successful")) {
			log.info("Depozit od " + novac + " uspesno uplacen!");
			takeScreenshotMalta(name);
			sp.okButton().click();
		}
		else 
			log.error("Greska prilikom uplate depozita");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
