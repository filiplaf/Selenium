package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import resources.base;

public class IsplataNaTekuci extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Isplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getCont().click();
		
		MojRacun mr = new MojRacun(driver);
		mr.VerifikacijaDugme().click();
		Thread.sleep(1000);
		mr.Isplata().click();
		Thread.sleep(1000);
		mr.NaSkrillRacun().click();
		Thread.sleep(2000);
		mr.IznosZaSkrill().sendKeys("400");
		Thread.sleep(2000);
		mr.MailZaTekuci().sendKeys("pera47@mailinator.com");
		Thread.sleep(2000);
		mr.IsplatiNaSkrill().click();
		Thread.sleep(2000);
		mr.Potvrdi().click();
		Thread.sleep(8000);
		log.info("Isplata na Skrill od 400 ron");
		
		mr.Isplata().click();
		Thread.sleep(1000);
		mr.NaSkrillRacun().click();
		mr.IznosZaSkrill().sendKeys("500");
		mr.MailZaTekuci().sendKeys("pera42@mailinator.com");
		Thread.sleep(1000);
		mr.IsplatiNaSkrill().click();
		mr.Potvrdi().click();
		Thread.sleep(8000);
		log.info("Isplata na Skrill od 500 ron");
		
		mr.Isplata().click();
		Thread.sleep(1000);
		mr.NaSkrillRacun().click();
		mr.IznosZaSkrill().sendKeys("600");
		mr.MailZaTekuci().sendKeys("pera42@mailinator.com");
		Thread.sleep(1000);
		mr.IsplatiNaSkrill().click();
		mr.Potvrdi().click();
		Thread.sleep(8000);
		log.info("Isplata na Skrill od 600 ron");
		
		mr.Isplata().click();
		Thread.sleep(1000);
		mr.NaSkrillRacun().click();
		mr.IznosZaSkrill().sendKeys("700");
		mr.MailZaTekuci().sendKeys("pera42@mailinator.com");
		Thread.sleep(1000);
		mr.IsplatiNaSkrill().click();
		mr.Potvrdi().click();
		Thread.sleep(8000);
		log.info("Isplata na Skrill od 700 ron");

		mr.Isplata().click();
		Thread.sleep(1000);
		mr.NaSkrillRacun().click();
		mr.IznosZaSkrill().sendKeys("800");
		mr.MailZaTekuci().sendKeys("pera42@mailinator.com");
		Thread.sleep(1000);
		mr.IsplatiNaSkrill().click();
		mr.Potvrdi().click();
		Thread.sleep(8000);
		log.info("Isplata na Skrill od 800 ron");
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
