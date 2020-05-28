package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.UzivoPage;
import resources.base;

public class UplataLiveTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void uplataLivebetTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		UzivoPage up = new UzivoPage(driver);
		lp.uzivo().click();
		wait_time(1);
		selectRandomLiveMatchSerbia(1);
		up.uplata().sendKeys(Keys.chord(Keys.CONTROL, "a"), "100");
		up.uplatiTiketDugme().click();
		wait_time(1);
		takeScreenshotSerbia(name);
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", up.title())) {
			log.info("SINGL tiket uspesno uplacen");
			log.info(up.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
			log.info(up.title().getText());
		}
		up.ureduDugme().click();
	}
	
	@Test
	public void uplataLivebetTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		UzivoPage up = new UzivoPage(driver);
		lp.uzivo().click();
		wait_time(1);
		selectRandomLiveMatchSerbia(2);
		up.uplata().sendKeys(Keys.chord(Keys.CONTROL, "a"), "100");
		up.uplatiTiketDugme().click();
		wait_time(1);
		takeScreenshotSerbia(name);
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", up.title())) {
			log.info("Tiket od DVA para uspesno uplacen");
			log.info(up.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
			log.info(up.title().getText());
		}
		up.ureduDugme().click();
	}
	
}
