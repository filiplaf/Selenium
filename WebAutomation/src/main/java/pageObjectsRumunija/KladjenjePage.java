package pageObjectsRumunija;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjePage {

		public WebDriver driver;
		By mec1 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(2) > div > div.part2 > div:nth-child(1) > div:nth-child(1)");
		By mec2 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(3) > div > div.part2 > div:nth-child(1) > div:nth-child(1)");
		By mec3 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(4) > div > div.part2 > div:nth-child(3) > div:nth-child(2)");
		By mec4 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(5) > div > div.part2 > div:nth-child(1) > div:nth-child(2)");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataSistemski = By.cssSelector("section#vbar-center div.payment > input");
		By uplataDugme = By.cssSelector("button#pay-ticket");
		By uplataDugmeSistemski = By.cssSelector("section#vbar-center button");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By title = By.cssSelector("section#right div.message");
		By UreduDugme = By.cssSelector("section#right button.button.close");
		By sistemski = By.cssSelector("section#right div.pointer.system");
		By checkbox = By.cssSelector("section#vbar-center div:nth-child(1) > input");
		By checkbox1 = By.cssSelector("section#vbar-center div:nth-child(4) > input");
		By izaberiBenefit = By.cssSelector("section#vbar-center div.benefits");
		By klikBenefit = By.cssSelector("#vbar-center > div > div.summary-header > div.benefits > div");
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
