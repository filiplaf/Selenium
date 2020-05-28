package MozzartMalta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.KladjenjeVerifikacija;
import pageObjectsMalta.LandingPage;
import resources.base;

public class SlanjeZaVerifikaciju extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
    @Test
	public void slanjeTiketaNaVerifikaciju() throws Exception {
    	String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.sports().click();
		wait_time(3);
		KladjenjeVerifikacija kv = new KladjenjeVerifikacija(driver);
		selectRandomMatchMalta(4);
		kv.uplata().sendKeys(Keys.CONTROL + "a");
		kv.uplata().sendKeys(Keys.DELETE);
		kv.uplata().sendKeys("1000");
		kv.uplataDugme().click();
		kv.uplataDugme2().click();
		wait_time(5);
		String title = kv.title().getText();
		log.info("Tiket je poslat na verifikaciju! :" + title);
		wait_time(5);
		try {
		kv.acceptChanges().isDisplayed();
		String title1 = kv.title().getText();
		log.info("Doslo je do promena --> " + title1);
		kv.acceptChanges().click();
		kv.placeBet().click();
		wait_time(5);
		String title2 = kv.title().getText();
		log.info("Tiket nakon verifikovanja je uspesno uplacen: " + title2);
		takeScreenshotMalta(name);
		kv.closeDugme();	
			}
		catch (Exception e) {
		String title1 = kv.title().getText();
		log.info(title1);
		log.info("Tiket nakon verifikovanja sa istom uplatom je uspesno uplacen: " + title1);
		takeScreenshotMalta(name);
		kv.closeDugme();
		}
		}
    
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
