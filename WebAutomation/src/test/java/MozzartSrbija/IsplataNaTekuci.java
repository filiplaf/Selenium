package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class IsplataNaTekuci extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Isplata() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.getUser()).perform();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.Isplata().click();
		mr.NaTekuciRacun().click();
		mr.IznosZaTekuci().sendKeys("400");
		Thread.sleep(1000);
		mr.IsplatiNaTekuci().click();
		String title1 = mr.Title1().getText();
		log.info(title1 + " od 400din");
		Thread.sleep(1000);
		mr.ZatvoriDugmeTekuci().click();
		
		Thread.sleep(1000);
		mr.IznosZaTekuci().clear();
		mr.IznosZaTekuci().sendKeys("500");
		Thread.sleep(1000);
		mr.IsplatiNaTekuci().click();
		String title2 = mr.Title1().getText();
		log.info(title2 + " od 500din");
		Thread.sleep(1000);
		mr.ZatvoriDugmeTekuci().click();
		
		Thread.sleep(1000);
		mr.IznosZaTekuci().clear();
		mr.IznosZaTekuci().sendKeys("600");
		Thread.sleep(1000);
		mr.IsplatiNaTekuci().click();
		String title3 = mr.Title1().getText();
		log.info(title3 + " od 600din");
		Thread.sleep(1000);
		mr.ZatvoriDugmeTekuci().click();
		
		Thread.sleep(1000);
		mr.IznosZaTekuci().clear();
		mr.IznosZaTekuci().sendKeys("700");
		Thread.sleep(1000);
		mr.IsplatiNaTekuci().click();
		String title4 = mr.Title1().getText();
		log.info(title4 + " od 700din");
		Thread.sleep(1000);
		mr.ZatvoriDugmeTekuci().click();
		
		Thread.sleep(1000);
		mr.IznosZaTekuci().clear();
		mr.IznosZaTekuci().sendKeys("800");
		Thread.sleep(1000);
		mr.IsplatiNaTekuci().click();
		String title5 = mr.Title1().getText();
		log.info(title5 + " od 800din");
		Thread.sleep(1000);
		mr.ZatvoriDugmeTekuci().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
