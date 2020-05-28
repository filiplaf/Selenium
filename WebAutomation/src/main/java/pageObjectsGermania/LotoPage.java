package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LotoPage {

		public WebDriver driver;
		By grckiLotoTime = By.cssSelector("div#pageWrapper li:nth-child(2)");
		By uplata = By.cssSelector("div#spa div.payment > input");
		By uplataSingl = By.id("pay-subgame-ticket");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugme2 = By.cssSelector("div#pageWrapper div.actions > button");
		By ureduDugme = By.cssSelector("div#spa button.button.close");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By sistemski = By.xpath("//*[@id=\"1\"]");
		By zbir = By.cssSelector("div#spa div.lotto-sliders > div:nth-child(1) > div:nth-child(4)");
		By checkbox = By.cssSelector("div#pageWrapper div:nth-child(1) > input");
		
		public LotoPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement grckiLotoTime() {
			return driver.findElement(grckiLotoTime);
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
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement sistemski() {
			return driver.findElement(sistemski);
		}
		public WebElement zbir() {
			return driver.findElement(zbir);
		}
		public WebElement uplataSingl() {
			return driver.findElement(uplataSingl);
		}
		public WebElement checkbox() {
			return driver.findElement(checkbox);
		}
		
}
