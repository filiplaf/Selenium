package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.LotoPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void UplataGrckiloto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getMojBroj().click();
		Thread.sleep(1000);
		LotoPage loto = new LotoPage(driver);
		
		//obican grcki loto tiket
		loto.GrckiLotoTime().click();
		loto.GrckiLotoKugla1().click();
		loto.GrckiLotoKugla2().click();
		loto.GrckiLotoKugla3().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title = loto.title().getText();
		if(title.contains("Moj broj | GRCKI KINO (20/80)"))
			log.info("Grcki kino uspesno uplacen");
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
		Thread.sleep(2000);
		String title2 = loto.title().getText();
		if(title2.contains("Moj broj | GRCKI KINO (20/80)"))
			log.info("Grcki sistemski kino uspesno uplacen");
		else {
			log.error("Grcki sistemski kino nije uplacen");
		}
		loto.UreduDugme().click();
		
		//grcki loto uplata singla(zbir brojeva veci od 20)
		loto.zbir().click();
		Thread.sleep(1000);
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		Thread.sleep(1000);
		loto.uplataSingl().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title3 = loto.title().getText();
		if(title3.contains("Moj broj | GRCKI KINO (20/80)"))
			log.info("Grcki kino singl zbir veci od 20 uspesno uplacen");
		else {
			log.error("Grcki kino singl zbir veci od 20 uspesno uplacen");
		}
		loto.UreduDugme().click();
		}
		
		@Test
		public void UplataItalijanskiloto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getMojBroj().click();
		Thread.sleep(1000);
		LotoPage loto = new LotoPage(driver);
		
		//obican italijanski loto tiket
		loto.ItalijanskiLotoTime().click();
		loto.ItalijanskiLotoKugla1().click();
		loto.ItalijanskiLotoKugla2().click();
		loto.ItalijanskiLotoKugla3().click();;
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title4 = loto.title2().getText();
		if(title4.contains("Moj broj | ITALIJANSKI"))
			log.info("Italijanski kino uspesno uplacen");
		else {
			log.error("Italijanski kino nije uplacen");
		}
		loto.UreduDugme().click();
		//sistemski italijanski loto tiket
		loto.ItalijanskiLotoKugla1().click();
		loto.ItalijanskiLotoKugla2().click();
		loto.ItalijanskiLotoKugla3().click();
		loto.sistemski().click();
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title5 = loto.title2().getText();
		if(title5.contains("Moj broj | ITALIJANSKI"))
			log.info("Italijanski sistemski kino uspesno uplacen");
		else {
			log.info("Italijanski sistemski kino nije uplacen");
		}
		loto.UreduDugme().click();
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
