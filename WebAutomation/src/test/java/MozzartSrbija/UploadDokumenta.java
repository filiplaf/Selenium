package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import pageObjectsSrbija.PromenaPodataka;
import resources.base;

public class UploadDokumenta extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void uploadDokumenta() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		MojRacun mr = new MojRacun(driver);
		lp.userclick().click();
		lp.getMojracun().click();
		mr.promenaPodataka().click();
		PromenaPodataka pp = new PromenaPodataka(driver);
		wait_time(1);
		pp.upload().sendKeys("C:\\Git workspace\\Selenium\\WebAutomation\\PictureForTest\\picture.png");
		pp.dodajDokument().click();
		if(waitForTextToAppear(driver, "Dokumenti su uspešno poslati.", pp.title())) {
		String title = pp.title().getText();
		log.info(title);
		wait_time(1	);
		pp.ureduDugme().click();
		}
		else {
			log.info("Dokument nije uploadovan");
			pp.ureduDugme().click();
		}
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
