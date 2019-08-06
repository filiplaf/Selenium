package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.KladjenjeVerifikacija;
import pageObjectsMalta.LandingPage;
import resources.base;

public class SlanjeZaVerifikaciju extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
    @Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getSports().click();
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
		log.info("Tiket je poslat na verifikaciju!");
		String title = kv.title().getText();
		log.info(title);
		Thread.sleep(10000);
		kv.accept().click();
		kv.Accept1().click();
		Thread.sleep(5000);
		String title2 = kv.title().getText();
		log.info(title2);
		kv.closeDugme().click();

		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
