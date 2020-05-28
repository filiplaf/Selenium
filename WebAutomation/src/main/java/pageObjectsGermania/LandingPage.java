package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By prijavite_se = By.cssSelector("div#pageWrapper a.login-link");
		By korisnicko_ime = By.cssSelector("div#pageWrapper input[type=\"text\"]:nth-child(1)");
		By lozinka = By.cssSelector("div#pageWrapper input[type=\"password\"]:nth-child(2)");
		By prijavite_se_dugme = By.cssSelector("div#pageWrapper button[type=\"submit\"]");
		By title = By.cssSelector("div#spa header > div.title");
		By header_navigation= By.cssSelector("#pageWrapper > header");
		By name = By.cssSelector("div#pageWrapper p.regular.username");
		By kladjenje = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(1)");
		By mojBroj = By.cssSelector("div#pageWrapper div:nth-child(5) > a > span");
		By grckiTombo = By.cssSelector("div#pageWrapper div:nth-child(6) > a");
		By virtualNav = By.cssSelector("div#pageWrapper a:nth-child(5)");
		By korisnik = By.cssSelector("div#pageWrapper div.flex.row.user-box > img");
		By mojRacun = By.cssSelector("div#pageWrapper div > div.flex > span");
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By znak = By.xpath("//*[contains(@class, 'name desktop')]");
		By cookie = By.cssSelector("#gdpr-wrapper > div > div.accept-button");
		By loto = By.cssSelector("div#pageWrapper a:nth-child(4)");
		By lotoNav = By.cssSelector("div#pageWrapper div:nth-child(5) > div > div:nth-child(1) > a > span");
		By luckyG = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(2)");
		By balans = By.cssSelector("div#pageWrapper div.balances-betting > div:nth-child(2) > span:nth-child(2)");
		By kazinoBalans = By.cssSelector("div#pageWrapper div.balances-casino > div:nth-child(2) > span:nth-child(2)");
		By provjeraListica = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(1)");
		By uzivo = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(2)");
		By zaboravljenaLozinka = By.cssSelector("div#pageWrapper div.flex.row.register-part > a:nth-child(2)");
		
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
		public WebElement cookie() {
			return driver.findElement(cookie);
		}
		public WebElement loto() {
			return driver.findElement(loto);
		}
		public WebElement lotoNav() {
			return driver.findElement(lotoNav);
		}
		public WebElement luckyG() {
			return driver.findElement(luckyG);
		}
		public WebElement balans() {
			return driver.findElement(balans);
		}
		public WebElement kazinoBalans() {
			return driver.findElement(kazinoBalans);
		}
		public WebElement provjeraListica() {
			return driver.findElement(provjeraListica);
		}
		public WebElement uzivo() {
			return driver.findElement(uzivo);
		}
		public WebElement zaboravljenaLozinka() {
			return driver.findElement(zaboravljenaLozinka);
		}
}
