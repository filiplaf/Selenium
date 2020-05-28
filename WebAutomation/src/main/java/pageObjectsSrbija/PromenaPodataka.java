package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromenaPodataka {

		public WebDriver driver;
		By sacuvajIzmene = By.cssSelector("div#account-wrapper div.edit-form__left > form > button[type=\"submit\"]");
		By brojRacuna = By.id("bankAccount");
		By brojLicneKarte = By.id("identityCardNumber");
		By title = By.cssSelector("div#account-wrapper div.modal__body > p");
		By uredu = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > section > div > div.form > div > div.overlay > div > div.modal__body > button");
		By upload = By.cssSelector("#account-wrapper > section.account-container > div.account-container-center > section > div > div.form > div > div.edit-form__right > div.upload > input");
		By dodajDokument = By.cssSelector("div#account-wrapper button[type=\"button\"]");
		By ureduDugme = By.cssSelector("div#account-wrapper div.modal__body > button[type=\"button\"]");
		By potvrdaPodataka = By.cssSelector("div#account-wrapper div:nth-child(10) > label > span");
		
		public PromenaPodataka(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement sacuvajIzmene() {
			return driver.findElement(sacuvajIzmene);
		}
		public WebElement brojRacuna() {
			return driver.findElement(brojRacuna);
		}
		public WebElement brojLicneKarte() {
			return driver.findElement(brojLicneKarte);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement uredu() {
			return driver.findElement(uredu);
		}
		public WebElement upload() {
			return driver.findElement(upload);
		}
		public WebElement dodajDokument() {
			return driver.findElement(dodajDokument);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement potvrdaPodataka() {
			return driver.findElement(potvrdaPodataka);
		}
}
