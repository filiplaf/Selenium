package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LuckyG {

		public WebDriver driver;
	
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplataDugme = By.id("pay-lucky-ticket");
		By uplataDugme2 = By.cssSelector("div#pageWrapper div.actions > button");
		By ureduDugme = By.cssSelector("div#spa button.button.close");
		By title = By.cssSelector("div#pageWrapper div.message");
		By activeDugme = By.cssSelector("div#pageWrapper div.payment > div > button");
		By luckyGtime = By.cssSelector("div#pageWrapper li:nth-child(2)");
		
		public LuckyG(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement luckyGtime() {
			return driver.findElement(luckyGtime);
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
		public WebElement activeDugme() {
			return driver.findElement(activeDugme);
		}
		

		
}
