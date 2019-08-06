package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.MyNumber;
import pageObjectsMalta.LandingPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getMyNumber().click();
		Thread.sleep(1000);
		MyNumber loto = new MyNumber(driver);
		
		//obican grcki loto tiket
		loto.GrckiLotoTime().click();
		loto.GrckiLotoKugla1().click();
		loto.GrckiLotoKugla2().click();
		loto.GrckiLotoKugla3().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("1");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title = loto.title3().getText();
		log.info(title);
		log.info("Grcki kino tiket uspesno uplacen");
		loto.UreduDugme().click();
		
//		//sistemski grcki loto tiket
		loto.GrckiLotoKugla1().click();
		loto.GrckiLotoKugla2().click();
		loto.GrckiLotoKugla3().click();
		loto.sistemski().click();
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title1 = loto.title3().getText();
		log.info(title1);
		log.info("Grcki kino sistemski tiket uspesno uplacen");
		loto.UreduDugme().click();
		
//		//grcki loto uplata singla(zbir brojeva veci od 20)
		loto.zbir().click();
		Thread.sleep(1000);
		loto.uplataSingl().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title2 = loto.title3().getText();
		log.info(title2);
		log.info("Grcki kino singl tiket uspesno uplacen");
		loto.UreduDugme().click();
	
//		//obican italijanski loto tiket
		loto.ItalijanskiLotoTime().click();
		loto.ItalijanskiLotoKugla1().click();
		loto.ItalijanskiLotoKugla2().click();
		loto.ItalijanskiLotoKugla3().click();;
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title3 = loto.title3().getText();
		log.info(title3);
		log.info("Italijanski loto tiket uspesno uplacen");
		loto.UreduDugme().click();

//		//sistemski italijanski loto tiket
		loto.ItalijanskiLotoKugla1().click();
		loto.ItalijanskiLotoKugla2().click();
		loto.ItalijanskiLotoKugla3().click();
		loto.sistemski().click();
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		Thread.sleep(2000);
		String title4 = loto.title3().getText();
		log.info(title4);
		log.info("Italijanski sistemski loto tiket uspesno uplacen");
		loto.UreduDugme().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
