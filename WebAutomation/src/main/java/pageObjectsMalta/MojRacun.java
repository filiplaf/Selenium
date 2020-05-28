package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojRacun {

		public WebDriver driver;
		By transakcije = By.cssSelector("div#account-wrapper div:nth-child(4) > li");
		By kalendar = By.cssSelector("div#account-wrapper input[type=\"text\"]");
		By noTransactionTitle = By.cssSelector("#pageWrapper > div:nth-child(2) > section.account-container > div.account-container-center");
		By transactionExist = By.cssSelector(".cell.day.highlighted");
		By changeData = By.cssSelector("div#account-wrapper div:nth-child(7) > li");
		By changePassword = By.cssSelector("div#account-wrapper div:nth-child(8) > li");
		By documentUpload = By.cssSelector("div#account-wrapper div:nth-child(9) > li");
		By deposit = By.cssSelector("div#account-wrapper div:nth-child(2) > li");
		By debitCard = By.cssSelector("section#safe-charge div.table-row > div:nth-child(1)");
		By amount = By.cssSelector("section#safe-charge input[type=\"number\"]");
		By depositButton = By.id("pay-btn-safe-charge");
		By withdrawal = By.cssSelector("div#account-wrapper div:nth-child(3) > li");
		By skrill = By.cssSelector("section#skrill-ro div.table-row > div:nth-child(1)");
		By skrillAmount = By.cssSelector("section#skrill-ro div:nth-child(1) > input[type=\"text\"]");
		By skrillMail = By.cssSelector("section#skrill-ro div:nth-child(2) > input[type=\"text\"]");
		By withdrawalButton = By.id("pay-btn-skrill-ro");
		By confirmTitle = By.cssSelector("div#account-wrapper div.popup-window.active > div > div.popup-body > p");
		By closeButton = By.cssSelector("div#account-wrapper div.popup-window.active > div > div.popup-footer > div.close-popup");
		By betSlips = By.cssSelector("div#account-wrapper div:nth-child(5) > li");
		By transactionTable = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > div > div.transactions-table");
		By sportskiTiket = By.xpath("//*[contains(@class,'cell type') and contains(.,'Sports')]");
		By kodSportski = By.cssSelector("div#account-wrapper p.ticket-id");
		By lotoTiket = By.xpath("//*[contains(@class,'cell type') and contains(.,'Lotto')]");
		By kodLoto = By.cssSelector("div#account-wrapper p.ticket-id.desktop");
		By datum = By.cssSelector("div#account-wrapper article:nth-child(1) > article > div.cell.date");
		
		public MojRacun(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement transakcije() {
			return driver.findElement(transakcije);
		}
		public WebElement kalendar() {
			return driver.findElement(kalendar);
		}
		public WebElement noTransactionTitle() {
			return driver.findElement(noTransactionTitle);
		}
		public WebElement transactionExist() {
			return driver.findElement(transactionExist);
		}
		public WebElement changeData() {
			return driver.findElement(changeData);
		}
		public WebElement changePassword() {
			return driver.findElement(changePassword);
		}
		public WebElement documentUpload() {
			return driver.findElement(documentUpload);
		}
		public WebElement deposit() {
			return driver.findElement(deposit);
		}
		public WebElement debitCard() {
			return driver.findElement(debitCard);
		}
		public WebElement amount() {
			return driver.findElement(amount);
		}
		public WebElement depositButton() {
			return driver.findElement(depositButton);
		}
		public WebElement withdrawal() {
			return driver.findElement(withdrawal);
		}
		public WebElement skrill() {
			return driver.findElement(skrill);
		}
		public WebElement skrillAmount() {
			return driver.findElement(skrillAmount);
		}
		public WebElement skrillMail() {
			return driver.findElement(skrillMail);
		}
		public WebElement withdrawalButton() {
			return driver.findElement(withdrawalButton);
		}
		public WebElement confirmTitle() {
			return driver.findElement(confirmTitle);
		}
		public WebElement closeButton() {
			return driver.findElement(closeButton);
		}
		public WebElement betSlips() {
			return driver.findElement(betSlips);
		}
		public WebElement transactionTable() {
			return driver.findElement(transactionTable);
		}
		public WebElement sportskiTiket() {
			return driver.findElement(sportskiTiket);
		}
		public WebElement kodSportski() {
			return driver.findElement(kodSportski);
		}
		public WebElement lotoTiket() {
			return driver.findElement(lotoTiket);
		}
		public WebElement kodLoto() {
			return driver.findElement(kodLoto);
		}
		public WebElement datum() {
			return driver.findElement(datum);
		}
}
