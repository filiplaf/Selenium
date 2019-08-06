package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By Isplata = By.cssSelector("li#pay-out > a");
		By NaUplatnoMesto = By.cssSelector("div#profile-wrapper div:nth-child(3) > div:nth-child(4) > div.pay-info-header");
		By NaSkrillRacun = By.cssSelector("div#profile-wrapper div:nth-child(3) > div:nth-child(5) > div.pay-info-header");
		By UplatnoMesto = By.cssSelector("span#account-businessunits-select-button > span.ui-selectmenu-text");
		By Iznos = By.cssSelector("input#pay-input");
		By IznosZaSkrill = By.cssSelector("input[name=\"skrill-moneybookers-payout-amount\"]");
		By MailZaTekuci = By.cssSelector("input[name=\"skrill-moneybookers-payout-email\"]");
		By Isplati = By.id("pay-button");
		By IsplatiNaSkrill = By.id("skrill-moneybookers-payout-button");
		By Um = By.cssSelector("span#account-businessunits-select-button > span.ui-selectmenu-text");
		By Bucurest = By.xpath("//*[contains(text(), 'Bucuresti')]");
		By Potvrdi = By.id("button-confirm");
		By Title = By.cssSelector("#popup-holder > div.balance-info-popup > div.balance-info.true > p");
		By ZatvoriDugme = By.cssSelector("div#popup-holder button.button.ok");
		By VerifikacijaDugme = By.cssSelector("#gdpr-wrapper > div > div");
		By Transakcije = By.cssSelector("li#transactions > a");
		By TransakcijeTitle = By.cssSelector("#profile-wrapper > div:nth-child(4) > div.transactions-body-wrapper");
		
		public MojRacun(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement Isplata() {
			return driver.findElement(Isplata);
		}
		public WebElement NaUplatnoMesto() {
			return driver.findElement(NaUplatnoMesto);
		}
		public WebElement NaSkrillRacun() {
			return driver.findElement(NaSkrillRacun);
		}
		public WebElement UplatnoMesto() {
			return driver.findElement(UplatnoMesto);
		}
		public WebElement Iznos() {
			return driver.findElement(Iznos);
		}
		public WebElement IznosZaSkrill() {
			return driver.findElement(IznosZaSkrill);
		}
		public WebElement Isplati() {
			return driver.findElement(Isplati);
		}
		public WebElement IsplatiNaSkrill() {
			return driver.findElement(IsplatiNaSkrill);
		}
		public WebElement MailZaTekuci() {
			return driver.findElement(MailZaTekuci);
		}
		public WebElement Um() {
			return driver.findElement(Um);
		}
		public WebElement Bucurest() {
			return driver.findElement(Bucurest);
		}
		public WebElement Title() {
			return driver.findElement(Title);
		}
		public WebElement ZatvoriDugme() {
			return driver.findElement(ZatvoriDugme);
		}
		public WebElement Potvrdi() {
			return driver.findElement(Potvrdi);
		}
		public WebElement VerifikacijaDugme() {
			return driver.findElement(VerifikacijaDugme);
		}
		public WebElement Transakcije() {
			return driver.findElement(Transakcije);
		}
		public WebElement TransakcijeTitle() {
			return driver.findElement(TransakcijeTitle);
		}
		
}
