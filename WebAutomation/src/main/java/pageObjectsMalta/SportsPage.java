package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportsPage {

		public WebDriver driver;
		By uplata = By.id("bettingAmount");
		By uplataSistemski = By.cssSelector("section#vbar-center div.payment > input");
		By uplataDugme = By.id("pay-ticket");
		By uplataDugmeSistemski = By.cssSelector("section#right div.summary-body > button");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By ureduDugme = By.cssSelector("section#right button.button.close");
		By sistemski = By.cssSelector("section#right div.pointer.system");
		By checkbox = By.cssSelector("section#vbar-center div:nth-child(1) > input");
		By checkbox1 = By.cssSelector("section#vbar-center div:nth-child(2) > input");
		By izaberiBenefit = By.cssSelector("article#testprint div.benefits");
		By klikBenefit = By.xpath("//*[@id=\"testprint\"]/div[2]/div[1]/div[2]/div/p[2]");
		By title = By.cssSelector("section#right div.message");
		
		public SportsPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement uplata() {
			return driver.findElement(uplata);
		}
		public WebElement uplataSistemski() {
			return driver.findElement(uplataSistemski);
		}
		public WebElement uplataDugme() {
			return driver.findElement(uplataDugme);
		}
		public WebElement uplataDugmeSistemski() {
			return driver.findElement(uplataDugmeSistemski);
		}
		public WebElement uplataDugme2() {
			return driver.findElement(uplataDugme2);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement ureduDugme() {
			return driver.findElement(ureduDugme);
		}
		public WebElement sistemski() {
			return driver.findElement(sistemski);
		}
		public WebElement checkbox() {
			return driver.findElement(checkbox);
		}
		public WebElement checkbox1() {
			return driver.findElement(checkbox1);
		}
		public WebElement izaberiBenefit() {
			return driver.findElement(izaberiBenefit);
		}
		public WebElement klikBenefit() {
			return driver.findElement(klikBenefit);
		}
		
}
