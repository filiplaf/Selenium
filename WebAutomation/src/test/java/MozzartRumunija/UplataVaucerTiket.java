package MozzartRumunija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.KladjenjePage;
import pageObjectsRumunija.LandingPage;
import resources.base;

public class UplataVaucerTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataVaucerTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.getKladjenje().click();
		wait_time(3);
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchRumunija(5);
		kp.izaberiBenefit().click();
		kp.klikBenefit().click();
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
	    if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			String title = kp.title().getText();
			log.info(title);
			log.info("Vaucer tiket uspesno uplacen");
			takeScreenshotRumunija(name);
			kp.ureduDugme().click();
	    }
	    else {
	    	log.info("Vaucer tiket nije uspesno uplacen");
	    	kp.ureduDugme().click();
	    }

		
		
		}
	@AfterTest(alwaysRun = true)
	 public void teardown() {
		driver.close();
		driver.quit();
	}

}
