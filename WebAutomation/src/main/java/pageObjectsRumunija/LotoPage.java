package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LotoPage {

		public WebDriver driver;
		By GrckiLotoTime = By.cssSelector("div#pageWrapper li:nth-child(2)");
		By uplataSingl = By.cssSelector("div#pageWrapper input");
		By uplataDugmeSingl = By.id("pay-subgame-ticket");
		By uplataDugmeSingl1 = By.cssSelector("div#pageWrapper button.button.pay");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugme2 = By.cssSelector("div#pageWrapper div.actions > button");
		By UreduDugme = By.cssSelector("div#pageWrapper button.button.close");
		By title = By.cssSelector("div#pageWrapper div.message");
		By activeDugme = By.cssSelector("#pageWrapper > section > article > article.lotto-right-section > div > div.vb-content > section > section > section:nth-child(2) > article > div.summary > div.summary-header > div.payment > div > button");
		By checkbox = By.cssSelector("div#pageWrapper div:nth-child(1) > input");
		
		public LotoPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement GrckiLotoTime() {
			return driver.findElement(GrckiLotoTime);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDugmeSingl() {
			return driver.findElement(uplataDugmeSingl);
		}
		public WebElement uplataDugmeSingl1() {
			return driver.findElement(uplataDugmeSingl1);
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
		public WebElement checkbox() {
			return driver.findElement(checkbox);
		}
		public WebElement activeDugme() {
			return driver.findElement(activeDugme);
		}
		
}
