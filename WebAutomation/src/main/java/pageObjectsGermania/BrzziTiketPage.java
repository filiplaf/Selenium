package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrzziTiketPage {

		public WebDriver driver;
		By uplata = By.id("bettingAmount");
		By uplataSistemski = By.cssSelector("section#vbar-center div.payment > input");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugmeSistemski = By.cssSelector("section#vbar-center button");
		By brzziTiketDugme = By.cssSelector("section#right a");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By ureduDugme = By.cssSelector("section#right div.actions > button");
		By obican = By.cssSelector("section#right div.pointer.regular");
		By sistemski = By.cssSelector("section#right div.pointer.system");
		By checkbox = By.cssSelector("section#vbar-center div:nth-child(1) > input");
		By checkbox1 = By.cssSelector("section#vbar-center div:nth-child(2) > input");
		
		public BrzziTiketPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}

		public WebElement uplataSistemski() {
			return driver.findElement(uplataSistemski);
		}
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDugmeSistemski() {
			return driver.findElement(uplataDugmeSistemski);
		}
		public WebElement uplataDBrzziTiketDugmeugme2() {
			return driver.findElement(brzziTiketDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement obican() {
			return driver.findElement(obican);
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
}
