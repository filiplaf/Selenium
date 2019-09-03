package pageObjectsGermania;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

		public WebDriver driver;
		By KorisnickoIme = By.id("username");
		By EmailAdress = By.id("email_address");
		By Lozinka = By.id("password");
		By PonovljenaLozinka = By.id("confirm_password");
		By Ime = By.id("firstName");
		By Prezime = By.id("lastName");
		By DateOfBirth = By.id("date");
		By Year = By.cssSelector("div#pageWrapper span.day__month_btn.up");
		By Year1 = By.cssSelector("div#pageWrapper span.month__year_btn.up");
		By BackArrow = By.cssSelector("div#pageWrapper div:nth-child(4) > header > span.prev");
		By PickYear = By.xpath("//*[contains(@class,'cell year')]");
		By PickMonth = By.xpath("//*[contains(@class,'cell month')]");
		By PickDay = By.xpath("//*[contains(@class,'cell day')]");
		By OIB = By.id("identityNumber");
		By Zipcode = By.cssSelector("input#postCode");
		By City = By.cssSelector("input#city");
		By Country = By.cssSelector("#pageWrapper > section > div > div.right > form > div.form__select.accent > div");
		By CountrySelection = By.xpath("//*[contains(@class,'form__select__option')]");
		By Mesto = By.id("residenceCity");
		By Adresa = By.id("residenceAddress");
		By Drzavljanstvo = By.id("citizenship");
		By Isprava = By.cssSelector("div#pageWrapper div:nth-child(13) > div > div > label:nth-child(1)");
		By BrojIsprave = By.id("documentNumber");
		By NazivIzdavatelja = By.id("documentIssuingAuthority");
		By DrzavaIzdavatelja = By.id("documentIssuingState");
		By Iban = By.id("bankAccount");
		By NazivBanke = By.id("bankName");
		By BrojTelefona = By.id("phoneNumber");
		By PolitickiIzlozen = By.cssSelector("div#pageWrapper div:nth-child(20) > div > div > label:nth-child(2)");
		By Promocije = By.cssSelector("div#pageWrapper div:nth-child(21) > label");
		By UsloviKoricenja = By.cssSelector("div#pageWrapper div:nth-child(22) > label > span");
		By OkUslovi = By.id("closeTermsOfUse");
		By RegistracijaDugme = By.cssSelector("div#pageWrapper button[type=\"submit\"]");
		By title = By.cssSelector("#pageWrapper > div.thank-you-holder > div > div > p.typ-text-secondary");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement KorisnickoIme() {
			return driver.findElement(KorisnickoIme);
		}
		public WebElement EmailAdress() {
			return driver.findElement(EmailAdress);
		}
		public WebElement Lozinka() {
			return driver.findElement(Lozinka);
		}
		public WebElement PonovljenaLozinka() {
			return driver.findElement(PonovljenaLozinka);
		}
		public WebElement Ime() {
			return driver.findElement(Ime);
		}
		public WebElement Prezime() {
			return driver.findElement(Prezime);
		}
		public WebElement DateOfBirth() {
			return driver.findElement(DateOfBirth);
		}
		public WebElement Year() {
			return driver.findElement(Year);
		}
		public WebElement Year1() {
			return driver.findElement(Year1);
		}
		public WebElement BackArrow() {
			return driver.findElement(BackArrow);
		}
		public List<WebElement> PickYear() {
			return driver.findElements(PickYear);
		}
		public List<WebElement> PickMonth() {
			return driver.findElements(PickMonth);
		}
		public List<WebElement> PickDay() {
			return driver.findElements(PickDay);
		}
		public WebElement OIB() {
			return driver.findElement(OIB);
		}
		public WebElement Country() {
			return driver.findElement(Country);
		}
		public List<WebElement> CountrySelection() {
			return driver.findElements(CountrySelection);
		}
		public WebElement Mesto() {
			return driver.findElement(Mesto);
		}
		public WebElement Adresa() {
			return driver.findElement(Adresa);
		}
		public WebElement Drzavljanstvo() {
			return driver.findElement(Drzavljanstvo);
		}
		public WebElement Isprava() {
			return driver.findElement(Isprava);
		}
		public WebElement BrojIsprave() {
			return driver.findElement(BrojIsprave);
		}
		public WebElement NazivIzdavatelja() {
			return driver.findElement(NazivIzdavatelja);
		}
		public WebElement DrzavaIzdavatelja() {
			return driver.findElement(DrzavaIzdavatelja);
		}
		public WebElement Iban() {
			return driver.findElement(Iban);
		}
		public WebElement NazivBanke() {
			return driver.findElement(NazivBanke);
		}
		public WebElement BrojTelefona() {
			return driver.findElement(BrojTelefona);
		}
		public WebElement Promocije() {
			return driver.findElement(Promocije);
		}
		public WebElement PolitickiIzlozen() {
			return driver.findElement(PolitickiIzlozen);
		}
		public WebElement UsloviKoricenja() {
			return driver.findElement(UsloviKoricenja);
		}
		public WebElement OkUslovi() {
			return driver.findElement(OkUslovi);
		}
		public WebElement RegistracijaDugme() {
			return driver.findElement(RegistracijaDugme);
		}
		public WebElement Title() {
			return driver.findElement(title);
		}
		
}
