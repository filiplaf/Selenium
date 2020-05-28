package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import resources.base;

public class IsplataNaUm extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void isplataNaUplatnoMesto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		moveToElementAndClick(lp.getKorisnik());
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.isplata().click();
		mr.naUplatnoMesto().click();
		
		//Isplata na Buzau UM
		wait_time(1);
		mr.uplatnoMesto().click();
		mr.webRo().click();
		mr.iznos().sendKeys("100");
		mr.isplati().click();
		log.info(mr.title().getText());
		mr.inchide().click();
		log.info("Isplata na Buzau UM od 100 ron");
		
		mr.iznos().sendKeys(Keys.CONTROL + "a");
		mr.iznos().sendKeys(Keys.DELETE);
		mr.iznos().sendKeys("200");
		mr.isplati().click();
		log.info(mr.title().getText());
		mr.inchide().click();
		log.info("Isplata na Buzau UM od 200 ron");
		
		mr.iznos().sendKeys(Keys.CONTROL + "a");
		mr.iznos().sendKeys(Keys.DELETE);
		mr.iznos().sendKeys("300");
		mr.isplati().click();
		log.info(mr.title().getText());
		mr.inchide().click();
		log.info("Isplata na Buzau UM od 300 ron");
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}