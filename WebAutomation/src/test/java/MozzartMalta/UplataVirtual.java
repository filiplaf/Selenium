package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.VirtualFudbalPage;
import resources.base;

public class UplataVirtual extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getvirtualNav()).build().perform();
		lp.getvirtualFudbal().click();
		Thread.sleep(1500);
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		//Uplata virtualnog tiketa
		vf.VirtualMec1().click();
		vf.VirtualMec2().click();
		vf.VirtualMec3().click();
		vf.uplata().clear();
		vf.uplata().sendKeys("5");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		Thread.sleep(6000);
		String title = vf.title().getText();
		log.info(title);
		log.info("Virtualni fudbal tiket uspesno uplacen");
		vf.UreduDugme().click();

	}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
