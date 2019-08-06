package pageObjectsRumunija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LotoPage {

		public WebDriver driver;
		By GrckiLoto = By.partialLinkText("GRCKI");
		//By GrckiLoto = By.xpath("//div[@class='dotted-border trigger']");
		By GrckiLotoTime = By.cssSelector("ul#acc li:nth-child(2) > a");
		By GrckiLotoKugla1 = By.id("cn6");
		By GrckiLotoKugla2 = By.id("cn31");
		By GrckiLotoKugla3 = By.id("cn69");
		By GrckiLotoKugla4 = By.id("cn25");
		By GrckiLotoKugla5 = By.id("cn11");
		By GrckiLotoKugla6 = By.id("cn44");
		By GrckiLotoKugla7 = By.id("cn23");
		By GrckiLotoKugla8 = By.id("cn9");
		By ItalijanskiLoto = By.cssSelector(".dotted-border.trigger");
		By ItalijanskiLotoTime = By.cssSelector("ul#acc li:nth-child(2) > a");
		By ItalijanskiLotoKugla1 = By.id("cn6");
		By ItalijanskiLotoKugla2 = By.id("cn31");
		By ItalijanskiLotoKugla3 = By.id("cn69");
		By ItalijanskiLotoKugla4 = By.id("cn25");
		By ItalijanskiLotoKugla5 = By.id("cn11");
		By ItalijanskiLotoKugla6 = By.id("cn44");
		By ItalijanskiLotoKugla7 = By.id("cn23");
		By ItalijanskiLotoKugla8 = By.id("cn9");
		By uplata = By.cssSelector("div#lotto-ticket div:nth-child(6) > input");
		By uplataSingl = By.cssSelector("div#lotto-additional-ticket input");
		By uplataDugmeSingl = By.id("pay-button-additional");
		By uplataDugme = By.id("pay-button");
		By uplataDugme2 = By.cssSelector("div#lotto-ticket-popup-holder button");
		By UreduDugme = By.cssSelector("div#lotto-ticket-popup-holder button.button.ok");
		By title = By.cssSelector("#lotto-ticket-popup-holder > div.ticket-info-popup.lotto-info-popup");
		By title2 = By.cssSelector("#lotto-ticket-popup-holder > div.ticket-info-popup.lotto-info-popup");
		By sistemski = By.xpath("//*[@id=\"lotto-ticket\"]/div/div/div[3]/div/div[1]/label");
		By singligra = By.xpath("//*[@id=\"lotto-game-26\"]/article[1]/div[2]/div/a");
		By zbir = By.cssSelector("section#lotto-game-26 article:nth-child(1) > div.odds-holder.slider-odds.last > a");
		By closeTicket = By.cssSelector("div#lotto-ticket span.bt-clear-all.sprite-bg.close-small");
		By confirmCloseTicket = By.cssSelector("div#lotto-ticket-popup-holder button.button.confirm_clear.ok");
		
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
		public WebElement title2() {
			return driver.findElement(title2);
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
		public WebElement closeTicket() {
			return driver.findElement(closeTicket);
		}
		public WebElement confirmCloseTicket() {
			return driver.findElement(confirmCloseTicket);
		}
		
}
