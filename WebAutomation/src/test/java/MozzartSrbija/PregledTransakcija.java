package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class PregledTransakcija extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Transakcije() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getUser()).perform();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.Transakcije().click();
		Thread.sleep(2000);
		String x = mr.NoTransactionTitle().getText();
		if(x.contains("Nema transakcija na Va�em nalogu za izabrani dan.")) {
			log.info("Nema transakcija");
			mr.Kalendar().click();
			boolean isPresent = driver.findElements(By.cssSelector(".cell.day.highlighted")).size()>0;
			if(isPresent) {
				log.info("Ima transakcija u ovom mesecu");
			}
			else {
				log.info("Nema transakcija u ovom mesecu");
			}
		}
		else {
			log.info("U ovom danu ima transakcija");
			mr.Kalendar().click();
			if(mr.TransactionExist().isEnabled()) {
				mr.TransactionExist().click();
				log.info("Ima transakcija u ovom mesecu");
				Thread.sleep(2000);
			}
	}
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
