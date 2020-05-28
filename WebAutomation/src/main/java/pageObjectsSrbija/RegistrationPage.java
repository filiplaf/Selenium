package pageObjectsSrbija;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

		public WebDriver driver;
		By korisnickoIme = By.id("username");
		By email = By.id("email_address");
		By lozinka = By.id("password");
		By ponoviLozinku = By.id("confirm_password");
		By ime = By.id("firstName");
		By prezime = By.id("lastName");
		By kalendar = By.id("date_birth");
		By godina = By.cssSelector("div#pageWrapper span.day__month_btn.up");
		By levaStrelica = By.cssSelector("div#pageWrapper div:nth-child(4) > header > span.prev");
		By pickYear = By.xpath("//*[contains(@class,'cell year')]");
		By pickMonth = By.xpath("//*[contains(@class,'cell month')]");
		By pickDay = By.xpath("//*[contains(@class,'cell day')]");
		By promocije = By.cssSelector("div#pageWrapper div:nth-child(8) > label > span");
		By usloviKoriscenja = By.cssSelector("div#pageWrapper div:nth-child(9) > label > span");
		By otvoriNalogDugme = By.cssSelector("div#pageWrapper section > div.right > form > button[type=\"submit\"]");
		By title = By.cssSelector("div#pageWrapper div.modal__body > p");
		By ureduDugme = By.cssSelector("div#pageWrapper button[type=\"button\"]");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		public WebElement korisnickoIme() {
			return driver.findElement(korisnickoIme);
		}
		public WebElement email() {
			return driver.findElement(email);
		}
		public WebElement lozinka() {
			return driver.findElement(lozinka);
		}
		public WebElement ponoviLozinku() {
			return driver.findElement(ponoviLozinku);
		}
		public WebElement ime() {
			return driver.findElement(ime);
		}
		public WebElement prezime() {
			return driver.findElement(prezime);
		}
		public WebElement kalendar() {
			return driver.findElement(kalendar);
		}
		public WebElement godina() {
			return driver.findElement(godina);
		}
		public WebElement levaStrelica() {
			return driver.findElement(levaStrelica);
		}
		public List<WebElement> pickYear() {
			return driver.findElements(pickYear);
		}
		public List<WebElement> pickMonth() {
			return driver.findElements(pickMonth);
		}
		public List<WebElement> pickDay() {
			return driver.findElements(pickDay);
		}
		public WebElement promocije() {
			return driver.findElement(promocije);
		}
		public WebElement usloviKoriscenja() {
			return driver.findElement(usloviKoriscenja);
		}	
		public WebElement otvoriNalogDugme() {
			return driver.findElement(otvoriNalogDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
}
