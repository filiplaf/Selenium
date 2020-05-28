package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.VirtualFudbalPage;
import resources.base;

public class UplataVirtual extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataVirtualTiketa1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		wait_time(1);
		moveToElementAndClick(lp.getvirtualNav());
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		//Uplata virtualnog singl tiketa
		wait_time(3);
		selectRandomVirtualMatchGermania(1);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("2");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		
		try {
			vf.ureduDugme().isDisplayed(); 
			String title = vf.title().getText();
			log.info("Virtualni fudbal tiket sa DVA PARA uspesno uplacen: " + title);
			vf.ureduDugme().click();
				}
		catch (Exception e) {
			wait_time(30);
			String title = vf.title().getText();
			vf.ureduDugme().click();
			log.info("Virtualni fudbal tiket sa DVA PARA uspesno uplacen: " + title);
		}
			}	
	
	@Test
	public void uplataVirtualTiketa2() throws IOException, InterruptedException {
		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
		wait_time(2);
		selectRandomVirtualMatchGermania(2);
		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		vf.uplata().sendKeys("2");
		vf.uplataDugme().click();
		vf.uplataDugme2().click();
		try { 
			vf.ureduDugme().isDisplayed();
			String title = vf.title().getText();
			log.info("Virtualni fudbal tiket sa TRI PARA uspesno uplacen: " + title);
			vf.ureduDugme().click();
				}
		catch (Exception e) {
			wait_time(30);
			String title = vf.title().getText();
			vf.ureduDugme().click();
			log.info("Virtualni fudbal tiket sa TRI PARA uspesno uplacen: " + title);
		}
				
	}
	
//	@Test
//	public void uplataVirtualTiketa3() throws IOException, InterruptedException {
//		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
//		wait_time(2);
//		selectRandomVirtualMatchGermania(3);
//		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		vf.uplata().sendKeys("2");
//		vf.uplataDugme().click();
//		vf.uplataDugme2().click();
//		wait_time(10);
//		if(vf.ureduDugme().isDisplayed()) {
//			String title = vf.title().getText();
//			log.info("Virtualni fudbal tiket sa TRI PARA uspesno uplacen: " + title);
//			vf.ureduDugme().click();
//		}
//		else {
//			log.info("Virtualni fudbal tiket nije uplacen");
//		}
//	}
//	
//	@Test
//	public void uplataVirtualTiketa4() throws IOException, InterruptedException {
//		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
//		wait_time(2);
//		selectRandomVirtualMatch(4);
//		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		vf.uplata().sendKeys("2");
//		vf.uplataDugme().click();
//		vf.uplataDugme2().click();
//		wait_time(10);
//		if(vf.ureduDugme().isDisplayed()) {
//			String title = vf.title().getText();
//			log.info("Virtualni fudbal tiket sa CETIRI PARA uspesno uplacen: " + title);
//			vf.ureduDugme().click();
//		}
//		else {
//			log.info("Virtualni fudbal tiket nije uplacen");
//		}
//	}
//	
//	@Test
//	public void uplataVirtualTiketa5() throws IOException, InterruptedException {
//		VirtualFudbalPage vf = new VirtualFudbalPage(driver); 
//		wait_time(2);
//		selectRandomVirtualMatchGermania(5);
//		vf.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		vf.uplata().sendKeys("6");
//		vf.uplataDugme().click();
//		vf.uplataDugme2().click();
//		wait_time(10);
//		if(vf.ureduDugme().isDisplayed()) {
//			String title = vf.title().getText();
//			log.info("Virtualni fudbal tiket sa PET PARA uspesno uplacen: " + title);
//			vf.ureduDugme().click();
//		}
//		else {
//			log.info("Virtualni fudbal tiket nije uplacen");
//		}
//	}
	
	@AfterTest()
	public void teardown() {
	driver.close();
	driver.quit();
	}
	
}
