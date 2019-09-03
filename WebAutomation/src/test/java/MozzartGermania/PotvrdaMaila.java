package MozzartGermania;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;
import MozzartGermania.Registracija;
import pageObjectsGermania.LandingPage;

public class PotvrdaMaila extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void PotvrdaMaila() throws IOException, InterruptedException {
		Thread.sleep(7000);
		driver = initializeDriver();
		driver.get(prop.getProperty("url4"));
		//Mailinator
		Registracija r = new Registracija();
		WebElement MailName = driver.findElement(By.cssSelector("input#inboxfield"));
		MailName.sendKeys(r.KorisnickoIme);
		WebElement GoButton = driver.findElement(By.cssSelector("button#go_inbox1"));
		GoButton.click();
		WebElement title = driver.findElement(By.cssSelector("div#inboxpane tr:nth-child(1) > td:nth-child(3)"));
		String Title = title.getText();
		if(Title.contains("Germania")) {
			title.click();
		}
		//Switchujemo na frame gde je text maila da bi kliknuli na link
		WebElement iframeMsg = driver.findElement(By.id("msg_body"));
		driver.switchTo().frame(iframeMsg); 
		WebElement Clicklink = driver.findElement(By.linkText("link"));
		Clicklink.click();
		Thread.sleep(5000);
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
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(r.lozinka);
	    WebElement prijavi_se = driver.findElement(By.cssSelector("#pageWrapper > section > div > div > div.modal__body > form > div.actions > button"));
	    prijavi_se.click();
		Thread.sleep(4000);
		LandingPage lp = new LandingPage(driver);
		lp.Cookie().click();
		lp.znak().click();
		String Ime = lp.getnameNavigation().getText();
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
