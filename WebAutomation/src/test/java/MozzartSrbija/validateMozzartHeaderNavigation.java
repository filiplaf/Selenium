package MozzartSrbija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import junit.framework.Assert;
import pageObjectsSrbija.LandingPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;

public class validateMozzartHeaderNavigation extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test(alwaysRun = true)
	public void ValidateMozzartHeaderNavigation() throws IOException, InterruptedException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));                
		log.info("Navigated to Home page");
		LandingPage lp = new LandingPage(driver);
		//compare the text form the browser with actual text
		
		boolean isDisplayed = lp.getHeaderNavigation().isDisplayed();
		
		
		Assert.assertTrue(lp.getHeaderNavigation().isDisplayed());
		log.info("Successfully validated Header navigation");
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
