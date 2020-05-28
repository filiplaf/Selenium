package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UzivoPage {

		public WebDriver driver;
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplatiTiketDugme = By.id("pay-ticket-btn");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By ureduDugme = By.cssSelector("div#pageWrapper article > div > div.actions > button");
		
		public UzivoPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplatiTiketDugme() {
			return driver.findElement(uplatiTiketDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}

}
