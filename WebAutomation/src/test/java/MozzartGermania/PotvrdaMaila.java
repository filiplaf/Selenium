package MozzartGermania;

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
import MozzartGermania.Registracija;
import pageObjectsGermania.LandingPage;

public class PotvrdaMaila extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test(priority=3)
	public void potvrdaMaila() throws IOException, InterruptedException {
		wait_time(7);
		driver = initializeDriver();
		driver.get(prop.getProperty("url6"));
		//Yomail
		Registracija r = new Registracija();
		WebElement MailName = driver.findElement(By.id("login"));
		MailName.sendKeys(r.korisnickoIme);
		MailName.sendKeys(Keys.ENTER);
		
		//Switch na frame i klik na link
		WebElement iframeMsg = driver.findElement(By.id("ifmail"));
		driver.switchTo().frame(iframeMsg); 
		wait_time(2);
		WebElement Clicklink = driver.findElement(By.xpath("//a[contains(@href,'activate')]"));
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
		//Popunjavamo polja za registraciju i prijava
		wait_time(10);
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(r.lozinka);
	    WebElement prijavi_se = driver.findElement(By.cssSelector("#pageWrapper > section > div > div > div.modal__body > form > div.actions > button"));
	    prijavi_se.click();
	    wait_time(4);
		LandingPage lp = new LandingPage(driver);
		lp.cookie().click();
		driver.navigate().refresh();
		lp.getKorisnik().click();
		String Ime = lp.getnameNavigation().getText();
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
