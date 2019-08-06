package MozzartRumunija;
import java.io.IOException;

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
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		//Thread.sleep(1000);
		lp.getKladjenje().click();
		Thread.sleep(2000);
		KladjenjePage kp = new KladjenjePage(driver);
		kp.getmec1().click();
		kp.getmec2().click();
		kp.getmec3().click();
		kp.getmec4().click();
		Thread.sleep(5000);
		kp.izaberiBenefit().click();
		Thread.sleep(5000);
		kp.klikBenefit().get(1).click();
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		Thread.sleep(30000);
		String title = kp.title().getText();
		if(title.contains("BILET JUCAT CU SUCCES"))
			log.info("Vaucer tiket uspesno uplacen");
		else {
			log.error("Vaucer tiket nije uplacen");
		}
		kp.UreduDugme().click();
		
		}
	@AfterTest(alwaysRun = true)
	 public void teardown() {
		driver.close();
		driver.quit();
	}

}
