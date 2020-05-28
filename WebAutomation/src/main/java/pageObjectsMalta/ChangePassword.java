package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePassword {

		public WebDriver driver;
		By password = By.cssSelector("input#password");
		By newPassword = By.cssSelector("input#new-password");
		By confirmPassword = By.cssSelector("input#confirm-password");
		By saveButton = By.cssSelector("div#account-wrapper button[type=\"submit\"]");
		By title = By.cssSelector("div#account-wrapper div.modal__body > p");
		By okButton = By.cssSelector("div#account-wrapper button[type=\"button\"]");
		
		public ChangePassword(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement password() {
			return driver.findElement(password);
		}
		public WebElement newPassword() {
			return driver.findElement(newPassword);
		}
		public WebElement confirmPassword() {
			return driver.findElement(confirmPassword);
		}
		public WebElement saveButton() {
			return driver.findElement(saveButton);
		}	
		public WebElement title() {
			return driver.findElement(title);
		}	
		public WebElement okButton() {
			return driver.findElement(okButton);
		}
}
