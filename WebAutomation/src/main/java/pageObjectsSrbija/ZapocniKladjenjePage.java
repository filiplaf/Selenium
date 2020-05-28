package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZapocniKladjenjePage {

		public WebDriver driver;
		By jmbg = By.id("identityNumber");
		By brojLicneKarte = By.id("identityCardNumber");
		By brojTelefona = By.id("phoneNumber");
		By mestoRodjenjaDrzava = By.id("birthState");
		By mestoRodjenjaGrad = By.id("birthCity");
		By prebivalisteDrzava = By.id("residenceState");
		By prebivalisteGrad = By.id("residenceCity");
		By prebivalisteAdresa = By.id("residenceAddress");
		By usloviKoriscenja = By.cssSelector("div#pageWrapper div:nth-child(7) > div > label > span");
		By potvrdiDugme = By.cssSelector("div#pageWrapper div.holder > form > button[type=\"submit\"]");
		By title = By.cssSelector("#pageWrapper > section > div > div.activate-club > div.overlay > div > div.modal__body > p");
		By ureduDugme = By.cssSelector("#pageWrapper > section > div > div.activate-club > div.overlay > div > div.modal__body > button");
				
		public ZapocniKladjenjePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement jmbg() {
			return driver.findElement(jmbg);
		}
		public WebElement brojLicneKarte() {
			return driver.findElement(brojLicneKarte);
		}
		public WebElement brojTelefona() {
			return driver.findElement(brojTelefona);
		}
		public WebElement mestoRodjenjaDrzava() {
			return driver.findElement(mestoRodjenjaDrzava);
		}
		public WebElement mestoRodjenjaGrad() {
			return driver.findElement(mestoRodjenjaGrad);
		}
		public WebElement prebivalisteDrzava() {
			return driver.findElement(prebivalisteDrzava);
		}
		public WebElement prebivalisteGrad() {
			return driver.findElement(prebivalisteGrad);
		}
		public WebElement prebivalisteAdresa() {
			return driver.findElement(prebivalisteAdresa);
		}
		public WebElement usloviKoriscenja() {
			return driver.findElement(usloviKoriscenja);
		}
		public WebElement potvrdiDugme() {
			return driver.findElement(potvrdiDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
}
