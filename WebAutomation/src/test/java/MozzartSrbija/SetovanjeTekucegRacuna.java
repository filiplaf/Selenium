package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.PromenaPodataka;
import pageObjectsSrbija.MojRacun;
import resources.base;
public class SetovanjeTekucegRacuna extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void setovanjeTekuceg() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.userclick().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		moveToElementAndClick(mr.promenaPodataka());
		PromenaPodataka pp = new PromenaPodataka(driver);
		moveToElementAndClick(pp.brojRacuna());
		pp.brojRacuna().sendKeys("265401031000207338");
		pp.potvrdaPodataka().click();
		pp.sacuvajIzmene().click();
		log.info(pp.title().getText());
		moveToElementAndClick(pp.uredu());
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
