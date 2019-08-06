package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.KladjenjePage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {

		KladjenjePage kp = new KladjenjePage(driver);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("020");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		Thread.sleep(20000);
		String title = kp.title().getText();
		if(title.contains("PLATA BILETULUI"))
			log.info("Sistemski tiket uspesno uplacen");
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		kp.UreduDugme().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
