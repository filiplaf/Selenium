package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StatusTiketaPage {

		public WebDriver driver;
		By sifraTiketa = By.cssSelector("div#tabs input");
		By pronadjiTiket = By.cssSelector("div#tabs div.footerTC > div");
		By ureduDugme = By.cssSelector("div#pageWrapper div.actions > button");
		By mojBrojTiket = By.cssSelector("div#tabs a:nth-child(2)");
		
		public StatusTiketaPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement sifraTiketa() {
			return driver.findElement(sifraTiketa);
		}
		public WebElement pronadjiTiket() {
			return driver.findElement(pronadjiTiket);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement mojBrojTiket() {
			return driver.findElement(mojBrojTiket);
		}
}