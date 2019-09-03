package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.LotoPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void UplataGrckiLoto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.lotoJocuri()).perform();
		lp.loto().click();
		Thread.sleep(15000);
		LotoPage loto = new LotoPage(driver);
		
		//obican grcki loto tiket
		loto.GrckiLotoTime().click();
		Thread.sleep(5000);
		loto.GrckiLotoKugla1().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla2().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla3().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		Thread.sleep(2000);
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title = loto.title().getText();
			if(title.contains("Ati introdus biletul cu succes.")) {
				log.info("Grcki kino uspesno uplacen");
				log.info(title);
			}
			else {
				log.error("Grcki kino nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title = loto.title().getText();
			if(title.contains("Ati introdus biletul cu succes.")) {
				log.info("Grcki kino uspesno uplacen");
				log.info(title);
			}
			else {
				log.error("Grcki kino nije uplacen");
			}
			loto.UreduDugme().click();
		}

//		//sistemski grcki loto tiket
		Thread.sleep(1000);
		loto.GrckiLotoKugla1().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla2().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla3().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla4().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla5().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla6().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla7().click();
		Thread.sleep(1000);
		loto.GrckiLotoKugla8().click();
		Thread.sleep(1000);
		loto.sistemski().click();
		Thread.sleep(1000);
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title1 = loto.title().getText();
			if(title1.contains("Ati introdus biletul cu succes.")) {
				log.info("Sistemski Grcki kino uspesno uplacen");
				log.info(title1);
				}
			else {
				log.error("Sistemski Grcki kino nije uplacen");
			}
		}
		loto.UreduDugme().click();
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title = loto.title().getText();
			if(title.contains("Ati introdus biletul cu succes.")) {
				log.info("Sistemski Grcki kino uspesno uplacen");
				log.info(title);
			}
			else {
				log.error("Grcki kino nije uplacen");
			}
			loto.UreduDugme().click();
		}
		
		//grcki loto uplata singla(zbir brojeva veci od 20)
		Thread.sleep(1000);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,650)", "");
		loto.singligra().click();
		loto.uplataSingl().clear();
		loto.uplataSingl().sendKeys("5");
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.uplataDugmeSingl().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title2 = loto.title().getText();
			if(title2.contains("Ati introdus biletul cu succes.")) {
			log.info("Singl Grcki kino uspesno uplacen");
			log.info(title2);
			}
		else {
			log.error("Singl Grcki kino nije uplacen");
		}
		loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugmeSingl().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title2 = loto.title().getText();
			if(title2.contains("Ati introdus biletul cu succes.")) {
			log.info("Singl Grcki kino uspesno uplacen");
			log.info(title2);
			}
		else {
			log.error("Singl Grcki kino nije uplacen");
		}
		loto.UreduDugme().click();
		}

	}
	
	@Test
	public void UplataItalijanskiloto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		Thread.sleep(15000);
		LotoPage loto = new LotoPage(driver);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		
		//obican italijanski loto tiket
		jsx.executeScript("window.scrollBy(0,-650)", "");
		//loto.ItalijanskiLoto().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoTime().click();
		Thread.sleep(5000);
		loto.ItalijanskiLotoKugla1().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoKugla2().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoKugla3().click();
		try {
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title3 = loto.title().getText();
			if(title3.contains("Ati introdus biletul cu succes.")) {
				log.info("Italijanski loto uspesno uplacen");
				log.info(title3);
			}
			else {
				log.error("Italijanski loto nije uplacen");
			}
				loto.UreduDugme().click();
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title3 = loto.title().getText();
			if(title3.contains("Ati introdus biletul cu succes.")) {
				log.info("Italijanski loto uspesno uplacen");
				log.info(title3);
			}
			else {
				log.error("Italijanski loto nije uplacen");
			}
				loto.UreduDugme().click();
		}
			
//		//sistemski italijanski loto tiket
		loto.ItalijanskiLotoKugla4().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoKugla5().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoKugla6().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoKugla7().click();
		Thread.sleep(1000);
		loto.ItalijanskiLotoKugla8().click();
		Thread.sleep(1000);
		loto.sistemski().click();
		try {
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title4 = loto.title().getText();
			if(title4.contains("Ati introdus biletul cu succes.")) {
				log.info("Italijanski sistemski loto uspesno uplacen");
				log.info(title4);
			}
				else {
				log.error("Italijanski sistemski loto nije uplacen");
			}
				loto.UreduDugme().click();

		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			Thread.sleep(20000);
			String title4 = loto.title().getText();
			if(title4.contains("Ati introdus biletul cu succes.")) {
				log.info("Italijanski sistemski loto uspesno uplacen");
				log.info(title4);
			}
				else {
				log.error("Italijanski sistemski loto nije uplacen");
			}
				loto.UreduDugme().click();

		}
		}

	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
