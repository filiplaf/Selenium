package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZaboravljenaLozinkaPage {

		public WebDriver driver;
		By korisnickoIme = By.id("username");
		By posaljiZahtevDugme = By.cssSelector("div#spa div.actions > button[type=\"submit\"]");
		By title =  By.cssSelector("div#spa div.modal__body > p");
		By ureduDugme = By.cssSelector("div#spa button[type=\"button\"]");
		By lozinka = By.id("password");
		By ponoviLozinku = By.id("confirm_password");
		
		public ZaboravljenaLozinkaPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement korisnickoIme() {
			return driver.findElement(korisnickoIme);
		}
		public WebElement posaljiZahtevDugme() {
			return driver.findElement(posaljiZahtevDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement lozinka() {
			return driver.findElement(lozinka);
		}
		public WebElement ponoviLozinku() {
			return driver.findElement(ponoviLozinku);
		}
}
