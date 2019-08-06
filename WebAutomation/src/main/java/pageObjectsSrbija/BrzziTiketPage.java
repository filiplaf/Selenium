package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrzziTiketPage {

		public WebDriver driver;
		By ObrisiDugme = By.cssSelector("section#right div.pointer.clear-all > button");
		By mec1 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[1]/div/div[2]/div[1]/div[1]/span/span");
		By mec2 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[2]/div/div[2]/div[1]/div[2]");
		By mec3 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[3]/div/div[2]/div[2]/div[2]/span/span");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("section#right div.summary-body > button");
		By BrzziTiketDugme = By.cssSelector("section#right a");
		By title = By.cssSelector("#right > div > div.vb-content > section > section > section.overlay > section > section > footer > article > div > div.message");
		By UreduDugme = By.cssSelector("section#right button.button.close");
		By obican = By.cssSelector("#right > div > div.vb-content > section > section > header > div.left-part > div.pointer.regular");
		
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
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
		public WebElement obican() {
			return driver.findElement(obican);
		}
}
