package MozzartGermania;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.KladjenjeVerifikacija;
import pageObjectsGermania.LandingPage;
import resources.base;

public class SlanjeZaVerifikaciju extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
    @Test
	public void slanjeTiketaNaVerifikaciju() throws Exception {
    	String name = new Object(){}.getClass().getEnclosingMethod().getName();
    	LandingPage lp = new LandingPage(driver);
    	lp.getKladjenje().click();
    	wait_time(2);
		selectRandomMatch(4);
		KladjenjeVerifikacija kv = new KladjenjeVerifikacija(driver);
		kv.uplata().clear();
		kv.uplata().sendKeys("20000");
		kv.uplataDugme().click();
		kv.uplataDugme2().click();
		waitForTextToAppear(driver, "Molimo pričekajte", kv.title());
		String title = kv.title().getText();
		log.info("Tiket je poslat na verifikaciju! :" + title);
		wait_time(10);
		try {
				kv.accept().isDisplayed();
				kv.accept().click();
				kv.accept1().click();
				wait_time(5);
				String title2 = kv.title1().getText();
				log.info(title2);
				takeScreenshotGermania(name);
				kv.closeDugme().click();
				log.info("Tiket nakon verifikovanja je uspesno uplacen sa promenama");
		} 
			catch (Exception e) {
			String title3 = kv.title1().getText();
			log.info(title3);
			log.info("Tiket nakon verifikovanja je uspesno uplacen sa istom uplatom");
			takeScreenshotGermania(name);
			kv.closeDugme().click();
		} 
		}
    
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
