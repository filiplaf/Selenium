package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjectsSrbija.PredefinisanTiketPage;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class UplataPredefinisanogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test (priority=1)
	public void uplataPredefinisanogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		PredefinisanTiketPage pt = new PredefinisanTiketPage(driver);
		lp.getKladjenje().click();
		wait_time(2);
		lp.getPredefinisan().click();
		wait_time(3);
		//Ovde bi moglo napraviti petlju da proverava da li je dugme clickabilno i da onda selektuje
		//meceve sve dok dugme ne bude klikabilno. Ovako prvo selektuje 5 meceva.
		selectRandomPredefinisan(5);
		pt.uplata().click();
		pt.uplata2().click();
		takeScreenshotSerbia(name);
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", pt.title())) {
		log.info("PREDEFINISAN tiket uspesno uplacen");
		log.info(pt.title().getText());
		}	
	else {
		log.error("Tiket nije uplacen");
	}
		pt.ureduDugme().click();
		}	
	
	@Test(priority=2)
	public void uplataPredefinisanogSlucajnogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		PredefinisanTiketPage pt = new PredefinisanTiketPage(driver);
		lp.getKladjenje().click();
		wait_time(2);
		lp.getPredefinisan().click();
		wait_time(3);
		pt.slucajniOdabir().click();
		pt.uplata().click();
		pt.uplata2().click();
		takeScreenshotSerbia(name);
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", pt.title())) {
		log.info("PREDEFINISAN tiket sa slucajnim odabirom uspesno uplacen");
		log.info(pt.title().getText());
		}	
	else {
		log.error("Tiket nije uplacen");
	}
		pt.ureduDugme().click();
		}	
	
	@AfterTest()
	public void teardown() {
	driver.close();
	driver.quit();
	}
}
