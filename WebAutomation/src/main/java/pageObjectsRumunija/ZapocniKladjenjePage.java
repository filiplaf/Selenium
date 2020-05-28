package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZapocniKladjenjePage {

		public WebDriver driver;
		By grad = By.cssSelector("div#pageWrapper div:nth-child(3) > div > div > div.vs__actions > i");
		By bucurest = By.xpath("//*[contains(text(), 'Bucuresti')]");
		By adresa = By.id("residenceAddress");
		By cnp = By.id("personalCardNumber");
		By usloviKoriscenja = By.cssSelector("div#pageWrapper div:nth-child(5) > div > label > span");
		By prihvatiDugme = By.cssSelector("div#pageWrapper button[type=\"submit\"]");
		By title = By.cssSelector("div#pageWrapper div.modal__body > p");
		By okDugme = By.cssSelector("div#pageWrapper div.modal__body > button[type=\"button\"]");
		
		public ZapocniKladjenjePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}

		public WebElement grad() {
			return driver.findElement(grad);
		}
		public WebElement bucurest() {
			return driver.findElement(bucurest);
		}
		public WebElement adresa() {
			return driver.findElement(adresa);
		}
		public WebElement usloviKoriscenja() {
			return driver.findElement(usloviKoriscenja);
		}
		public WebElement prihvatiDugme() {
			return driver.findElement(prihvatiDugme);
		}
		public WebElement cnp() {
			return driver.findElement(cnp);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement okDugme() {
			return driver.findElement(okDugme);
		}
}