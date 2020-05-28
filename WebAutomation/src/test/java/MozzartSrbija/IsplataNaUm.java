package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class IsplataNaUm extends base{
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void isplataNaUplatnoMesto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.userclick().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		moveToElementAndClick(mr.isplata());
		mr.isplata().click();
		mr.naUplatnoMesto().click();
		mr.um().click();
		
		//Isplata na Beogradska UM
		mr.beogradska().click();
		mr.iznos().sendKeys("100");
		mr.iznos().clear();
		moveToElementAndClick(mr.isplati());
		String title = mr.title().getText();
		log.info(title);
		mr.zatvoriDugme().click();
		
		//Isplata na Dorcol UM
		mr.um().click();
		mr.dorcol().click();
		mr.iznos().sendKeys(Keys.CONTROL + "a");
		mr.iznos().sendKeys(Keys.DELETE);
		mr.iznos().sendKeys("200");
		moveToElementAndClick(mr.isplati());
		waitForElementToBeVisible(driver, mr.title(), 10);
		String title1 = mr.title().getText();
		log.info(title1);
		mr.zatvoriDugme().click();
		
		mr.iznos().clear();
		mr.iznos().sendKeys(Keys.CONTROL + "a");
		mr.iznos().sendKeys(Keys.DELETE);
		mr.iznos().sendKeys("300");
		mr.isplati().click();
		String title2 = mr.title().getText();
		log.info(title2);
		mr.zatvoriDugme().click();
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
