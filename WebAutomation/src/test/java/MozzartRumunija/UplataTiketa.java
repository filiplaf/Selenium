package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.KladjenjePage;
import pageObjectsRumunija.LandingPage;
import resources.base;

public class UplataTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		Thread.sleep(2000);
		KladjenjePage kp = new KladjenjePage(driver);
		kp.getmec1().click();
		kp.getmec2().click();
		kp.getmec3().click();
		kp.getmec4().click();
		kp.uplata().clear();
		kp.uplata().sendKeys("020");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		Thread.sleep(30000);
		String title = kp.title().getText();
		if(title.contains("PLATA BILETULUI"))
			log.info("Tiket uspesno uplacen");
		else {
			log.error("Tiket nije uplacen");
		}
		kp.UreduDugme().click();
		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
