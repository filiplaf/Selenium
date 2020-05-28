package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.VirtualFudbalPage;
import resources.base;

public class UplataVirtual extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataVirtualTiketa1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		wait_time(1);
		moveToElementAndClick(lp.getvirtualNav());
		wait_time(1);
		moveToElementAndClick(lp.getvirtualFudbal());
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		//Uplata virtualnog singl tiketa
		wait_time(3);
		selectRandomVirtualMatchMalta(1);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("1");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		waitForElementToBeVisible(driver, vf.ureduDugme(), 10);
		if(vf.ureduDugme().isDisplayed()) {
			String title = vf.title().getText();
			log.info("Virtualni fudbal SINGL tiket uspesno uplacen: " + title);
			vf.ureduDugme().click();
		}
		else {
			log.info("Virtualni fudbal tiket nije uplacen");
		}
	}
	
	@Test
	public void uplataVirtualTiketa2() throws IOException, InterruptedException {
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		wait_time(2);
		selectRandomVirtualMatchMalta(2);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("1");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		waitForElementToBeVisible(driver, vf.ureduDugme(), 10);
		if(vf.ureduDugme().isDisplayed()) {
			String title = vf.title().getText();
			log.info("Virtualni fudbal tiket sa DVA PARA uspesno uplacen: " + title);
			vf.ureduDugme().click();
		}
		else {
			log.info("Virtualni fudbal tiket nije uplacen");
		}
	}
	
	@Test
	public void uplataVirtualTiketa3() throws IOException, InterruptedException {
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		wait_time(2);
		selectRandomVirtualMatchMalta(3);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("1");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		waitForElementToBeVisible(driver, vf.ureduDugme(), 10);
		if(vf.ureduDugme().isDisplayed()) {
			String title = vf.title().getText();
			log.info("Virtualni fudbal tiket sa TRI PARA uspesno uplacen: " + title);
			vf.ureduDugme().click();
		}
		else {
			log.info("Virtualni fudbal tiket nije uplacen");
		}
	}
	
	@Test
	public void uplataVirtualTiketa4() throws IOException, InterruptedException {
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		wait_time(2);
		selectRandomVirtualMatchMalta(4);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("1");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		waitForElementToBeVisible(driver, vf.ureduDugme(), 10);
		if(vf.ureduDugme().isDisplayed()) {
			String title = vf.title().getText();
			log.info("Virtualni fudbal tiket sa CETIRI PARA uspesno uplacen: " + title);
			vf.ureduDugme().click();
		}
		else {
			log.info("Virtualni fudbal tiket nije uplacen");
		}
	}
	
	@Test
	public void uplataVirtualTiketa5() throws IOException, InterruptedException {
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		wait_time(2);
		selectRandomVirtualMatchMalta(5);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("1");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		waitForElementToBeVisible(driver, vf.ureduDugme(), 10);
		if(vf.ureduDugme().isDisplayed()) {
			String title = vf.title().getText();
			log.info("Virtualni fudbal tiket sa PET PARA uspesno uplacen: " + title);
			vf.ureduDugme().click();
		}
		else {
			log.info("Virtualni fudbal tiket nije uplacen");
		}
	}
	@AfterTest()
	public void teardown() {
	driver.close();
	driver.quit();
	}
	
}
