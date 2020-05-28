package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VirtualFudbalPage {

		public WebDriver driver;
		By uplata = By.id("bt-input");
		By uplataDugme = By.id("live-pay-button");
		By uplataDugme2 = By.cssSelector("div#ticket-popup-holder button");
		By ureduDugme = By.cssSelector("div#ticket-popup-holder button.button.ok");
		By title = By.cssSelector("div#ticket-popup-holder div.pay-info");
		
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
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
}