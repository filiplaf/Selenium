package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

		public WebDriver driver;
		By Ime = By.cssSelector("div#registration-step1 div:nth-child(1) > div > div.field > div.box-fields > input");
		By Prezime = By.cssSelector("div#registration-step1 div:nth-child(2) > div > div.field > div.box-fields > input");
		By Dan = By.cssSelector("div#registration-step1 select:nth-child(1)");
		By Mesec = By.cssSelector("div#registration-step1 select:nth-child(2)");
		By Godina = By.xpath("//*[@id=\"registration-step1\"]/div[3]/div/div[2]/div[1]/div/div[1]/select[3]");
		By Email = By.cssSelector("div#registration-step1 div:nth-child(4) > div > div:nth-child(1) > div.field > div > div.box-holder > input");
		By PonoviEmail = By.cssSelector("div#registration-step1 div:nth-child(4) > div > div:nth-child(2) > div.field > div > div.box-holder > input");
		By KorisnickoIme = By.cssSelector("div#registration-step1 div:nth-child(5) > div > div.field > div.box-fields > input");
		By Lozinka = By.cssSelector("div#registration-step1 div:nth-child(6) > div > div > div:nth-child(1) > div.field > div > div.box-holder > input");
		By PonoviLozinku = By.cssSelector("div#registration-step1 div:nth-child(6) > div > div > div:nth-child(2) > div.field > div > div.box-holder > input");
		By FrameCaptcha = By.xpath("//*[@id=\"registration-step1\"]/div[7]/div[2]/div/div/div/iframe");
		By FrameCheckbox = By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark");
		By PrihvatamDugme = By.cssSelector("#gwt-uid-93");
		By OtvoriNalogDugme = By.cssSelector("div#registration-step1 div.submit-row > button[type=\"button\"]");
		By title = By.xpath("//*[contains(text(), 'aktivacioni email')]");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement Ime() {
			return driver.findElement(Ime);
		}
		public WebElement Prezime() {
			return driver.findElement(Prezime);
		}
		public WebElement Dan() {
			return driver.findElement(Dan);
		}
		public WebElement Mesec() {
			return driver.findElement(Mesec);
		}
		public WebElement Godina() {
			return driver.findElement(Godina);
		}
		public WebElement Email() {
			return driver.findElement(Email);
		}
		public WebElement PonoviEmail() {
			return driver.findElement(PonoviEmail);
		}
		public WebElement KorisnickoIme() {
			return driver.findElement(KorisnickoIme);
		}
		public WebElement Lozinka() {
			return driver.findElement(Lozinka);
		}
		public WebElement PonoviLozinku() {
			return driver.findElement(PonoviLozinku);
		}
		public WebElement FrameCaptcha() {
			return driver.findElement(FrameCaptcha);
		}
		public WebElement FrameCheckbox() {
			return driver.findElement(FrameCheckbox);
		}
		public WebElement PrihvatamDugme() {
			return driver.findElement(PrihvatamDugme);
		}
		public WebElement OtvoriNalogDugme() {
			return driver.findElement(OtvoriNalogDugme);
		}
		
		
}
