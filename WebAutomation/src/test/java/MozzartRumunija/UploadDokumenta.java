package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import pageObjectsRumunija.PromenaPodataka;
import resources.base;

public class UploadDokumenta extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void uploadDokumenta() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		moveToElementAndClick(lp.getKorisnik());
		MojRacun mr = new MojRacun(driver);
		mr.incarcare_document().click();
		PromenaPodataka pp = new PromenaPodataka(driver);
		pp.upload().sendKeys("C:\\Git workspace\\Selenium\\WebAutomation\\PictureForTest\\picture.png");
		pp.sacuvaj().click();
		if(waitForTextToAppear(driver, "Documentul dumneavoastra a fost încărcat cu succes.", pp.title())) {
		String title = pp.title().getText();
		log.info(title);
		log.info("Dokument uspesno uploadovan");
		wait_time(2);
		pp.okDugme().click();
		}
		else {
			log.info("Dokument nije uploadovan");
			pp.okDugme().click();
		}
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
