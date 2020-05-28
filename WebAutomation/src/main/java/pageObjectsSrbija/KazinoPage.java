package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KazinoPage {

		public WebDriver driver;
		By casomatic = By.cssSelector("div#pageWrapper article:nth-child(5) > div.footer");
		By casomaticPlay = By.cssSelector("div#pageWrapper article:nth-child(5) > div.footer > div > p:nth-child(1)");
		By kazinoBalans = By.cssSelector("#pageWrapper > section > section > section > section.central-part > article.footer > div > section > article > article.manual-transfer > div > div > p:nth-child(2)");
		
		public KazinoPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		public WebElement casomatic() {
			return driver.findElement(casomatic);
		}
		public WebElement casomaticPlay() {
			return driver.findElement(casomaticPlay);
		}
		public WebElement kazinoBalans() {
			return driver.findElement(kazinoBalans);
		}
}
