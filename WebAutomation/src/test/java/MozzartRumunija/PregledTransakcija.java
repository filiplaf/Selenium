package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import resources.base;

public class PregledTransakcija extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Transakcije() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getKorisnik()).perform();
		Thread.sleep(2000);
		lp.getCont().click();
		MojRacun mr = new MojRacun(driver);
		Thread.sleep(15000);
		mr.Transakcije().click();
		Thread.sleep(10000);
		String x = mr.TransakcijeTitle().getText();
		//System.out.println(x);
		if(x.contains("Nu exista tranzactii pentru ziua selectata")){
			log.info("Nema transakcija u ovom danu");
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
			Thread.sleep(2000);
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
