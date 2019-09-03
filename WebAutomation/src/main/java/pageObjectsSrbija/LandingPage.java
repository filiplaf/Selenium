package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By prijavite_se = By.cssSelector("div#pageWrapper a.login-link");
		By korisnicko_ime = By.cssSelector("div#pageWrapper input[type=\"text\"]:nth-child(2)");
		By lozinka = By.cssSelector("div#pageWrapper input[type=\"password\"]:nth-child(3)");
		By prijavite_se_dugme = By.cssSelector("div#pageWrapper button[type=\"submit\"]");
		By title = By.cssSelector("div#spa header > div.title");
		By header_navigation= By.cssSelector("#pageWrapper > header");
		By name = By.cssSelector("#pageWrapper > div > header > section:nth-child(2) > div > div.balance-view.more-links > p");
		By kladjenje = By.cssSelector("div#pageWrapper nav > div:nth-child(2) > a > span");
		By igreNaBrojeve = By.cssSelector("div#pageWrapper nav > div:nth-child(5) > a > span");
		By mojBroj = By.cssSelector("div#pageWrapper div:nth-child(5) > div > div:nth-child(1) > a > span");
		By grckiTombo = By.cssSelector("div#pageWrapper div:nth-child(5) > div > div:nth-child(2) > a > span");
		By virtualNav = By.cssSelector("div#pageWrapper div:nth-child(6) > a > span");
		By virtualFudbal = By.cssSelector("div#pageWrapper div:nth-child(6) > div > div:nth-child(2) > a > span");
		By korisnik = By.cssSelector("div#pageWrapper div.balance-view.more-links > p");
		By mojRacun = By.cssSelector("div#pageWrapper div.balance-view.more-links > div > a:nth-child(2)");
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By balans = By.cssSelector("p#nav-balance > span");
		By user = By.cssSelector("div#pageWrapper div.balance-view.more-links > p");
		By cookie = By.cssSelector("#gdpr-wrapper > div > div.accept-button");
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement getLogin() {
			return driver.findElement(prijavite_se);
		}
		public WebElement getUsername() {
			return driver.findElement(korisnicko_ime);
		}
		public WebElement getPassword() {
			return driver.findElement(lozinka);
		}
		public WebElement getButtonClick() {
			return driver.findElement(prijavite_se_dugme);
		}
		public WebElement getTitle() {
			return driver.findElement(title);
		}
		public WebElement getHeaderNavigation() {
			return driver.findElement(header_navigation);
		}
		public WebElement getnameNavigation() {
			return driver.findElement(name);
		}
		public WebElement getKladjenje() {
			return driver.findElement(kladjenje);
		}
		public WebElement getMojBroj() {
			return driver.findElement(mojBroj);
		}
		public WebElement getGrckiTombo() {
			return driver.findElement(grckiTombo);
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
		public WebElement getRegistruj() {
			return driver.findElement(registruj);
		}
		public WebElement getBalans() {
			return driver.findElement(balans);
		}
		public WebElement getUser() {
			return driver.findElement(user);
		}
		public WebElement getIgreNaBrojeve() {
			return driver.findElement(igreNaBrojeve);
		}
		public WebElement cookie() {
			return driver.findElement(cookie);
		}
}
