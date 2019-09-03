package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.GrckiTomboPage;
import pageObjectsGermania.LandingPage;
import resources.base;

public class UplataLuckyGTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.Loto()).perform();
		Thread.sleep(1000);
		lp.LuckyG().click();
		Thread.sleep(2000);
		lp.Loto().click();
		Thread.sleep(2000);
		lp.LuckyG().click();
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		
		//G2 tiket;
		gt.GrckiTombo2Kugla1().click();
		gt.GrckiTombo2Kugla2().click();
		gt.uplata().clear();
		gt.uplata().sendKeys("10");
		Thread.sleep(1000);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				Thread.sleep(10000);
				String title = gt.title().getText();
				if(title.contains("Stanje novca")) {
					log.info("G2 tiket uspesno uplacen");
					log.info(title);
				}
				else {
					log.error("G2 tiket nije uplacen");
				}
				gt.UreduDugme().click();
		}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(10000);
		String title = gt.title().getText();
		if(title.contains("Stanje novca")) {
			log.info("G2 tiket uspesno uplacen");
			log.info(title);
		}
		else {
			log.error("G2 tiket nije uplacen");
		}
		gt.UreduDugme().click();
		}
		
		//G3 tiket
		gt.GrckiTombo3Kugla1().click();
		gt.GrckiTombo3Kugla2().click();
		gt.GrckiTombo3Kugla3().click();
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				Thread.sleep(10000);
				String title = gt.title().getText();
				if(title.contains("Stanje novca")) {
					log.info("G3 tiket uspesno uplacen");
					log.info(title);
				}
				else {
					log.error("G3 tiket nije uplacen");
				}
				gt.UreduDugme().click();
		}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(10000);
		String title = gt.title().getText();
		if(title.contains("Stanje novca")) {
			log.info("G3 tiket uspesno uplacen");
			log.info(title);
		}
		else {
			log.error("G3 tiket nije uplacen");
		}
		gt.UreduDugme().click();
		}
		
		//G4 tiket
		gt.GrckiTombo4Kugla1().click();
		gt.GrckiTombo4Kugla2().click();
		gt.GrckiTombo4Kugla3().click();
		gt.GrckiTombo4Kugla4().click();
		try 		
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(10000);
		String title = gt.title().getText();
		if(title.contains("Stanje novca")) {
			log.info("G4 tiket uspesno uplacen");
			log.info(title);
		}
		else {
			log.error("G4 tiket nije uplacen");
		}
		gt.UreduDugme().click();
			}
		}
		catch(Exception e) {
			gt.uplataDugme().click();
			gt.uplataDugme2().click();
			Thread.sleep(10000);
			String title = gt.title().getText();
			if(title.contains("Stanje novca")) {
				log.info("G4 tiket uspesno uplacen");
				log.info(title);
			}
			else {
				log.error("G4 tiket nije uplacen");
			}
			gt.UreduDugme().click();
			}
		
		//G5 tiket
		gt.GrckiTombo5Kugla1().click();
		gt.GrckiTombo5Kugla2().click();
		gt.GrckiTombo5Kugla3().click();
		gt.GrckiTombo5Kugla4().click();
		gt.GrckiTombo5Kugla5().click();
		try 		
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(10000);
		String title = gt.title().getText();
		if(title.contains("Stanje novca")) {
			log.info("G5 tiket uspesno uplacen");
			log.info(title);
		}
		else {
			log.error("G5 tiket nije uplacen");
		}
		gt.UreduDugme().click();
		}
		}
	catch(Exception e) {
	gt.uplataDugme().click();
	gt.uplataDugme2().click();
	Thread.sleep(10000);
	String title = gt.title().getText();
	if(title.contains("Stanje novca")) {
		log.info("G5 tiket uspesno uplacen");
		log.info(title);
	}
	else {
		log.error("G5 tiket nije uplacen");
	}
	gt.UreduDugme().click();
	}
		}

	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
