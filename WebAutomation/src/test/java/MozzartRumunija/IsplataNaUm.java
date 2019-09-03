package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import resources.base;

public class IsplataNaUm extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Isplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getKorisnik()).perform();
		Thread.sleep(2000);
		lp.getCont().click();
		MojRacun mr = new MojRacun(driver);
		Thread.sleep(15000);
		mr.Isplata().click();
		Thread.sleep(2000);
		mr.NaUplatnoMesto().click();
		
		//Isplata na Bucurest UM
		Thread.sleep(5000);
		mr.UplatnoMesto().click();
		mr.Bucurest().click();
		mr.Iznos().sendKeys("100");
		Thread.sleep(5000);                // OVA CEKANJA MORAJU DA SE POBOLJSAJU KODOM
		mr.Isplati().click();
		Thread.sleep(15000);
		log.info("Isplata na Bukurest UM od 100 ron");
		
		//mr.Isplata().click();
		mr.Iznos().sendKeys(Keys.CONTROL + "a");
		mr.Iznos().sendKeys(Keys.DELETE);
		mr.Iznos().sendKeys("200");
		Thread.sleep(5000);
		mr.Isplati().click();
		Thread.sleep(15000);
		log.info("Isplata na Bukurest UM od 200 ron");
		
		//mr.Isplata().click();
		mr.Iznos().sendKeys(Keys.CONTROL + "a");
		mr.Iznos().sendKeys(Keys.DELETE);
		mr.Iznos().sendKeys("300");
		Thread.sleep(5000);
		mr.Isplati().click();
		Thread.sleep(15000);
		log.info("Isplata na Bukurest UM od 300 ron");
		
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
