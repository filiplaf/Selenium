package pageObjectsGermania;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

		public WebDriver driver;
		By korisnickoIme = By.id("username");
		By emailAdress = By.id("email_address");
		By lozinka = By.id("password");
		By ponovljenaLozinka = By.id("confirm_password");
		By ime = By.id("firstName");
		By prezime = By.id("lastName");
		By dateOfBirth = By.id("date");
		By year = By.cssSelector("div#pageWrapper span.day__month_btn.up");
		By year1 = By.cssSelector("div#pageWrapper span.month__year_btn.up");
		By backArrow = By.cssSelector("div#pageWrapper div:nth-child(4) > header > span.prev");
		By pickYear = By.xpath("//*[contains(@class,'cell year')]");
		By pickMonth = By.xpath("//*[contains(@class,'cell month')]");
		By pickDay = By.xpath("//*[contains(@class,'cell day')]");
		By oib = By.id("identityNumber");
		By zipcode = By.cssSelector("input#postCode");
		By city = By.cssSelector("input#city");
		By country = By.cssSelector("#pageWrapper > section > div > div.right > form > div.form__select.accent > div");
		By countrySelection = By.xpath("//*[contains(@class,'form__select__option')]");
		By mesto = By.id("residenceCity");
		By adresa = By.id("residenceAddress");
		By drzavljanstvo = By.id("citizenship");
		By isprava = By.cssSelector("div#pageWrapper div:nth-child(13) > div > div > label:nth-child(1)");
		By brojIsprave = By.id("documentNumber");
		By nazivIzdavatelja = By.id("documentIssuingAuthority");
		By drzavaIzdavatelja = By.id("documentIssuingState");
		By iban = By.id("bankAccount");
		By nazivBanke = By.id("bankName");
		By brojTelefona = By.id("phoneNumber");
		By politickiIzlozen = By.cssSelector("div#pageWrapper div:nth-child(20) > div > div > label:nth-child(2)");
		By promocije = By.cssSelector("div#pageWrapper div:nth-child(21) > label");
		By usloviKoricenja = By.cssSelector("div#pageWrapper div:nth-child(21) > label > span");
		By okUslovi = By.id("closeTermsOfUse");
		By registracijaDugme = By.cssSelector("div#pageWrapper div > div.right > form > button[type=\"submit\"]");
		By title = By.cssSelector("#pageWrapper > div.thank-you-holder > div > div.typ-texts > p.typ-text-secondary");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement korisnickoIme() {
			return driver.findElement(korisnickoIme);
		}
		public WebElement emailAdress() {
			return driver.findElement(emailAdress);
		}
		public WebElement lozinka() {
			return driver.findElement(lozinka);
		}
		public WebElement ponovljenaLozinka() {
			return driver.findElement(ponovljenaLozinka);
		}
		public WebElement ime() {
			return driver.findElement(ime);
		}
		public WebElement prezime() {
			return driver.findElement(prezime);
		}
		public WebElement dateOfBirth() {
			return driver.findElement(dateOfBirth);
		}
		public WebElement year() {
			return driver.findElement(year);
		}
		public WebElement year1() {
			return driver.findElement(year1);
		}
		public WebElement backArrow() {
			return driver.findElement(backArrow);
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
		public WebElement oib() {
			return driver.findElement(oib);
		}
		public WebElement country() {
			return driver.findElement(country);
		}
		public List<WebElement> countrySelection() {
			return driver.findElements(countrySelection);
		}
		public WebElement mesto() {
			return driver.findElement(mesto);
		}
		public WebElement adresa() {
			return driver.findElement(adresa);
		}
		public WebElement drzavljanstvo() {
			return driver.findElement(drzavljanstvo);
		}
		public WebElement isprava() {
			return driver.findElement(isprava);
		}
		public WebElement brojIsprave() {
			return driver.findElement(brojIsprave);
		}
		public WebElement nazivIzdavatelja() {
			return driver.findElement(nazivIzdavatelja);
		}
		public WebElement drzavaIzdavatelja() {
			return driver.findElement(drzavaIzdavatelja);
		}
		public WebElement iban() {
			return driver.findElement(iban);
		}
		public WebElement nazivBanke() {
			return driver.findElement(nazivBanke);
		}
		public WebElement brojTelefona() {
			return driver.findElement(brojTelefona);
		}
		public WebElement promocije() {
			return driver.findElement(promocije);
		}
		public WebElement politickiIzlozen() {
			return driver.findElement(politickiIzlozen);
		}
		public WebElement usloviKoricenja() {
			return driver.findElement(usloviKoricenja);
		}
		public WebElement okUslovi() {
			return driver.findElement(okUslovi);
		}
		public WebElement registracijaDugme() {
			return driver.findElement(registracijaDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
}
