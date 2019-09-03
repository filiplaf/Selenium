package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.LotoPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void UplataGrckiloto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.Loto()).perform();
		lp.LotoNav().click();
		Thread.sleep(1000);
		LotoPage loto = new LotoPage(driver);
		
		//obican grcki loto tiket
		loto.GrckiLotoTime().click();
		loto.GrckiLotoKugla1().click();
		loto.GrckiLotoKugla2().click();
		loto.GrckiLotoKugla3().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(7000);
		String title = loto.title().getText();
		if(title.contains("Stanje novca")) {
			log.info("Grcki kino uspesno uplacen");
			log.info(title);
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.UreduDugme().click();
		
		//sistemski grcki loto tiket
		loto.GrckiLotoKugla1().click();
		loto.GrckiLotoKugla2().click();
		loto.GrckiLotoKugla3().click();
		loto.sistemski().click();
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(7000);
		String title1 = loto.title().getText();
		if(title1.contains("Stanje novca")) {
			log.info("Grcki sistemski kino uspesno uplacen");
			log.info(title1);
		}
		else {
			log.error("Grcki sistemski kino nije uplacen");
		}
		loto.UreduDugme().click();
		
		//grcki loto uplata singla(zbir brojeva veci od 20)
		loto.zbir().click();
		Thread.sleep(1000);
		loto.uplata().clear();
		loto.uplata().sendKeys("10");
		Thread.sleep(1000);
		loto.uplataSingl().click();
		loto.uplataDugme2().click();
		Thread.sleep(7000);
		String title2 = loto.title().getText();
		if(title2.contains("Stanje novca")) {
			log.info("Grcki kino singl zbir veci od 20 uspesno uplacen");
			log.info(title2);
		}
		else {
			log.error("Grcki kino singl zbir veci od 20 nije uplacen");
		}
		loto.UreduDugme().click();
		}
		
//		@Test
//		public void UplataItalijanskiloto() throws IOException, InterruptedException {
//		LandingPage lp = new LandingPage(driver);
//		lp.getMojBroj().click();
//		Thread.sleep(1000);
//		LotoPage loto = new LotoPage(driver);
//		
//		//obican italijanski loto tiket
//		loto.ItalijanskiLotoTime().click();
//		loto.ItalijanskiLotoKugla1().click();
//		loto.ItalijanskiLotoKugla2().click();
//		loto.ItalijanskiLotoKugla3().click();;
//		loto.uplataDugme().click();
//		loto.uplataDugme2().click();
//		Thread.sleep(2000);
//		String title4 = loto.title2().getText();
//		if(title4.contains("Moj broj | ITALIJANSKI"))
//			log.info("Italijanski kino uspesno uplacen");
//		else {
//			log.error("Italijanski kino nije uplacen");
//		}
//		loto.UreduDugme().click();
//		//sistemski italijanski loto tiket
//		loto.ItalijanskiLotoKugla1().click();
//		loto.ItalijanskiLotoKugla2().click();
//		loto.ItalijanskiLotoKugla3().click();
//		loto.sistemski().click();
//		loto.uplataDugme().click();
//		loto.uplataDugme2().click();
//		Thread.sleep(2000);
//		String title5 = loto.title2().getText();
//		if(title5.contains("Moj broj | ITALIJANSKI"))
//			log.info("Italijanski sistemski kino uspesno uplacen");
//		else {
//			log.info("Italijanski sistemski kino nije uplacen");
//		}
//		loto.UreduDugme().click();
//		}
		
//	@AfterTest(alwaysRun = true)
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}

}
