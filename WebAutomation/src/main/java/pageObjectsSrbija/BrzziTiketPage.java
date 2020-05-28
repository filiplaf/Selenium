package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrzziTiketPage {

		public WebDriver driver;
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataSistemski = By.cssSelector("section#vbar-center div.payment > input");
		By uplataDugme = By.cssSelector("section#right div.summary-body > button");
		By brzziTiketDugme = By.cssSelector("section#right a");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By ureduDugme = By.cssSelector("section#right button.button.close");
		By obican = By.cssSelector("section#right div.pointer.regular");
		By sistemski = By.cssSelector("section#right div.pointer.system");
		By checkbox1 = By.cssSelector("section#vbar-center div:nth-child(1) > input");
		By checkbox2 = By.cssSelector("section#vbar-center div:nth-child(2) > input");
		
		public BrzziTiketPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
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
		public WebElement checkbox1() {
			return driver.findElement(checkbox1);
		}
		public WebElement checkbox2() {
			return driver.findElement(checkbox2);
		}
}
