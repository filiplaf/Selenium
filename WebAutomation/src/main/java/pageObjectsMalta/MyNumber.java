package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyNumber {

		public WebDriver driver;
		By GrckiLotoTime = By.cssSelector("div#pageWrapper div:nth-child(2) > ul > li:nth-child(2)");
		By GrckiLotoKugla1 = By.cssSelector("div#pageWrapper p:nth-child(24)");
		By GrckiLotoKugla2 = By.cssSelector("div#pageWrapper p:nth-child(28)");
		By GrckiLotoKugla3 = By.cssSelector("div#spa p:nth-child(56) > span.n");
		By ItalijanskiLotoTime = By.cssSelector("div#pageWrapper div:nth-child(2) > div:nth-child(1) > ul > li:nth-child(2)");
		By ItalijanskiLotoKugla1 = By.cssSelector("div#spa p:nth-child(46) > span.n");
		By ItalijanskiLotoKugla2 = By.cssSelector("div#spa p:nth-child(68) > span.n");
		By ItalijanskiLotoKugla3 = By.cssSelector("div#spa p:nth-child(83) > span.n");
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplataSingl = By.xpath("//*[@id=\"pay-subgame-ticket\"]");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugme2 = By.cssSelector("div#pageWrapper div.actions > button");
		By UreduDugme = By.cssSelector("div#spa button.button.close");
		By title = By.xpath("//*[contains(text(), My number | GREEK KENO (20/80) | Draw time: ')]");
		By title2 = By.xpath("//*[contains(text(), 'Moj broj | ITALIJANSKI')]");
		By title3 = By.cssSelector("div#pageWrapper div.message");
		By sistemski = By.cssSelector("div#pageWrapper div:nth-child(2) > input");
		By zbir = By.cssSelector("div#pageWrapper div.lotto-sliders > div:nth-child(1) > div:nth-child(4)");
		
		public MyNumber(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement GrckiLotoTime() {
			return driver.findElement(GrckiLotoTime);
		}
		
		public WebElement GrckiLotoKugla1() {
			return driver.findElement(GrckiLotoKugla1);
		}
		public WebElement GrckiLotoKugla2() {
			return driver.findElement(GrckiLotoKugla2);
		}
		public WebElement GrckiLotoKugla3() {
			return driver.findElement(GrckiLotoKugla3);
		}
		public WebElement ItalijanskiLotoTime() {
			return driver.findElement(ItalijanskiLotoTime);
		}
		public WebElement ItalijanskiLotoKugla1() {
			return driver.findElement(ItalijanskiLotoKugla1);
		}
		public WebElement ItalijanskiLotoKugla2() {
			return driver.findElement(ItalijanskiLotoKugla2);
		}
		public WebElement ItalijanskiLotoKugla3() {
			return driver.findElement(ItalijanskiLotoKugla3);
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
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement title2() {
			return driver.findElement(title2);
		}
		public WebElement title3() {
			return driver.findElement(title3);
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
		
}
