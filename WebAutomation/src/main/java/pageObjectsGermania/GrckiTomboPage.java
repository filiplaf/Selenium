package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GrckiTomboPage {

		public WebDriver driver;

		By grckiTomboTime = By.cssSelector("div#pageWrapper li:nth-child(2)");
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplataDugme = By.id("pay-lucky-ticket");
		By uplataDugme2 = By.cssSelector("div#spa div.actions > button");
		By ureduDugme = By.cssSelector("div#spa button.button.close");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By activeDugme = By.cssSelector("div#pageWrapper div.payment > div > button");
		
		public GrckiTomboPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement grckiTomboTime() {
			return driver.findElement(grckiTomboTime);
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
		public WebElement activeDugme() {
			return driver.findElement(activeDugme);
		}
		

		
}
