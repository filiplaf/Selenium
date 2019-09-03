package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LotoPage {

		public WebDriver driver;
		By GrckiLoto = By.partialLinkText("GRCKI");
		//By GrckiLoto = By.xpath("//div[@class='dotted-border trigger']");
		By GrckiLotoTime = By.cssSelector("div#pageWrapper div:nth-child(2) > div > ul > li:nth-child(2)");
		By GrckiLotoKugla1 = By.cssSelector("div#pageWrapper p:nth-child(23)");
		By GrckiLotoKugla2 = By.cssSelector("div#pageWrapper p:nth-child(31)");
		By GrckiLotoKugla3 = By.cssSelector("div#pageWrapper p:nth-child(69)");
		By GrckiLotoKugla4 = By.cssSelector("div#pageWrapper p:nth-child(25)");
		By GrckiLotoKugla5 = By.cssSelector("div#pageWrapper p:nth-child(11)");
		By GrckiLotoKugla6 = By.cssSelector("div#pageWrapper p:nth-child(44)");
		By GrckiLotoKugla7 = By.cssSelector("div#pageWrapper p:nth-child(24)");
		By GrckiLotoKugla8 = By.cssSelector("div#pageWrapper p:nth-child(12)");
		By ItalijanskiLoto = By.cssSelector(".dotted-border.trigger");
		By ItalijanskiLotoTime = By.cssSelector("div#pageWrapper div:nth-child(4) > div > ul > li:nth-child(2)");
		By ItalijanskiLotoKugla1 = By.cssSelector("div#pageWrapper p:nth-child(23)");
		By ItalijanskiLotoKugla2 = By.cssSelector("div#pageWrapper p:nth-child(31)");
		By ItalijanskiLotoKugla3 = By.cssSelector("div#pageWrapper p:nth-child(69)");
		By ItalijanskiLotoKugla4 = By.cssSelector("div#pageWrapper p:nth-child(25)");
		By ItalijanskiLotoKugla5 = By.cssSelector("div#pageWrapper p:nth-child(11)");
		By ItalijanskiLotoKugla6 = By.cssSelector("div#pageWrapper p:nth-child(44)");
		By ItalijanskiLotoKugla7 = By.cssSelector("div#pageWrapper p:nth-child(24)");
		By ItalijanskiLotoKugla8 = By.cssSelector("div#pageWrapper p:nth-child(12)");
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplataSingl = By.cssSelector("div#pageWrapper input");
		By uplataDugmeSingl = By.id("pay-subgame-ticket");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugme2 = By.cssSelector("div#pageWrapper div.actions > button");
		By UreduDugme = By.cssSelector("div#pageWrapper button.button.close");
		By title = By.cssSelector("div#pageWrapper div.message");
		By sistemski = By.xpath("//*[@id=\"1\"]");
		By singligra = By.cssSelector("div#pageWrapper div.lotto-sliders > div:nth-child(1) > div:nth-child(4)");
		By closeTicket = By.cssSelector("div#lotto-ticket span.bt-clear-all.sprite-bg.close-small");
		By confirmCloseTicket = By.cssSelector("div#lotto-ticket-popup-holder button.button.confirm_clear.ok");
		By activeDugme = By.cssSelector("#pageWrapper > section > article > article.lotto-right-section > div > div.vb-content > section > section > section:nth-child(2) > article > div.summary > div.summary-header > div.payment > div > button");
		
		public LotoPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement singligra() {
			return driver.findElement(singligra);
		}
		public WebElement GrckiLoto() {
			return driver.findElement(GrckiLoto);
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
		public WebElement GrckiLotoKugla4() {
			return driver.findElement(GrckiLotoKugla4);
		}
		public WebElement GrckiLotoKugla5() {
			return driver.findElement(GrckiLotoKugla5);
		}
		public WebElement GrckiLotoKugla6() {
			return driver.findElement(GrckiLotoKugla6);
		}
		public WebElement GrckiLotoKugla7() {
			return driver.findElement(GrckiLotoKugla7);
		}
		public WebElement GrckiLotoKugla8() {
			return driver.findElement(GrckiLotoKugla8);
		}
		public WebElement ItalijanskiLoto() {
			return driver.findElement(ItalijanskiLoto);
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
		public WebElement ItalijanskiLotoKugla4() {
			return driver.findElement(ItalijanskiLotoKugla4);
		}
		public WebElement ItalijanskiLotoKugla5() {
			return driver.findElement(ItalijanskiLotoKugla5);
		}
		public WebElement ItalijanskiLotoKugla6() {
			return driver.findElement(ItalijanskiLotoKugla6);
		}
		public WebElement ItalijanskiLotoKugla7() {
			return driver.findElement(ItalijanskiLotoKugla7);
		}
		public WebElement ItalijanskiLotoKugla8() {
			return driver.findElement(ItalijanskiLotoKugla8);
		}
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDugmeSingl() {
			return driver.findElement(uplataDugmeSingl);
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
		public WebElement sistemski() {
			return driver.findElement(sistemski);
		}
		public WebElement uplataSingl() {
			return driver.findElement(uplataSingl);
		}
		public WebElement closeTicket() {
			return driver.findElement(closeTicket);
		}
		public WebElement confirmCloseTicket() {
			return driver.findElement(confirmCloseTicket);
		}
		public WebElement activeDugme() {
			return driver.findElement(activeDugme);
		}
		
}
