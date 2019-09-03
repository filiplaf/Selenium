package MozzartMalta;

import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;
import MozzartMalta.Registracija;
import pageObjectsMalta.LandingPage;

public class PotvrdaMaila extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void PotvrdaMaila() throws InterruptedException, IOException {
		Thread.sleep(7000);
		driver = initializeDriver();
		driver.get(prop.getProperty("url6"));
		//Yomail
		Registracija r = new Registracija();
		WebElement MailName = driver.findElement(By.id("login"));
		MailName.sendKeys(r.ime);
		MailName.sendKeys(Keys.ENTER);
		//Switch na frame i klik na link
		WebElement iframeMsg = driver.findElement(By.id("ifmail"));
		driver.switchTo().frame(iframeMsg); 
		Thread.sleep(2000);
//		WebElement mail = driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/div"));
//		String text = mail.getText();
		WebElement Clicklink = driver.findElement(By.partialLinkText("activate"));
		Clicklink.click();
	
		//Switcujemo se na novi tab
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();  
			for (String handle : handles) {
				  if (!handle.equals(mainWindow)) {
				       driver.switchTo().window(handle);
				       break;
				    }
				}
	    //Logovanje i ispis korisnika
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(r.password);
		Thread.sleep(2000);
	    WebElement login = driver.findElement(By.cssSelector("div#spa button[type=\"submit\"]"));
	    login.click();
	    Thread.sleep(4000);
		LandingPage lp = new LandingPage(driver);
		lp.znak().click();
		lp.cookie().click();
		Thread.sleep(2000);
		WebElement ime = driver.findElement(By.cssSelector("div#pageWrapper div.balance-view.more-links > p"));
		String Ime = ime.getText();
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
		Thread.sleep(2000);
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
