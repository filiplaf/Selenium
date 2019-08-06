package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrzziTiketPage {

		public WebDriver driver;
		By ObrisiDugme = By.cssSelector("span#bt-clear-all");
		By mec1 = By.xpath("//*[@id=\"all-matches\"]/div[3]/table/tbody/tr[1]/td[2]");
		By mec2 = By.xpath("//*[@id=\"all-matches\"]/div[3]/table/tbody/tr[4]/td[7]");
		By mec3 = By.xpath("//*[@id=\"all-matches\"]/div[3]/table/tbody/tr[7]/td[2]");
		By simplu = By.cssSelector("a#ui-id-2");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("div#ordinary-ticket button");
		By BrzziTiketDugme = By.cssSelector("div#ticket-popup-holder button.button.send");
		By title = By.cssSelector("div#ticket-popup-holder div.fast-ticket");
		By UreduDugme = By.cssSelector("div#ticket-popup-holder button.button.ok");
		
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
		public WebElement Simplu() {
			return driver.findElement(simplu);
		}
}
