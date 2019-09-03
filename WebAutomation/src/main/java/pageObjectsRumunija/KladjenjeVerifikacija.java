package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjeVerifikacija {

		public WebDriver driver;
		By mec1 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(2) > div > div.part2 > div:nth-child(1) > div:nth-child(1)");
		By mec2 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(3) > div > div.part2 > div:nth-child(1) > div:nth-child(1)");
		By mec3 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(4) > div > div.part2 > div:nth-child(3) > div:nth-child(2)");
		By mec4 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(5) > div > div.part2 > div:nth-child(1) > div:nth-child(2)");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("button#pay-ticket");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By title = By.cssSelector("section#right div.message");
		By Accept = By.cssSelector("section#right button:nth-child(2)");
		By AcceptUplata = By.cssSelector("section#right button.button.pay");
		By closeButton = By.cssSelector("section#right button.button.close");
		
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
		public WebElement Accept() {
			return driver.findElement(Accept);
		}	
		public WebElement AcceptUplata() {
			return driver.findElement(AcceptUplata);
		}
		public WebElement closeButton() {
			return driver.findElement(closeButton);
		}
}
