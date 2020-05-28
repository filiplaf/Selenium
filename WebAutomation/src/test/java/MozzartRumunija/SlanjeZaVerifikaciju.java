package MozzartRumunija;

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
	public void slanjeTiketaNaVerifikaciju() throws Exception {
    	String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		wait_time(3);
		KladjenjeVerifikacija kv = new KladjenjeVerifikacija(driver);
		selectRandomMatchRumunija(4);
		kv.uplata().sendKeys(Keys.CONTROL + "a");
		kv.uplata().sendKeys(Keys.DELETE);
		kv.uplata().sendKeys("10000");
		kv.uplataDugme().click();
		kv.uplataDugme2().click();
		Thread.sleep(5000);
		String title = kv.title().getText();
		log.info("Tiket je poslat na verifikaciju! :" + title);
		Thread.sleep(5000);
		try {
		kv.accept().isDisplayed();
		String title2 = kv.title().getText();
		log.info("Doslo je do promena --> " + title2);
		kv.accept().click();
		kv.acceptUplata().click();
		wait_time(5);
		String title1 = kv.title().getText();
		log.info("Tiket nakon verifikovanja je uspesno uplacen: " + title1);
		takeScreenshotRumunija(name);
		kv.closeButton();
			}
		catch (Exception e) {
			String title2 = kv.title().getText();
			log.info(title2);
			log.info("Tiket nakon verifikovanja sa istom uplatom je uspesno uplacen: " + title2);
			takeScreenshotRumunija(name);
			kv.closeButton();
		}
		}
    
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
