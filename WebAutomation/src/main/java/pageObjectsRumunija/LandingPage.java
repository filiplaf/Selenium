package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By korisnicko_ime = By.cssSelector("div#pageWrapper input[type=\"text\"]:nth-child(1)");
		By lozinka = By.cssSelector("div#pageWrapper input[type=\"password\"]:nth-child(2)");
		By prijavite_se_dugme = By.cssSelector("div#pageWrapper button[type=\"submit\"] > span");
		By title = By.cssSelector("div#spa header > div.title");
		By header_navigation= By.cssSelector("#pageWrapper > header");
		By kladjenje = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(1)");
		By lotoJocuri = By.cssSelector("div#pageWrapper nav > div:nth-child(4) > a > span");
		By loto = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(4)");
		By uzivo = By.cssSelector("div#pageWrapper article.nav-group.h100 > a:nth-child(2)");
		By grckiTombo = By.cssSelector("div#pageWrapper div:nth-child(6) > a");
		By virtualNav = By.cssSelector("div#pageWrapper a:nth-child(6)");
		By virtualFudbal = By.cssSelector("div#pageWrapper div:nth-child(8) > div > a:nth-child(1)");
		By korisnik = By.cssSelector("div#pageWrapper p.regular.username");
		By cont = By.cssSelector("div#pageWrapper div.user-details-header > div > div > div > span");
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		By znak = By.cssSelector("div#pageWrapper article > a > div");
		By cookie = By.cssSelector("#gdpr-wrapper > div > div.accept-button > span");
		By balans = By.cssSelector("div#pageWrapper div.user-details-body > div > div > div:nth-child(5) > span:nth-child(2)");
		By kazinoBalans = By.cssSelector("div#pageWrapper div.balances-casino > div:nth-child(2) > span:nth-child(2)");
		By zapocniKladjenje = By.cssSelector("div#pageWrapper p.helper-link.activate > span");
		By statusTiketa = By.cssSelector("div#pageWrapper section.nav-bottom > article:nth-child(2) > a:nth-child(1)");
		By user = By.cssSelector("div#pageWrapper div.flex.row.user-box > img");
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
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
		public WebElement getKladjenje() {
			return driver.findElement(kladjenje);
		}
		public WebElement lotoJocuri() {
			return driver.findElement(lotoJocuri);
		}
		public WebElement loto() {
			return driver.findElement(loto);
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
		public WebElement getKorisnik() {
			return driver.findElement(korisnik);
		}
		public WebElement getCont() {
			return driver.findElement(cont);
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
		public WebElement balans() { 
			return driver.findElement(balans);
		}
		public WebElement kazinoBalans() { 
			return driver.findElement(kazinoBalans);
		}
		public WebElement zapocniKladjenje() { 
			return driver.findElement(zapocniKladjenje);
		}
		public WebElement statusTiketa() { 
			return driver.findElement(statusTiketa);
		}
		public WebElement user() { 
			return driver.findElement(user);
		}
}
 