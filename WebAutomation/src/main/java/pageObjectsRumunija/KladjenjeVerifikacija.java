package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjeVerifikacija {

		public WebDriver driver;
		By mec1 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(1) > td.odd.tooltip.i0");
		By mec2 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(4) > td.odd.tooltip.i5");
		By mec3 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(7) > td.odd.tooltip.i2.g0");
		By mec4 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(10) > td.odd.tooltip.i0");
		By uplata = By.cssSelector("div#ordinary-ticket input#bt-input");
		By uplataDugme = By.cssSelector("div#ordinary-ticket button");
		By uplataDugme2 = By.cssSelector("div#ticket-popup-holder button.button.pay");
		By title = By.xpath("//*[@id=\"ajax-loader\"]/div[5]");
		By Accept = By.cssSelector("div#ticket-popup-holder button.button.accept-verified");
		By title1 = By.xpath("//*[@id=\"ticket-popup-holder\"]/div[2]/div[1]");
		By closeButton = By.cssSelector("div#ticket-popup-holder button.button.ok");
		
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
		public WebElement title1() {
			return driver.findElement(title1);
		}
		public WebElement closeButton() {
			return driver.findElement(closeButton);
		}
}
