package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.KladjenjeVerifikacija;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class SlanjeZaVerifikaciju extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
    @Test
	public void slanjeTiketaZaVerifikaciju() throws Exception {
    	String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjeVerifikacija kv = new KladjenjeVerifikacija(driver);
		wait_time(3);
		selectRandomMatch(4);
		kv.uplata().clear();
		kv.uplata().sendKeys("20000");
		kv.uplataDugme().click();
		kv.uplataDugme2().click();
		wait_time(5);
		String title = kv.title().getText();
		log.info("Tiket je poslat na verifikaciju! :" + title);
		wait_time(10);
		String title1 = kv.title().getText();
		log.info(title1);
		takeScreenshotSerbia(name);
		try {
		kv.accept().isDisplayed();
		kv.accept().click();
		kv.accept1().click();
		wait_time(5);
		String title2 = kv.title().getText();
		log.info(title2);
		log.info("Tiket nakon verifikovanja je uspesno uplacen sa promenama");
		kv.closeDugme().click();
		}
		catch (Exception e) {
			log.info("Tiket nakon verifikovanja je uspesno uplacen bez promene iznosa");
			takeScreenshotSerbia(name);
			kv.closeDugme().click();
		}	
		}
    
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
