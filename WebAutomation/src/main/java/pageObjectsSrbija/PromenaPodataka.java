package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromenaPodataka {

		public WebDriver driver;
		By SacuvajIzmene = By.cssSelector("div#account-wrapper div.edit-form__left > form > button[type=\"submit\"]");
		By BrojRacuna = By.cssSelector("input#bankAccount");
		By Title = By.cssSelector("div#account-wrapper div.modal__body > p");
		By UreduDugme = By.cssSelector("div#account-wrapper button[type=\"button\"]");
	
		public PromenaPodataka(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement SacuvajIzmene() {
			return driver.findElement(SacuvajIzmene);
		}
		public WebElement BrojRacuna() {
			return driver.findElement(BrojRacuna);
		}
		public WebElement Title() {
			return driver.findElement(Title);
		}
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
}
