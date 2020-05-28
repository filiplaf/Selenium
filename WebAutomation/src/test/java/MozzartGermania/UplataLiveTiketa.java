package MozzartGermania;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pageObjectsGermania.LandingPage;
import pageObjectsGermania.UzivoPage;
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
		selectRandomLiveMatchGermania(1);
		up.uplata().sendKeys(Keys.chord(Keys.CONTROL, "a"), "3");
		up.uplatiTiketDugme().click();
		wait_time(1);
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", up.title())) {
			takeScreenshotGermania(name);
			log.info("SINGL tiket uspesno uplacen");
			log.info(up.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
			log.info(up.title().getText());
		}
		up.ureduDugme().click();
	}
}
