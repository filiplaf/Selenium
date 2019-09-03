package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By Transakcije = By.cssSelector("div#account-wrapper div:nth-child(4) > li");
		By Kalendar = By.cssSelector("div#account-wrapper input[type=\"text\"]");
		By NoTransactionTitle = By.cssSelector("#pageWrapper > div:nth-child(2) > section.account-container > div.account-container-center");
		By TransactionExist = By.cssSelector(".cell.day.highlighted");
		By ChangeData = By.cssSelector("div#account-wrapper div:nth-child(6) > li");
		By ChangePassword = By.cssSelector("div#account-wrapper div:nth-child(7) > li");
		By DocumentUpload = By.cssSelector("div#account-wrapper div:nth-child(8) > li");
		
		public MojRacun(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement Transakcije() {
			return driver.findElement(Transakcije);
		}
		public WebElement Kalendar() {
			return driver.findElement(Kalendar);
		}
		public WebElement NoTransactionTitle() {
			return driver.findElement(NoTransactionTitle);
		}
		public WebElement TransactionExist() {
			return driver.findElement(TransactionExist);
		}
		public WebElement ChangeData() {
			return driver.findElement(ChangeData);
		}
		public WebElement ChangePassword() {
			return driver.findElement(ChangePassword);
		}
		public WebElement DocumentUpload() {
			return driver.findElement(DocumentUpload);
		}		
}
