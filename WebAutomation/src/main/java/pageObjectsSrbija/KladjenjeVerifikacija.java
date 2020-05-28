package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjeVerifikacija {

		public WebDriver driver;
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("button#pay-ticket");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By accept = By.cssSelector("section#right div.actions > button:nth-child(2)");
		By closeDugme = By.cssSelector("section#right button.button.close");
		By accept1 = By.cssSelector("section#right button.button.pay");
		
		public KladjenjeVerifikacija(WebDriver driver) {
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
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement accept() {
			return driver.findElement(accept);
		}
		public WebElement closeDugme() {
			return driver.findElement(closeDugme);
		}
		public WebElement accept1() {
			return driver.findElement(accept1);
		}	
}
