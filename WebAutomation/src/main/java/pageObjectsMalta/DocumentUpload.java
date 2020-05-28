package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocumentUpload {

		public WebDriver driver;
		By upload = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > section > div.uploadForm__wrapper > div.left > div > input");
		By uploadButton = By.cssSelector("div#account-wrapper button[type=\"submit\"]");
		By okButton = By.cssSelector("div#account-wrapper div.popup-footer > div");
		By title = By.cssSelector("div#account-wrapper div.popup-body > p");
		
		public DocumentUpload(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement upload() {
			return driver.findElement(upload);
		}
		public WebElement uploadButton() {
			return driver.findElement(uploadButton);
		}
		public WebElement okButton() {
			return driver.findElement(okButton);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
}
