package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VirtualFudbalPage {

		public WebDriver driver;
		By VirtualMec1 = By.cssSelector("div#vfl-matches tr:nth-child(1) > td:nth-child(4)");
		By VirtualMec2 = By.cssSelector("div#vfl-matches tr:nth-child(3) > td:nth-child(4)");
		By VirtualMec3 = By.cssSelector("div#vfl-matches tr:nth-child(11) > td:nth-child(4)");
		By uplata = By.cssSelector("input#bt-input");
		By uplataDugme = By.id("live-pay-button");
		By uplataDugme2 = By.cssSelector("div#ticket-popup-holder button");
		By UreduDugme = By.cssSelector("div#ticket-popup-holder button.button.ok");
		//By title = By.xpath("//*[contains(text(), 'Uspešno ste uplatili tiket.')]");
		
		public VirtualFudbalPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement VirtualMec1() {
			return driver.findElement(VirtualMec1);
		}
		public WebElement VirtualMec2() {
			return driver.findElement(VirtualMec2);
		}
		public WebElement VirtualMec3() {
			return driver.findElement(VirtualMec3);
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
//		public WebElement title() {
//			return driver.findElement(title);
//		}
}