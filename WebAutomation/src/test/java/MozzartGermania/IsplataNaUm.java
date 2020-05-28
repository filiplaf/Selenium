package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.MojRacun;
import resources.base;

public class IsplataNaUm extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void isplataNaUM() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.isplata().click();
		wait_time(1);
		mr.naUplatnoMesto().click();
		mr.um().click();
		
		//Isplata na CityCaffe UM
		mr.rovinj().click();
		mr.iznos().sendKeys("100");
		mr.isplati().click();
		String title = mr.title().getText();
		log.info(title);
		mr.zatvoriDugme().click();
		
//		//Isplata na Zagreb Dubrava UM
		mr.um().click();
		mr.zagrebDubrava().click();
		mr.iznos().sendKeys(Keys.CONTROL + "a");
		mr.iznos().sendKeys(Keys.DELETE);
		mr.iznos().sendKeys("200");
		mr.isplati().click();
		String title1 = mr.title().getText();
		log.info(title1);
		mr.zatvoriDugme().click();
		
		mr.iznos().sendKeys(Keys.CONTROL + "a");
		mr.iznos().sendKeys(Keys.DELETE);
		mr.iznos().sendKeys("300");
		mr.isplati().click();
		String title2 = mr.title().getText();
		log.info(title2);
		mr.zatvoriDugme().click();
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
