package pageObjectsRumunija;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjePage {

		public WebDriver driver;
		By mec1 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(1) > td.odd.tooltip.i0");
		By mec2 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(4) > td.odd.tooltip.i5");
		By mec3 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(7) > td.odd.tooltip.i2.g0");
		By mec4 = By.cssSelector("div#all-matches div:nth-child(4) > table > tbody > tr:nth-child(10) > td.odd.tooltip.i0");
		By uplata = By.cssSelector("div#ordinary-ticket input#bt-input");
		By uplataSistemski = By.cssSelector("div#system-ticket input#bt-input");
		By uplataDugme = By.cssSelector("div#ordinary-ticket button");
		By uplataDugmeSistemski = By.cssSelector("div#system-ticket button");
		By uplataDugme2 = By.cssSelector("div#ticket-popup-holder button.button.pay");
		By title = By.cssSelector("#ticket-popup-holder > div.ticket-info-popup");
		By UreduDugme = By.cssSelector("div#ticket-popup-holder button.button.ok");
		By sistemski = By.cssSelector("a#ui-id-3");
		By checkbox = By.cssSelector("div#system-ticket div:nth-child(2) > label");
		By checkbox1 = By.cssSelector("div#system-ticket div:nth-child(3) > label");
		By izaberiBenefit = By.cssSelector("span#ui-id-8-button > span.ui-selectmenu-text");
		By klikBenefit = By.cssSelector("div[class*='ui-selectmenu-menu'] ul li");
		By title1 = By.cssSelector("section#right div.message");
		
		public KladjenjePage(WebDriver driver) {
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
		public WebElement uplataSistemski() {
			return driver.findElement(uplataSistemski);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDugmeSistemski() {
			return driver.findElement(uplataDugmeSistemski);
		}
		public WebElement uplataDugme2() {
			return driver.findElement(uplataDugme2);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
		public WebElement sistemski() {
			return driver.findElement(sistemski);
		}
		public WebElement checkbox() {
			return driver.findElement(checkbox);
		}
		public WebElement checkbox1() {
			return driver.findElement(checkbox1);
		}
		public WebElement izaberiBenefit() {
			return driver.findElement(izaberiBenefit);
		}
		public List<WebElement> klikBenefit() {
			return driver.findElements(klikBenefit);
		}
		public WebElement title1() {
			return driver.findElement(title1);
		}
		
}
