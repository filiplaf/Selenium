package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.VirtualFudbalPage;
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
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("50");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		Thread.sleep(6000);
		if(vf.UreduDugme().isDisplayed()) {
			log.info("Virtualni fudbal tiket uspesno uplacen");
			vf.UreduDugme().click();
		}
		else {
			log.info("Virtualni fudbal tiket nije uplacen");
		}
	}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
