package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LuckyG;
import pageObjectsMalta.LandingPage;
import resources.base;

public class UplataGrckiTomboTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.lottoGames()).perform();
		lp.getLuckyG().click();
		Thread.sleep(5000);
		LuckyG gt = new LuckyG(driver);
		lp.getlotto().click();
		Thread.sleep(2000);
		lp.getLuckyG().click();
		Thread.sleep(2000);
		//G2 tiket
		gt.GrckiTombo2().click();
		Thread.sleep(1000);
		gt.GrckiTombo2Kugla1().click();
		gt.GrckiTombo2Kugla2().click();
		gt.uplata().clear();
		gt.uplata().sendKeys("1");
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
				log.info(title);
				log.info("G2 tiket je uplacen");
				gt.UreduDugme().click();
		}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(2000);
		String title = gt.title().getText();
		log.info(title);
		log.info("G2 tiket je uplacen");
		}
		gt.UreduDugme().click();
		
		
		//G3 tiket
		gt.GrckiTombo3().click();
		gt.GrckiTombo3Time().click();
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
				String title1 = gt.title().getText();
				log.info(title1);
				log.info("G3 tiket je uplacen");
				gt.UreduDugme().click();
		}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		Thread.sleep(2000);
		String title1 = gt.title().getText();
		log.info(title1);
		log.info("G3 tiket je uplacen");
		gt.UreduDugme().click();
		}
		
		//G4 tiket
		gt.GrckiTombo4().click();
		gt.GrckiTombo4Time().click();
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
		String title2 = gt.title().getText();
		log.info(title2);
		log.info("G4 tiket je uplacen");
		gt.UreduDugme().click();
			}
		}
		catch(Exception e) {
			gt.uplataDugme().click();
			gt.uplataDugme2().click();
			Thread.sleep(2000);
			String title2 = gt.title().getText();
			log.info(title2);
			log.info("G4 tiket je uplacen");
			gt.UreduDugme().click();
			}
		
		//G5 tiket
		gt.GrckiTombo5().click();
		gt.GrckiTombo5Time().click();
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
		String title3 = gt.title().getText();
		log.info(title3);
		log.info("G5 tiket je uplacen");
		gt.UreduDugme().click();
		}
		}
	catch(Exception e) {
	gt.uplataDugme().click();
	gt.uplataDugme2().click();
	Thread.sleep(2000);
	String title3 = gt.title().getText();
	log.info(title3);
	log.info("G5 tiket je uplacen");
	gt.UreduDugme().click();
	}
		}

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
