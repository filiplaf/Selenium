package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.KladjenjePage;
import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
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
	    if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket.", kp.title())) {
	    takeScreenshotSerbia(name);
		String title = kp.title().getText();
		log.info(title);
		log.info("Vaucer tiket uspesno uplacen");
		kp.ureduDugme().click();
		}
	    else {
	    	if(waitForTextToAppear(driver, "Problem sa vezom", kp.title())) {
	    		kp.ureduDugme().click();
	    		lp.userclick().click();
	    		lp.getMojracun().click();
	    		MojRacun mr = new MojRacun(driver);
	    		mr.pregledTiketa().click();
	    		wait_time(1);
	    		String x = moveToElementAndRead(mr.transactionTable());
	    		if(x.contains("Sportsko klađenje (benefit)")) {
	    			log.info("Vaucer tiket uspesno uplacen");
	    		}
	    		else {
	    			log.info("Ne postoji vaucer tiket");
	    		}
	    		
	    	}
	    	else {
	    		log.info("Vaucer tiket nije uspesno uplacen");
	    	}
	    }
	}
	    
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
