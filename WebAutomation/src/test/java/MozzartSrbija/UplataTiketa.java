package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.KladjenjePage;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class UplataTiketa extends base {
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
		kp.uplata().clear();
		kp.uplata().sendKeys("20");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		Thread.sleep(10000);
		String title = kp.title().getText();
		if(title.contains("Aktivan tiket"))
			log.info("Tiket uspesno uplacen");
		else {
			log.error("Tiket nije uplacen");
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
