package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.PromenaPodataka;
import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class PromenaKorisnickihPodataka extends base{
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void promenaPodataka() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.userclick().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.promenaPodataka().click();
		wait_time(1);
		PromenaPodataka pp = new PromenaPodataka(driver);
		pp.brojLicneKarte().clear();
		pp.brojLicneKarte().sendKeys("123456");
		pp.brojRacuna().clear();
		pp.brojRacuna().sendKeys("265-4010310002073-38");
		pp.sacuvajIzmene().click();
		takeScreenshotSerbia(name);
		if(waitForTextToAppear(driver, "Uspešno ste promenili svoje podatke.", pp.title())) {
			log.info(pp.title().getText());
		}
		else {log.info("Greska");}
		pp.uredu().click();
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
