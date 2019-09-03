package MozzartSrbija;
import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.PromenaPodataka;
import pageObjectsSrbija.MojRacun;
import resources.base;
public class SetovanjeTekucegRacuna extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Setovanje() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getUser()).perform();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.PromenaPodataka().click();
		PromenaPodataka pp = new PromenaPodataka(driver);
		Thread.sleep(2000);
		pp.BrojRacuna().sendKeys("265401031000207338");
		pp.SacuvajIzmene().click();
		log.info(pp.Title().getText());
		pp.UreduDugme().click();
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
