package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeData {

		public WebDriver driver;
		By Street = By.cssSelector("input#address");
		By Zipcode = By.cssSelector("input#postCode");
		By City = By.cssSelector("input#city");
		By Phone = By.cssSelector("input#phone");
		By SaveButton = By.cssSelector("div#account-wrapper button[type=\"submit\"]");
		By OkButton = By.cssSelector("div#account-wrapper button[type=\"button\"]");
		
		public ChangeData(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement Street() {
			return driver.findElement(Street);
		}
		public WebElement Zipcode() {
			return driver.findElement(Zipcode);
		}
		public WebElement City() {
			return driver.findElement(City);
		}
		public WebElement Phone() {
			return driver.findElement(Phone);
		}
		public WebElement SaveButton() {
			return driver.findElement(SaveButton);
		}
		public WebElement OkButton() {
			return driver.findElement(OkButton);
		}
		
}
