package pageObjectsGermania;

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
		By name = By.cssSelector("div#pageWrapper div.balance-view.more-links > p");
		By kladjenje = By.cssSelector("div#pageWrapper nav > div:nth-child(2) > a > span");
		By mojBroj = By.cssSelector("div#pageWrapper div:nth-child(5) > a > span");
		By grckiTombo = By.cssSelector("div#pageWrapper div:nth-child(6) > a");
		By virtualNav = By.cssSelector("div#pageWrapper div:nth-child(8) > a > span");
		By virtualFudbal = By.cssSelector("div#pageWrapper div:nth-child(8) > div > a:nth-child(1)");
		By korisnik = By.cssSelector("div#pageWrapper div.balance-view.more-links > p");
		By mojRacun = By.cssSelector("div#pageWrapper div.balance-view.more-links > div > a:nth-child(2)");
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By znak = By.cssSelector("article.content > a:nth-child(1) > div:nth-child(1)");
		
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
//		public WebElement getTitle() {
//			return driver.findElement(title);
//		}
//		public WebElement getHeaderNavigation() {
//			return driver.findElement(header_navigation);
//		}
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
		public WebElement znak() {
			return driver.findElement(znak);
		}
}
