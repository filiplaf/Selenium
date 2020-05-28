package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By sports = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(1)");
		By lottoGames = By.cssSelector("#pageWrapper > div > div > header > div.header-row.nav-header > section:nth-child(1) > nav > div:nth-child(5) > a > span");
		By lotto = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(4)");
		By luckyG = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(2)");
		By virtualNav = By.cssSelector("div#pageWrapper a:nth-child(6)");
		By virtualFudbal = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(2)");
		By korisnik = By.cssSelector("div#pageWrapper input[type=\"text\"]:nth-child(1)");
		By password = By.cssSelector("div#pageWrapper input[type=\"password\"]:nth-child(2)");
		By mojRacun = By.cssSelector("div#pageWrapper div > div.flex > span");
		By login = By.cssSelector("div#pageWrapper a.login-link");
		By loginbutton = By.cssSelector("div#pageWrapper button[type=\"submit\"] > span");
		By user = By.cssSelector("div#pageWrapper div.flex.row.user-box > img");
		By userName = By.cssSelector("div#pageWrapper div > div > div.flex > div > p");
		By account = By.cssSelector("div#pageWrapper div.balance-view.more-links > div > a:nth-child(2)");
		By cookie = By.cssSelector("div#gdpr-wrapper span");
		By luckySuper6 = By.cssSelector("div#pageWrapper a:nth-child(5)");
		By live = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(2)");
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		public WebElement getRegistruj() {
			return driver.findElement(registruj);
		}
		public WebElement sports() {
			return driver.findElement(sports);
		}
		public WebElement lottoGames() {
			return driver.findElement(lottoGames);
		}
		public WebElement getlotto() {
			return driver.findElement(lotto);
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
		public WebElement getPassword() {
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
		public WebElement userName() {
			return driver.findElement(userName);
		}
		public WebElement account() {
			return driver.findElement(account);
		}
		public WebElement cookie() {
			return driver.findElement(cookie);
		}
		public WebElement luckySuper6() {
			return driver.findElement(luckySuper6);
		}
		public WebElement live() {
			return driver.findElement(live);
		}
}
