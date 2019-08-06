package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.KladjenjePage;
import pageObjectsSrbija.LandingPage;
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
		kp.izaberiBenefit().click();
		kp.klikBenefit().click();
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		Thread.sleep(4000);
		String title = kp.title().getText();
		log.info(title);
		kp.UreduDugme().click();
		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
