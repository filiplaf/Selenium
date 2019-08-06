package MozzartMalta;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;
import MozzartMalta.Registracija;

public class PotvrdaMaila extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void PotvrdaMaila() throws InterruptedException, IOException {
		Thread.sleep(7000);
		driver = initializeDriver();
		driver.get(prop.getProperty("url4"));
		
		Registracija r = new Registracija();
		WebElement MailName = driver.findElement(By.cssSelector("input#inboxfield"));
		MailName.sendKeys(r.ime);
		WebElement GoButton = driver.findElement(By.cssSelector("header#header-1 div.hidden-sm.hidden-xs > div > span > button[type=\"button\"]"));
		GoButton.click();
		WebElement title = driver.findElement(By.cssSelector("#inboxpane > div > div > div > table"));
		String Title = title.getText();
		if(Title.contains("MozzartBet")) {
			title.click();
		}
		
		WebElement iframeMsg = driver.findElement(By.id("msg_body"));
		driver.switchTo().frame(iframeMsg); 
		Thread.sleep(1000);
		WebElement mail = driver.findElement(By.xpath("/html/body"));
		String text = mail.getText();
		System.out.println(text);
		String link = text.substring(text.indexOf("link")+4,text.indexOf("to")).trim();
		System.out.println(link);
	
		((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    //zatvaramo prvi tab
	    driver.switchTo().window(tabs.get(0));
	    driver.close();
	    //nastavljamo registaciju
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(500);
	    driver.get("http://" + link);
	    
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(r.password);
		Thread.sleep(4000);
	    WebElement login = driver.findElement(By.cssSelector("div#spa button[type=\"submit\"]"));
	    login.click();
	    Thread.sleep(6000);
//	    login.click();
	    
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
