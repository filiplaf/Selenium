package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//import pageObjectsMozzart.KladjenjePage;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.SportsPage;
import resources.base;

public class UplataTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		//Thread.sleep(1000);
		lp.getSports().click();
		Thread.sleep(2000);
		SportsPage sp = new SportsPage(driver);
		sp.getmec1().click();
		sp.getmec2().click();
		sp.getmec3().click();
		sp.getmec4().click();
		sp.uplata().clear();
		sp.uplata().sendKeys("20");
		sp.uplataDugme().click();
		sp.uplataDugme2().click();
		Thread.sleep(2000);
		String title = sp.title().getText();
		log.info(title);
		log.info("Obican tiket uplacen");
		sp.UreduDugme().click();
		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
