package pageObjectsSrbija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KladjenjePage {

		public WebDriver driver;
		By mec1 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[1]/div/div[2]/div[1]/div[1]/span/span");
		By mec2 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[2]/div/div[2]/div[1]/div[1]/span/span");
		By mec3 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[3]/div/div[2]/div[1]/div[1]/span/span");
		By mec4 = By.xpath("//*[@id=\"focus\"]/section[1]/div[3]/div[2]/article[4]/div/div[2]/div[1]/div[1]/span/span");
		By uplata = By.cssSelector("input#bettingAmount");
		By uplataDugme = By.cssSelector("button#pay-ticket");
		By uplataDugmeSistemski = By.cssSelector("section#right div.summary-body > button");
		By uplataDugme2 = By.cssSelector("section#right button.button.pay");
		By title = By.cssSelector("#right > div > div.vb-content > section > section > section.overlay > section > section > header > div > div.title");
		By UreduDugme = By.cssSelector("section#right button.button.close");
		By sistemski = By.cssSelector("section#right div.pointer.system");
		By checkbox = By.cssSelector("section#right div:nth-child(3) > input");
		By checkbox1 = By.cssSelector("section#right div > div:nth-child(4) > input");
		By izaberiBenefit = By.cssSelector("section#vbar-center div.benefits");
		By klikBenefit = By.xpath("//*[@id=\"vbar-center\"]/div/div[1]/div[2]/div/p[2]");
		By title1 = By.cssSelector("#right > div > div.vb-content > section > section > section.overlay > section > section > footer > article > div > div.message");
		
		public KladjenjePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement getmec1() {
			return driver.findElement(mec1);
		}
		public WebElement getmec2() {
			return driver.findElement(mec2);
		}
		public WebElement getmec3() {
			return driver.findElement(mec3);
		}
		public WebElement getmec4() {
			return driver.findElement(mec4);
		}
		public WebElement uplata() {
			return driver.findElement(uplata);
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
		public WebElement UreduDugme() {
			return driver.findElement(UreduDugme);
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
		public WebElement title1() {
			return driver.findElement(title1);
		}
		
}
