package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.KladjenjeVerifikacija;
import pageObjectsRumunija.LandingPage;
import resources.base;

public class SlanjeZaVerifikaciju extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
    @Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		Thread.sleep(2000);
		KladjenjeVerifikacija kv = new KladjenjeVerifikacija(driver);
		kv.getmec1().click();
		kv.getmec2().click();
		kv.getmec3().click();
		kv.getmec4().click();
		Thread.sleep(1000);
		kv.uplata().sendKeys(Keys.CONTROL + "a");
		kv.uplata().sendKeys(Keys.DELETE);
		kv.uplata().sendKeys("20000");
		kv.uplataDugme().click();
		kv.uplataDugme2().click();
		Thread.sleep(20000);
		String title = kv.title().getText();
		log.info("Tiket je poslat na verifikaciju! :" + title);
		Thread.sleep(20000);
		kv.Accept().click();
		Thread.sleep(20000);
		String title1 = kv.title1().getText();
		Thread.sleep(2000);
		log.info("Tiket nakon verifikovanja je uspesno uplacen: " + title1);
		kv.closeButton();
		
		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
