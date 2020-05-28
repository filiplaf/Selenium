package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PredefinisanTiketPage {

		public WebDriver driver;
		By uplata = By.cssSelector("div#pageWrapper div.place");
		By uplata2 = By.cssSelector("div#pageWrapper button.button.pay");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By ureduDugme = By.cssSelector("div#pageWrapper button");
		By slucajniOdabir = By.cssSelector("div#pageWrapper div.random");
		
		public PredefinisanTiketPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplata2() {
			return driver.findElement(uplata2);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement slucajniOdabir() {
			return driver.findElement(slucajniOdabir);
		}
}
