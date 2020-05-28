package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VirtualFudbalPage {

		public WebDriver driver;
		By uplata = By.cssSelector("input#bt-input");
		By uplataDugme = By.id("live-pay-button");
		By uplataDugme2 = By.cssSelector("div#ticket-popup-holder button");
		By UreduDugme = By.cssSelector("div#ticket-popup-holder button.button.ok");
		By title = By.cssSelector("#ticket-popup-holder > div.ticket-info-popup > div.pay-info");
		
		public VirtualFudbalPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDugme2() {
			return driver.findElement(uplataDugme2);
		}
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
}