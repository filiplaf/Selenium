package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lucky6Page {

		public WebDriver driver;
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplataDugme = By.cssSelector("div#pageWrapper div.summary-body.subgame > button");
		By uplataDugme2 = By.cssSelector("div#pageWrapper button.button.pay");
		By title = By.cssSelector("div.confirmation-footer>article>div>div:nth-child(2)");
		By jackpotCode = By.cssSelector("div#pageWrapper div.fast-ticket-wrapper > p");
		By UreduDugme = By.cssSelector("div#pageWrapper div.actions > button");
		By slucajniOdabir = By.xpath("//*[contains(text(), 'Random pick')]");
		
		
		public Lucky6Page(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
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
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement jackpotCode() {
			return driver.findElement(jackpotCode);
		}
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
		public WebElement slucajniOdabir() {
			return driver.findElement(slucajniOdabir);
		}
}
