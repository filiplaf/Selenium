package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocumentUpload {

		public WebDriver driver;
		By Upload = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > section > div.uploadForm__wrapper > div.left > div > input");
		By UploadButton = By.cssSelector("div#account-wrapper button[type=\"submit\"]");
		By OkButton = By.cssSelector("div#account-wrapper div.popup-footer > div");
		
		public DocumentUpload(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement Upload() {
			return driver.findElement(Upload);
		}
		public WebElement UploadButton() {
			return driver.findElement(UploadButton);
		}
		public WebElement OkButton() {
			return driver.findElement(OkButton);
		}
}
