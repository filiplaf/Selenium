package pageObjectsSrbija;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferPage {

		public WebDriver driver;
		By korisnik = By.cssSelector("div#pageWrapper div.flex.row.user-box > img");
		By tranferDugme = By.cssSelector("div#pageWrapper div.user-details-body > a");
		By iznos = By.cssSelector("div#pageWrapper div.speed-transfer.v2 > div > input[type=\"text\"]");
		By transferDugme2 = By.cssSelector("div#pageWrapper div.speed-transfer.v2 > div > a");
		By title = By.cssSelector("div#pageWrapper div.message > p");
		By ureduDugme = By.cssSelector("div#pageWrapper div.message > a");
		By brziTransfer = By.cssSelector("div[class='values'] span");

		public TransferPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement korisnik() {
			return driver.findElement(korisnik);
		}
		public WebElement tranferDugme() {
			return driver.findElement(tranferDugme);
		}
		public WebElement transferDugme2() {
			return driver.findElement(transferDugme2);
		}
		public WebElement iznos() {
			return driver.findElement(iznos);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public List<WebElement> brziTransfer() {
			return driver.findElements(brziTransfer);
		}

}
