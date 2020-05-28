package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.MojRacun;
import resources.base;

public class IsplataNaTekuci extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void isplataNaTekuci() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		moveToElementAndClick(mr.isplata());
		wait_time(1);
		mr.naTekuciRacun().click();
		mr.iznosZaTekuci().sendKeys("400");
		mr.isplatiNaTekuci().click();
		waitForTextToAppear(driver, "Uspješna isplata", mr.title1());
		String title1 = mr.title1().getText();
		log.info(title1 + " od 400hrk");
		mr.zatvoriDugmeTekuci().click();
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("500");
		mr.isplatiNaTekuci().click();
		waitForTextToAppear(driver, "Uspješna isplata", mr.title1());
		String title2 = mr.title1().getText();
		log.info(title2 + " od 500hrk");
		mr.zatvoriDugmeTekuci().click();
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("600");
		mr.isplatiNaTekuci().click();
		waitForTextToAppear(driver, "Uspješna isplata", mr.title1());
		String title3 = mr.title1().getText();
		log.info(title3 + " od 600hrk");
		mr.zatvoriDugmeTekuci().click();
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("700");
		mr.isplatiNaTekuci().click();
		waitForTextToAppear(driver, "Uspješna isplata", mr.title1());
		String title4 = mr.title1().getText();
		log.info(title4 + " od 700hrk");
		mr.zatvoriDugmeTekuci().click();
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("800");
		mr.isplatiNaTekuci().click();
		waitForTextToAppear(driver, "Uspješna isplata", mr.title1());
		String title5 = mr.title1().getText();
		log.info(title5 + " od 800hrk");
		mr.zatvoriDugmeTekuci().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
