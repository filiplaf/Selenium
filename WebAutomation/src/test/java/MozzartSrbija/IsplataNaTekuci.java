package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class IsplataNaTekuci extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void isplataNaTekuciRacun() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,20);
		LandingPage lp = new LandingPage(driver);
		lp.userclick().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		
		moveToElementAndClick(mr.isplata());
		wait_time(1);
		mr.naTekuciRacun().click();
		mr.iznosZaTekuci().sendKeys("400");
		wait.until(ExpectedConditions.elementToBeClickable(mr.isplatiNaTekuci()));
		mr.isplatiNaTekuci().click();
		String title1 = mr.title1().getText();
		log.info(title1 + " od 400din");
		wait.until(ExpectedConditions.elementToBeClickable(mr.zatvoriDugmeTekuci()));
		mr.zatvoriDugmeTekuci().click();
		
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("500");
		wait.until(ExpectedConditions.elementToBeClickable(mr.isplatiNaTekuci()));
		mr.isplatiNaTekuci().click();
		String title2 = mr.title1().getText();
		log.info(title2 + " od 500din");
		wait.until(ExpectedConditions.elementToBeClickable(mr.zatvoriDugmeTekuci()));
		mr.zatvoriDugmeTekuci().click();
		
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("600");
		wait.until(ExpectedConditions.elementToBeClickable(mr.isplatiNaTekuci()));
		mr.isplatiNaTekuci().click();
		String title3 = mr.title1().getText();
		log.info(title3 + " od 600din");
		wait.until(ExpectedConditions.elementToBeClickable(mr.zatvoriDugmeTekuci()));
		mr.zatvoriDugmeTekuci().click();
		
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("700");
		wait.until(ExpectedConditions.elementToBeClickable(mr.isplatiNaTekuci()));
		mr.isplatiNaTekuci().click();
		String title4 = mr.title1().getText();
		log.info(title4 + " od 700din");
		wait.until(ExpectedConditions.elementToBeClickable(mr.zatvoriDugmeTekuci()));
		mr.zatvoriDugmeTekuci().click();
		
		
		mr.iznosZaTekuci().clear();
		mr.iznosZaTekuci().sendKeys("800");
		wait.until(ExpectedConditions.elementToBeClickable(mr.isplatiNaTekuci()));
		mr.isplatiNaTekuci().click();
		String title5 = mr.title1().getText();
		log.info(title5 + " od 800din");
		wait.until(ExpectedConditions.elementToBeClickable(mr.zatvoriDugmeTekuci()));
		mr.zatvoriDugmeTekuci().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
