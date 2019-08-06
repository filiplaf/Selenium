package MozzartSrbija;
import java.io.IOException;

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
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		Thread.sleep(2000);
		KladjenjeVerifikacija kv = new KladjenjeVerifikacija(driver);
		kv.getmec1().click();
		kv.getmec2().click();
		kv.getmec3().click();
		kv.getmec4().click();
		kv.uplata().clear();
		kv.uplata().sendKeys("20000");
		kv.uplataDugme().click();
		kv.uplataDugme2().click();
		Thread.sleep(5000);
		String title = kv.title().getText();
		log.info("Tiket je poslat na verifikaciju! :" + title);
		Thread.sleep(10000);
		String title1 = kv.title().getText();
		log.info(title1);
		Thread.sleep(2000);
		kv.accept().click();
		kv.Accept1().click();
		Thread.sleep(5000);
		String title2 = kv.title().getText();
		log.info(title2);
		log.info("Tiket nakon verifikovanja je uspesno uplacen");
		kv.closeDugme().click();

		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
