package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class IsplataNaUm extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Isplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.user()).perform();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.Isplata().click();
		mr.NaUplatnoMesto().click();
		mr.Um().click();
		
		//Isplata na Beogradska UM
		mr.Beogradska().click();
		mr.Iznos().sendKeys("100");
		Thread.sleep(1000);
		mr.Isplati().click();
		mr.Iznos().clear();
		String title = mr.Title().getText();
		log.info(title);
		mr.ZatvoriDugme().click();
		
		//Isplata na Dorcol UM
		mr.Um().click();
		mr.Dorcol().click();
		mr.Iznos().sendKeys(Keys.CONTROL + "a");
		mr.Iznos().sendKeys(Keys.DELETE);
		mr.Iznos().sendKeys("200");
		Thread.sleep(1000);
		mr.Isplati().click();
		String title1 = mr.Title().getText();
		log.info(title1);
		mr.ZatvoriDugme().click();
		
		Thread.sleep(1000);
		mr.Iznos().clear();
		mr.Iznos().sendKeys(Keys.CONTROL + "a");
		mr.Iznos().sendKeys(Keys.DELETE);
		mr.Iznos().sendKeys("300");
		mr.Isplati().click();
		String title2 = mr.Title().getText();
		log.info(title2);
		mr.ZatvoriDugme().click();
		}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
