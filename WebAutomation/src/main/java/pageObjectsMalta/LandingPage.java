package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By sports = By.cssSelector("div#pageWrapper nav > div:nth-child(2) > a > span");
		By myNumber = By.cssSelector("div#pageWrapper nav > div:nth-child(4) > a");
		By luckyG = By.cssSelector("div#pageWrapper nav > div:nth-child(5) > a");
		By virtualNav = By.cssSelector("div#pageWrapper nav > div:nth-child(7) > a");
		By virtualFudbal = By.cssSelector("div#pageWrapper div:nth-child(7) > div > div:nth-child(1) > a");
		By korisnik = By.cssSelector("div#pageWrapper input[type=\"text\"]:nth-child(2)");
		By password = By.cssSelector("div#pageWrapper input[type=\"password\"]:nth-child(3)");
		By mojRacun = By.cssSelector("div#pageWrapper div.balance-view.more-links > div > a:nth-child(2)");
		By znak = By.cssSelector("div#pageWrapper article > a > div");
		By login = By.cssSelector("div#pageWrapper a.login-link");
		By loginbutton = By.cssSelector("div#pageWrapper button[type=\"submit\"]");
		By user = By.cssSelector("div#pageWrapper div.balance-view.more-links > p");
		By account = By.cssSelector("div#pageWrapper div.balance-view.more-links > div > a:nth-child(2)");
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		public WebElement getRegistruj() {
			return driver.findElement(registruj);
		}
		public WebElement getSports() {
			return driver.findElement(sports);
		}
		public WebElement getMyNumber() {
			return driver.findElement(myNumber);
		}
		public WebElement getLuckyG() {
			return driver.findElement(luckyG);
		}
		public WebElement getvirtualNav() {
			return driver.findElement(virtualNav);
		}
		public WebElement getvirtualFudbal() {
			return driver.findElement(virtualFudbal);
		}
		public WebElement getKorisnik() {
			return driver.findElement(korisnik);
		}
		public WebElement getMojracun() {
			return driver.findElement(mojRacun);
		}
		public WebElement znak() {
			return driver.findElement(znak);
		}
		public WebElement getpassword() {
			return driver.findElement(password);
		}
		public WebElement login() {
			return driver.findElement(login);
		}
		public WebElement loginbutton() {
			return driver.findElement(loginbutton);
		}
		public WebElement user() {
			return driver.findElement(user);
		}
		public WebElement account() {
			return driver.findElement(account);
		}
		
		
}
