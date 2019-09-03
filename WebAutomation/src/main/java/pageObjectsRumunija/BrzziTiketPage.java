package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrzziTiketPage {

		public WebDriver driver;
		By ObrisiDugme = By.cssSelector("section#right div.pointer.clear-all > button");
		By mec1 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(2) > div > div.part2 > div:nth-child(1) > div:nth-child(1)");
		By mec2 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(3) > div > div.part2 > div:nth-child(1) > div:nth-child(1)");
		By mec3 = By.cssSelector("div#focus div:nth-child(3) > div:nth-child(2) > article:nth-child(4) > div > div.part2 > div:nth-child(3) > div:nth-child(2)");
		By simplu = By.xpath("//*[@id=\"right\"]/div/div[1]/section/section/header/div[2]/div[1]");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("button#pay-ticket");
		By BrzziTiketDugme = By.cssSelector("section#right a");
		By title = By.cssSelector("section#right div.message");
		By title1 = By.cssSelector("section#right footer > div > p");
		By UreduDugme = By.cssSelector("section#right button.button.close");
		
		public BrzziTiketPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement ObrisiDugme() {
			return driver.findElement(ObrisiDugme);
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
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDBrzziTiketDugmeugme2() {
			return driver.findElement(BrzziTiketDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement title1() {
			return driver.findElement(title1);
		}
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
		public WebElement Simplu() {
			return driver.findElement(simplu);
		}
}
