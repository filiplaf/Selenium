package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By isplata = By.cssSelector("div#spa div:nth-child(3) > li");
		By naUplatnoMesto = By.cssSelector("section#mozzart div.pay-desc");
		By naTekuciRacun = By.cssSelector("section#bank-transfer div.table-row > div:nth-child(1)");
		By uplatnoMesto = By.cssSelector("section#mozzart div.vs__selected-options > input");
		By iznos = By.cssSelector("section#mozzart input[type=\"text\"]");
		By iznosZaTekuci = By.cssSelector("section#bank-transfer div:nth-child(2) > div > input");
		By isplati = By.id("pay-btn-mozzart");
		By isplatiNaTekuci = By.id("pay-btn-bank");
		By um = By.cssSelector("section#mozzart div.vs__selected-options > input");
		By beogradska = By.xpath("//*[contains(text(), 'Beogradska')]");
		By dorcol = By.xpath("//*[contains(text(), 'Dorcol')]");
		By title = By.cssSelector("section#mozzart div.popup-window.active > div > div.popup-body > p");
		By title1 = By.cssSelector("#bank-transfer > div.popup-window.active > div > div.popup-body > p");
		By zatvoriDugme = By.cssSelector("section#mozzart div.popup-window.active > div > div.popup-footer > div:nth-child(1)");
		By zatvoriDugmeTekuci = By.cssSelector("section#bank-transfer div.popup-footer > div:nth-child(1)");
		By editTekuciDugme = By.cssSelector("section#bank-transfer p > a");
		By transakcije = By.cssSelector("div#account-wrapper div:nth-child(4) > li");
		By pregledTiketa = By.cssSelector("div#account-wrapper div:nth-child(5) > li");
		By kalendar = By.cssSelector("div#account-wrapper input[type=\"text\"]");
		By datum = By.cssSelector("div#account-wrapper article:nth-child(1) > article > div.cell.date");
		By noTransactionTitle = By.cssSelector("div#account-wrapper div.transactions-table");
		By transactionExist = By.cssSelector(".cell.day.highlighted");
		By promenaPodataka = By.cssSelector("div#account-wrapper div:nth-child(7) > li");
		By transactionTable = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > div > div.transactions-table");
		By sportskiTiket = By.xpath("//*[contains(text(), 'Sportsko klađenje')]");
		By lotoTiket = By.xpath("//*[contains(text(), 'Moj Broj')]");
		By kodSportski = By.cssSelector("div#account-wrapper p.ticket-id");
		By kodLoto = By.cssSelector("div#account-wrapper p.ticket-id.desktop");
		
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
		public WebElement naTekuciRacun() {
			return driver.findElement(naTekuciRacun);
		}
		public WebElement uplatnoMesto() {
			return driver.findElement(uplatnoMesto);
		}
		public WebElement iznos() {
			return driver.findElement(iznos);
		}
		public WebElement iznosZaTekuci() {
			return driver.findElement(iznosZaTekuci);
		}
		public WebElement isplati() {
			return driver.findElement(isplati);
		}
		public WebElement isplatiNaTekuci() {
			return driver.findElement(isplatiNaTekuci);
		}
		public WebElement um() {
			return driver.findElement(um);
		}
		public WebElement beogradska() {
			return driver.findElement(beogradska);
		}
		public WebElement dorcol() {
			return driver.findElement(dorcol);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement title1() {
			return driver.findElement(title1);
		}
		public WebElement zatvoriDugme() {
			return driver.findElement(zatvoriDugme);
		}
		public WebElement zatvoriDugmeTekuci() {
			return driver.findElement(zatvoriDugmeTekuci);
		}
		public WebElement editTekuciDugme() {
			return driver.findElement(editTekuciDugme);
		}
		public WebElement transakcije() {
			return driver.findElement(transakcije);
		}
		public WebElement pregledTiketa() {
			return driver.findElement(pregledTiketa);
		}
		public WebElement kalendar() {
			return driver.findElement(kalendar);
		}
		public WebElement datum() {
			return driver.findElement(datum);
		}
		public WebElement noTransactionTitle() {
			return driver.findElement(noTransactionTitle);
		}
		public WebElement transactionExist() {
			return driver.findElement(transactionExist);
		}
		public WebElement promenaPodataka() {
			return driver.findElement(promenaPodataka);
		}
		public WebElement transactionTable() {
			return driver.findElement(transactionTable);
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
