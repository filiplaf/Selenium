package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.KladjenjePage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {

		KladjenjePage kp = new KladjenjePage(driver);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		Thread.sleep(5000);
		String title = kp.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Sistemski tiket uspesno uplacen");
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		String title1 = kp.title1().getText();
		log.info(title1);
		kp.UreduDugme().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
