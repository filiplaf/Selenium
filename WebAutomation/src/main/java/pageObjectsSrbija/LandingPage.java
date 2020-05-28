package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By popUpClose = By.cssSelector("div#pageWrapper div.modal__header > a");
		By prijavite_se = By.cssSelector("div#pageWrapper a.login-link");
		By korisnicko_ime = By.cssSelector("div#pageWrapper input[type=\"text\"]:nth-child(1)");
		By lozinka = By.cssSelector("div#pageWrapper input[type=\"password\"]:nth-child(2)");
		By prijavite_se_dugme = By.cssSelector("div#pageWrapper button[type=\"submit\"] > span");
		By title = By.cssSelector("div#spa header > div.title");
		By header_navigation= By.cssSelector("#pageWrapper > header");
		By name = By.cssSelector("#pageWrapper > div > header > section:nth-child(2) > div > div.balance-view.more-links > p");
		By kladjenje = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(1)");
		By igreNaBrojeve = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(4)");
		By mojBroj = By.cssSelector("div#pageWrapper div:nth-child(5) > div > div:nth-child(1) > a > span");
		By grckiTombo = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(2)");
		By virtualNav = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(6)");
		By virtualFudbal = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(2)");
		By luckySuper6 = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(5)");
		By korisnik = By.cssSelector("div#pageWrapper div.balance-view.more-links > p");
		By mojRacun = By.cssSelector("div#pageWrapper div > div.flex > span");
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By balans = By.cssSelector("div#pageWrapper div.balances-betting > div:nth-child(2) > span:nth-child(2)");
		By kazinoBalans = By.cssSelector("div#pageWrapper div.balances-casino > div:nth-child(2) > span:nth-child(2)");
		By userclick = By.cssSelector("div#pageWrapper div.flex.row.user-box > p");
		By username = By.cssSelector("div#pageWrapper div > div > div.flex > div > p");
		By cookie = By.cssSelector("#gdpr-wrapper > div > div.accept-button");
		By zaboravljenaLozinka = By.cssSelector("div#pageWrapper div.flex.row.register-part > a:nth-child(2)");
		By statusTiketa = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(1)");
		By zapocniKladjenje = By.cssSelector("div#pageWrapper p.helper-link.activate > span");
		By uzivo = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(2)");
		By predefinisan = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(2)");
		By kazino = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(3)");
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement popUpClose() {
			return driver.findElement(popUpClose);
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
		public WebElement uzivo() {
			return driver.findElement(uzivo);
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
		public WebElement luckySuper6() {
			return driver.findElement(luckySuper6);
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
		public WebElement getKazinoBalans() {
			return driver.findElement(kazinoBalans);
		}
		public WebElement getUser() {
			return driver.findElement(username);
		}
		public WebElement userclick() {
			return driver.findElement(userclick);
		}
		public WebElement getIgreNaBrojeve() {
			return driver.findElement(igreNaBrojeve);
		}
		public WebElement cookie() {
			return driver.findElement(cookie);
		}
		public WebElement zaboravljenaLozinka() {
			return driver.findElement(zaboravljenaLozinka);
		}
		public WebElement statusTiketa() {
			return driver.findElement(statusTiketa);
		}
		public WebElement zapocniKladjenje() {
			return driver.findElement(zapocniKladjenje);
		}
		public WebElement getPredefinisan() {
			return driver.findElement(predefinisan);
		}
		public WebElement getKazino() {
			return driver.findElement(kazino);
		}
		
}
