package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SafechargePage {

		public WebDriver driver;
		By cardholder = By.cssSelector("input#cc_name_on_card");
		By cardNumber = By.cssSelector("input#cc_card_number");
		By day = By.id("cc_exp_month");
		By year = By.id("cc_exp_year");
		By cvv = By.id("cc_cvv2");
		By depositButton = By.id("continueButton");
		By title = By.cssSelector("div#pageWrapper div.modal__body > p");
		By okButton = By.cssSelector("div#pageWrapper button[type=\"button\"]");
		
		public SafechargePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement cardholder() {
			return driver.findElement(cardholder);
		}
		public WebElement cardNumber() {
			return driver.findElement(cardNumber);
		}
		public WebElement day() {
			return driver.findElement(day);
		}
		public WebElement year() {
			return driver.findElement(year);
		}
		public WebElement cvv() {
			return driver.findElement(cvv);
		}
		public WebElement depositButton() {
			return driver.findElement(depositButton);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement okButton() {
			return driver.findElement(okButton);
		}
}
