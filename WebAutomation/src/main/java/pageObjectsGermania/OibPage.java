package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OibPage {

		public WebDriver driver;
		By oib = By.cssSelector("body > div.wrapper.top > div.oib");
		
		public OibPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement oib() {
			return driver.findElement(oib);
		}
		

		
}
