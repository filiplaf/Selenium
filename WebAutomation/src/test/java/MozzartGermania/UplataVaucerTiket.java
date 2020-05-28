package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.KladjenjePage;
import pageObjectsGermania.LandingPage;
import resources.base;

public class UplataVaucerTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataVaucerTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatch(5);
		kp.izaberiBenefit().click();
		String text = kp.benefitText().getText();
		kp.klikBenefit().click();
		log.info("Izabrali ste benefit: " + text);
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
	    if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
	    takeScreenshotGermania(name);
		String title = kp.title().getText();
		log.info(title);
		log.info("Vaucer tiket uspesno uplacen");
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
