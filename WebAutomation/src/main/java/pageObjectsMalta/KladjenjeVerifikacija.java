package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjeVerifikacija {

		public WebDriver driver;
		By uplata = By.id("bettingAmount");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By title = By.cssSelector("section#right div.message");
		By acceptChanges = By.cssSelector("section#right div.actions > button:nth-child(1)");
		By closeDugme = By.cssSelector("section#right button.button.close");
		By placeBet = By.cssSelector("section#right button.button.pay");
		
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
		public WebElement acceptChanges() {
			return driver.findElement(acceptChanges);
		}
		public WebElement closeDugme() {
			return driver.findElement(closeDugme);
		}
		public WebElement placeBet() {
			return driver.findElement(placeBet);
		}	
}
