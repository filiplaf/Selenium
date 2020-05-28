package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By isplata = By.cssSelector("div#account-wrapper div:nth-child(3) > li");
		By naUplatnoMesto = By.cssSelector("section#mozzart div.table-row > div:nth-child(1)");
		By naSkrillRacun = By.cssSelector("section#skrill-ro div.table-row > div:nth-child(1)");
		By uplatnoMesto = By.cssSelector("section#mozzart i");
		By iznos = By.cssSelector("section#mozzart input[type=\"text\"]");
		By iznosZaSkrill = By.cssSelector("section#skrill-ro div:nth-child(1) > input[type=\"text\"]");
		By mailZaTekuci = By.cssSelector("section#skrill-ro div:nth-child(2) > input[type=\"text\"]");
		By isplati = By.id("pay-btn-mozzart");
		By isplatiNaSkrill = By.id("pay-btn-skrill-ro");
		By um = By.cssSelector("span#account-businessunits-select-button > span.ui-selectmenu-text");
		By webRo = By.xpath("//*[contains(text(), 'Mozzartweb')]");
		By potvrdi = By.cssSelector("div#account-wrapper div.popup-window.active > div > div.popup-footer > div.close-popup");
		By title = By.cssSelector("section#mozzart div.popup-window.active > div > div.popup-body > p");
		By zatvoriDugme = By.cssSelector("div#popup-holder button.button.ok");
		By transakcije = By.cssSelector("div#account-wrapper div:nth-child(4) > li");
		By transakcijeTitle = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > div > div.transactions-table");
		By transakcijeTable = By.xpath("#account-wrapper > section.account-container > div.account-container-center > div > div.transactions-table > div > div.transactions");
		By kalendar = By.cssSelector("div#account-wrapper input[type=\"text\"]");
		By datum = By.cssSelector("div#account-wrapper article:nth-child(1) > article > div.cell.date");
		By transactionExist = By.cssSelector(".cell.day.highlighted");
		By inchide = By.cssSelector("section#mozzart div.popup-window.active > div > div.popup-footer > div:nth-child(1)");
		By incarcare_document = By.cssSelector("div#account-wrapper div:nth-child(8) > li");
		By successTitle = By.cssSelector("div#account-wrapper div.popup-window.active > div > div.popup-body");
		By bilete = By.cssSelector("div#account-wrapper div:nth-child(5) > li");
		By sportskiTiket = By.xpath("//*[contains(@class,'cell type') and contains(.,'Pariuri sportive')]");
		By kodSportski = By.cssSelector("div#account-wrapper p.ticket-id");
		By lotoTiket = By.xpath("//*[contains(@class,'cell type') and contains(.,'Lotto')]");
		By kodLoto = By.cssSelector("div#account-wrapper p.ticket-id");
		
		public MojRacun(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement isplata() {
			return driver.findElement(isplata);
		}
		public WebElement naUplatnoMesto() {
			return driver.findElement(naUplatnoMesto);
		}
		public WebElement naSkrillRacun() {
			return driver.findElement(naSkrillRacun);
		}
		public WebElement uplatnoMesto() {
			return driver.findElement(uplatnoMesto);
		}
		public WebElement iznos() {
			return driver.findElement(iznos);
		}
		public WebElement iznosZaSkrill() {
			return driver.findElement(iznosZaSkrill);
		}
		public WebElement isplati() {
			return driver.findElement(isplati);
		}
		public WebElement isplatiNaSkrill() {
			return driver.findElement(isplatiNaSkrill);
		}
		public WebElement mailZaTekuci() {
			return driver.findElement(mailZaTekuci);
		}
		public WebElement um() {
			return driver.findElement(um);
		}
		public WebElement webRo() {
			return driver.findElement(webRo);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement zatvoriDugme() {
			return driver.findElement(zatvoriDugme);
		}
		public WebElement potvrdi() {
			return driver.findElement(potvrdi);
		}
		public WebElement transakcije() {
			return driver.findElement(transakcije);
		}
		public WebElement transakcijeTitle() {
			return driver.findElement(transakcijeTitle);
		}
		public WebElement transakcijeTable() {
			return driver.findElement(transakcijeTable);
		}
		public WebElement transactionExist() {
			return driver.findElement(transactionExist);
		}
		public WebElement kalendar() {
			return driver.findElement(kalendar);
		}
		public WebElement datum() {
			return driver.findElement(datum);
		}
		public WebElement inchide() {
			return driver.findElement(inchide);
		}
		public WebElement incarcare_document() {
			return driver.findElement(incarcare_document);
		}
		public WebElement successTitle() {
			return driver.findElement(successTitle);
		}
		public WebElement bilete() {
			return driver.findElement(bilete);
		}
		public WebElement sportskiTiket() {
			return driver.findElement(sportskiTiket);
		}
		public WebElement lotoTiket() {
			return driver.findElement(lotoTiket);
		}
		public WebElement kodSportski() {
			return driver.findElement(kodSportski);
		}
		public WebElement kodLoto() {
			return driver.findElement(kodLoto);
		}
		
}
