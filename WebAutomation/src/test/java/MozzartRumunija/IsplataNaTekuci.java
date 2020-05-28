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

public String user;
	
@Test
	public void isplataNaSkrillod400() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		user = lp.getKorisnik().getText();
		moveToElementAndClick(lp.getKorisnik());
		MojRacun mr = new MojRacun(driver);
		mr.isplata().click();
		mr.naSkrillRacun().click();
		mr.iznosZaSkrill().sendKeys("400");
		mr.mailZaTekuci().sendKeys(user+"@mailinator.com");
		mr.isplatiNaSkrill().click();
		if(waitForTextToAppear(driver, "plata cu succes", mr.successTitle())) {
		log.info(mr.successTitle().getText());
		log.info("Isplata na Skrill od 400 ron");
		moveToElementAndClick(mr.potvrdi());
		}
		else {
			log.error("Isplata neuspesna");
		}
	}
	
	@Test
	public void isplataNaSkrillod500() throws IOException, InterruptedException {	
		MojRacun mr = new MojRacun(driver);
		mr.isplata().click();
		mr.naSkrillRacun().click();
		mr.iznosZaSkrill().sendKeys("500");
		mr.mailZaTekuci().sendKeys(user+"@mailinator.com");
		mr.isplatiNaSkrill().click();
		if(waitForTextToAppear(driver, "plata cu succes", mr.successTitle())) {
		log.info(mr.successTitle().getText());
		log.info("Isplata na Skrill od 500 ron");
		moveToElementAndClick(mr.potvrdi());
		}
		else {
			log.error("Isplata neuspesna");
		}
	}
	
	@Test
	public void isplataNaSkrillod600() throws IOException, InterruptedException {	
		MojRacun mr = new MojRacun(driver);
		mr.isplata().click();;
		mr.naSkrillRacun().click();
		mr.iznosZaSkrill().sendKeys("600");
		mr.mailZaTekuci().sendKeys(user+"@mailinator.com");
		mr.isplatiNaSkrill().click();
		if(waitForTextToAppear(driver, "plata cu succes", mr.successTitle())) {
		log.info(mr.successTitle().getText());
		log.info("Isplata na Skrill od 600 ron");
		moveToElementAndClick(mr.potvrdi());
		}
		else {
			log.error("Isplata neuspesna");
		}
	}
	
	@Test
	public void isplataNaSkrillod700() throws IOException, InterruptedException {
		MojRacun mr = new MojRacun(driver);
		mr.isplata().click();;
		mr.naSkrillRacun().click();
		mr.iznosZaSkrill().sendKeys("700");
		mr.mailZaTekuci().sendKeys(user+"@mailinator.com");
		mr.isplatiNaSkrill().click();
		if(waitForTextToAppear(driver, "plata cu succes", mr.successTitle())) {
		log.info(mr.successTitle().getText());
		log.info("Isplata na Skrill od 700 ron");
		moveToElementAndClick(mr.potvrdi());
		}
		else {
			log.error("Isplata neuspesna");
		}
	}
	
	@Test
	public void isplataNaSkrillod800() throws IOException, InterruptedException {
		
		MojRacun mr = new MojRacun(driver);
		mr.isplata().click();
		mr.naSkrillRacun().click();
		mr.iznosZaSkrill().sendKeys("800");
		mr.mailZaTekuci().sendKeys(user+"@mailinator.com");
		mr.isplatiNaSkrill().click();
		if(waitForTextToAppear(driver, "plata cu succes", mr.successTitle())) {
		log.info(mr.successTitle().getText());
		log.info("Isplata na Skrill od 800 ron");
		mr.potvrdi().click();
		}
		else {
			log.error("Isplata neuspesna");
		}
	}

	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
