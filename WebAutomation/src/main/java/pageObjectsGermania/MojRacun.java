package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By Isplata = By.cssSelector("div#account-wrapper div:nth-child(3) > li");
		By NaUplatnoMesto = By.cssSelector("section#mozzart div.pay-desc");
		By NaTekuciRacun = By.cssSelector("#bank-transfer > div.table-row > div:nth-child(1)");
		By UplatnoMesto = By.cssSelector("section#mozzart div.vs__selected-options > input");
		By Iznos = By.cssSelector("section#mozzart input[type=\"text\"]");
		By IznosZaTekuci = By.cssSelector("section#bank-transfer div:nth-child(2) > input[type=\"text\"]");
		By Isplati = By.id("pay-btn-mozzart");
		By IsplatiNaTekuci = By.id("pay-btn-bank");
		By Um = By.cssSelector("section#mozzart div.vs__selected-options > input");
		By CityCaffe = By.xpath("//*[contains(text(), 'City caffe')]");
		By ZagrebDubrava = By.xpath("//*[contains(text(), 'Zagreb Dubrava')]");
		By Title = By.cssSelector("section#mozzart div.popup-window.active > div > div.popup-body > p");
		By Title1 = By.cssSelector("#bank-transfer > div.popup-window.active > div > div.popup-body > p");
		By ZatvoriDugme = By.cssSelector("section#mozzart div.popup-window.active > div > div.popup-footer > div:nth-child(1)");
		By ZatvoriDugmeTekuci = By.cssSelector("section#bank-transfer div.popup-footer > div:nth-child(1)");
		By EditTekuciDugme = By.cssSelector("section#bank-transfer p > a");
		By Transakcije = By.cssSelector("div#account-wrapper div:nth-child(4) > li");
		By NoTransactionTitle = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > div > div.transactions-table > div");
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
		public WebElement NaTekuciRacun() {
			return driver.findElement(NaTekuciRacun);
		}
		public WebElement UplatnoMesto() {
			return driver.findElement(UplatnoMesto);
		}
		public WebElement Iznos() {
			return driver.findElement(Iznos);
		}
		public WebElement IznosZaTekuci() {
			return driver.findElement(IznosZaTekuci);
		}
		public WebElement Isplati() {
			return driver.findElement(Isplati);
		}
		public WebElement IsplatiNaTekuci() {
			return driver.findElement(IsplatiNaTekuci);
		}
		public WebElement Um() {
			return driver.findElement(Um);
		}
		public WebElement CityCaffe() {
			return driver.findElement(CityCaffe);
		}
		public WebElement ZagrebDubrava() {
			return driver.findElement(ZagrebDubrava);
		}
		public WebElement Title() {
			return driver.findElement(Title);
		}
		public WebElement Title1() {
			return driver.findElement(Title1);
		}
		public WebElement ZatvoriDugme() {
			return driver.findElement(ZatvoriDugme);
		}
		public WebElement ZatvoriDugmeTekuci() {
			return driver.findElement(ZatvoriDugmeTekuci);
		}
		public WebElement EditTekuciDugme() {
			return driver.findElement(EditTekuciDugme);
		}
		public WebElement Transakcije() {
			return driver.findElement(Transakcije);
		}
		public WebElement NoTransactionTitle() {
			return driver.findElement(NoTransactionTitle);
		}
		public WebElement TransactionExist() {
			return driver.findElement(TransactionExist);
		}
		public WebElement Kalendar() {
			return driver.findElement(Kalendar);
		}
		
		
}
