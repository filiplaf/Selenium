package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By Isplata = By.cssSelector("div#account-wrapper div:nth-child(3) > li");
		By NaUplatnoMesto = By.cssSelector("section#mozzart div.table-row > div:nth-child(1)");
		By NaSkrillRacun = By.cssSelector("section#skrill-ro div.table-row > div:nth-child(1)");
		By UplatnoMesto = By.cssSelector("section#mozzart i");
		By Iznos = By.cssSelector("section#mozzart input[type=\"text\"]");
		By IznosZaSkrill = By.cssSelector("section#skrill-ro div:nth-child(1) > input[type=\"text\"]");
		By MailZaTekuci = By.cssSelector("section#skrill-ro div:nth-child(2) > input[type=\"text\"]");
		By Isplati = By.id("pay-btn-mozzart");
		By IsplatiNaSkrill = By.id("pay-btn-skrill-ro");
		By Um = By.cssSelector("span#account-businessunits-select-button > span.ui-selectmenu-text");
		By Bucurest = By.xpath("//*[contains(text(), 'Bucuresti-2')]");
		By Potvrdi = By.cssSelector("div#account-wrapper div.close-popup");
		By Title = By.cssSelector("#popup-holder > div.balance-info-popup > div.balance-info.true > p");
		By ZatvoriDugme = By.cssSelector("div#popup-holder button.button.ok");
		By Transakcije = By.cssSelector("div#account-wrapper div:nth-child(4) > li");
		By TransakcijeTitle = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > div > div.transactions-table");
		By Kalendar = By.cssSelector("div#account-wrapper input[type=\"text\"]");
		By TransactionExist = By.cssSelector(".cell.day.highlighted");
		
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
		public WebElement Transakcije() {
			return driver.findElement(Transakcije);
		}
		public WebElement TransakcijeTitle() {
			return driver.findElement(TransakcijeTitle);
		}
		public WebElement TransactionExist() {
			return driver.findElement(TransactionExist);
		}
		public WebElement Kalendar() {
			return driver.findElement(Kalendar);
		}
		
}
