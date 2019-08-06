package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjeVerifikacija {

		public WebDriver driver;
		By mec1 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[1]/div/div[2]/div[1]/div[1]/span/span");
		By mec2 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[2]/div/div[2]/div[1]/div[1]/span/span");
		By mec3 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[3]/div/div[2]/div[1]/div[1]/span/span");
		By mec4 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[4]/div/div[2]/div[1]/div[1]/span/span");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("button#pay-ticket");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By title = By.cssSelector("section#right div.message");
		By accept = By.cssSelector("section#right button:nth-child(2)");
		By closeDugme = By.cssSelector("section#right button.button.close");
		By Accept1 = By.cssSelector("section#right button.button.pay");
		
		public KladjenjeVerifikacija(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement getmec1() {
			return driver.findElement(mec1);
		}
		
		public WebElement getmec2() {
			return driver.findElement(mec2);
		}
		public WebElement getmec3() {
			return driver.findElement(mec3);
		}
		public WebElement getmec4() {
			return driver.findElement(mec4);
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
		public WebElement Accept1() {
			return driver.findElement(Accept1);
		}	
}
