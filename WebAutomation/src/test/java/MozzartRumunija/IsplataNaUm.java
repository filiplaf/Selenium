package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
		lp.getCont().click();
		MojRacun mr = new MojRacun(driver);
		mr.VerifikacijaDugme().click();
		mr.Isplata().click();
		mr.NaUplatnoMesto().click();
		
		//Isplata na Bucurest UM
		mr.Iznos().sendKeys("100");
		Thread.sleep(10000);                // OVA CEKANJA MORAJU DA SE POBOLJSAJU KODOM
		mr.Isplati().click();
		Thread.sleep(15000);
		String title = mr.Title().getText();
		log.info(title);
		mr.ZatvoriDugme().click();
		Thread.sleep(8000);
		log.info("Isplata na Bukurest UM od 100 ron");
		
		mr.Isplata().click();
		mr.NaUplatnoMesto().click();
		mr.Iznos().sendKeys("200");
		Thread.sleep(10000);
		mr.Isplati().click();
		Thread.sleep(15000);
		String title1 = mr.Title().getText();
		log.info(title1);
		mr.ZatvoriDugme().click();
		Thread.sleep(8000);
		log.info("Isplata na Bukurest UM od 200 ron");
		
		mr.Isplata().click();
		mr.NaUplatnoMesto().click();
		mr.Iznos().sendKeys("300");
		Thread.sleep(10000);
		mr.Isplati().click();
		Thread.sleep(15000);
		String title2 = mr.Title().getText();
		log.info(title2);
		mr.ZatvoriDugme().click();
		Thread.sleep(8000);
		log.info("Isplata na Bukurest UM od 300 ron");
		
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
