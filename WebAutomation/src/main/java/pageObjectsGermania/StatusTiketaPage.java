package pageObjectsGermania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StatusTiketaPage {

		public WebDriver driver;
		By sifraTiketa = By.cssSelector("div#tabs input");
		By pronadjiListic = By.cssSelector("div#tabs div.footerTC > div");
		By ureduDugme = By.cssSelector("div#pageWrapper button");
		By provjeraLotoListic = By.cssSelector("div#tabs a:nth-child(2)");
		
		public StatusTiketaPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement sifraTiketa() {
			return driver.findElement(sifraTiketa);
		}
		public WebElement pronadjiListic() {
			return driver.findElement(pronadjiListic);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement provjeraLotoListic() {
			return driver.findElement(provjeraLotoListic);
		}
}