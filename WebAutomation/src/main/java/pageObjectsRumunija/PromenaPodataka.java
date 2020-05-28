package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromenaPodataka {

		public WebDriver driver;
		By upload = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > section > div.uploadForm__wrapper > div.left > div > input");
		By sacuvaj = By.cssSelector("div#account-wrapper button[type=\"submit\"]");
		By title = By.cssSelector("div#account-wrapper div.popup-body > p");
		By okDugme = By.cssSelector("div#account-wrapper div.popup-footer > div");
		
		public PromenaPodataka(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement upload() {
			return driver.findElement(upload);
		}
		public WebElement sacuvaj() {
			return driver.findElement(sacuvaj);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement okDugme() {
			return driver.findElement(okDugme);
		}
}
