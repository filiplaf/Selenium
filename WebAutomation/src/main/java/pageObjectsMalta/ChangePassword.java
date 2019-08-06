package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePassword {

		public WebDriver driver;
		By Password = By.cssSelector("input#password");
		By NewPassword = By.cssSelector("input#new-password");
		By ConfirmPassword = By.cssSelector("input#confirm-password");
		By SaveButton = By.cssSelector("div#account-wrapper button[type=\"submit\"]");
		By Title = By.cssSelector("div#account-wrapper div.modal__body > p");
		By OkButton = By.cssSelector("div#account-wrapper button[type=\"button\"]");
		
		public ChangePassword(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement Password() {
			return driver.findElement(Password);
		}
		public WebElement NewPassword() {
			return driver.findElement(NewPassword);
		}
		public WebElement ConfirmPassword() {
			return driver.findElement(ConfirmPassword);
		}
		public WebElement SaveButton() {
			return driver.findElement(SaveButton);
		}	
		public WebElement Title() {
			return driver.findElement(Title);
		}	
		public WebElement OkButton() {
			return driver.findElement(OkButton);
		}
}
