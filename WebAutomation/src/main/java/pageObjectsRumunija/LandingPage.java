package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By prijavite_se = By.cssSelector("div#user-box > a.log-in");
		By korisnicko_ime = By.cssSelector("form#loginForm > input[name=\"username\"]");
		By lozinka = By.cssSelector("form#loginForm > input[name=\"password\"]");
		By prijavite_se_dugme = By.cssSelector("form#loginForm > a.button");
		By title = By.cssSelector("div#spa header > div.title");
		By header_navigation= By.cssSelector("#pageWrapper > header");
		By name = By.cssSelector("div#user-box span.new-user-name");
		By kladjenje = By.cssSelector("div#page li:nth-child(1) > a");
		By loto = By.cssSelector("div#page li:nth-child(4) > a");
		By grckiTombo = By.cssSelector("div#pageWrapper div:nth-child(6) > a");
		By virtualNav = By.cssSelector("div#pageWrapper div:nth-child(8) > a > span");
		By virtualFudbal = By.cssSelector("div#pageWrapper div:nth-child(8) > div > a:nth-child(1)");
		By korisnik = By.xpath("//*[@id=\"pageWrapper\"]/div[1]/header/section[2]/div/div[1]/p");
		By cont = By.cssSelector("div#user-box > a:nth-child(6)");
		By registruj = By.cssSelector("div#pageWrapper a.register-link");
		
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
		public WebElement loto() {
			return driver.findElement(loto);
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
}
