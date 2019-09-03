package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.GrckiTomboPage;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class UplataGrckiTomboTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getIgreNaBrojeve()).perform();
		lp.getGrckiTombo().click();
		Thread.sleep(1000);
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		
		//G2 tiket
		gt.GrckiTombo2().click();
		Thread.sleep(1000);
		gt.GrckiTombo2Time().click();
		gt.GrckiTombo2Kugla1().click();
		gt.GrckiTombo2Kugla2().click();
		gt.uplata().clear();
		gt.uplata().sendKeys("30");
		Thread.sleep(2000);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				Thread.sleep(2000);
				String title = gt.title().getText();
				if(title.contains("tombo 2 tiket"))
					log.info("G2 tiket uspesno uplacen");
				else {
					log.error("G2 tiket nije uplacen");
				}
				gt.UreduDugme().click();
		}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(2000);
		String title = gt.title().getText();
		if(title.contains("tombo 2 tiket"))
			log.info("G2 tiket uspesno uplacen");
		else {
			log.error("G2 tiket nije uplacen");
		}
		gt.UreduDugme().click();
		}
		
		//G3 tiket
//		gt.GrckiTombo3().click();
//		gt.GrckiTombo3Time().click();
		gt.GrckiTombo3Kugla1().click();
		gt.GrckiTombo3Kugla2().click();
		gt.GrckiTombo3Kugla3().click();
		Thread.sleep(2000);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				Thread.sleep(2000);
				String title1 = gt.title1().getText();
				if(title1.contains("tombo 3 tiket"))
					log.info("G3 tiket uspesno uplacen");
				else {
					log.error("G3 tiket nije uplacen");
				}
				gt.UreduDugme().click();
		}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(2000);
		String title = gt.title1().getText();
		if(title.contains("tombo 3 tiket"))
			log.info("G3 tiket uspesno uplacen");
		else {
			log.error("G3 tiket nije uplacen");
		}
		gt.UreduDugme().click();
		}
		
		//G4 tiket
//		gt.GrckiTombo4().click();
//		gt.GrckiTombo4Time().click();
		gt.GrckiTombo4Kugla1().click();
		gt.GrckiTombo4Kugla2().click();
		gt.GrckiTombo4Kugla3().click();
		gt.GrckiTombo4Kugla4().click();
		Thread.sleep(2000);
		try 		
		{
			if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(2000);
		String title2 = gt.title2().getText();
		if(title2.contains("tombo 4 tiket"))
			log.info("G4 tiket uspesno uplacen");
		else {
			log.error("G4 tiket nije uplacen");
		}
		gt.UreduDugme().click();
			}
		}
		catch(Exception e) {
			gt.uplataDugme().click();
			gt.uplataDugme2().click();
			Thread.sleep(2000);
			String title2 = gt.title2().getText();
			if(title2.contains("tombo 4 tiket"))
				log.info("G4 tiket uspesno uplacen");
			else {
				log.error("G4 tiket nije uplacen");
			}
			gt.UreduDugme().click();
			}
		
		//G5 tiket
//		gt.GrckiTombo5().click();
//		gt.GrckiTombo5Time().click();
		gt.GrckiTombo5Kugla1().click();
		gt.GrckiTombo5Kugla2().click();
		gt.GrckiTombo5Kugla3().click();
		gt.GrckiTombo5Kugla4().click();
		gt.GrckiTombo5Kugla5().click();
		Thread.sleep(2000);
		try 		
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(2000);
		String title3 = gt.title3().getText();
		if(title3.contains("tombo 5 tiket"))
			log.info("G5 tiket uspesno uplacen");
		else {
			log.error("G5 tiket nije uplacen");
		}
		gt.UreduDugme().click();
		}
		}
	catch(Exception e) {
	gt.uplataDugme().click();
	gt.uplataDugme2().click();
	Thread.sleep(2000);
	String title2 = gt.title3().getText();
	if(title2.contains("tombo 5 tiket"))
		log.info("G5 tiket uspesno uplacen");
	else {
		log.error("G5 tiket nije uplacen");
	}
	gt.UreduDugme().click();
	}
		}

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
