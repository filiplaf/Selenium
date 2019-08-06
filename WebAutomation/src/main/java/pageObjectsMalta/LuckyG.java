package pageObjectsMalta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LuckyG {

		public WebDriver driver;
		By GrckiTombo2 = By.cssSelector("div#pageWrapper div.vb-content > div:nth-child(1) > div");
		By GrckiTombo2Time = By.cssSelector("div#pageWrapper div:nth-child(1) > ul > li:nth-child(2)");
		By GrckiTombo2Kugla1 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(14)");
		By GrckiTombo2Kugla2 = By.cssSelector("div#spa p:nth-child(58)");
		By GrckiTombo3 = By.cssSelector("div#spa div.vb-content > div:nth-child(2) > div");
		By GrckiTombo3Time = By.xpath("//*[@id=\"pageWrapper\"]/section/article/article[1]/div/div[1]/div[2]/ul/li[2]");
		By GrckiTombo3Kugla1 = By.cssSelector("div#spa p:nth-child(24)");
		By GrckiTombo3Kugla2 = By.cssSelector("div#spa p:nth-child(49)");
		By GrckiTombo3Kugla3 = By.cssSelector("div#spa p:nth-child(80)");
		By GrckiTombo4 = By.cssSelector("div#spa div.vb-content > div:nth-child(3) > div");
		By GrckiTombo4Time = By.xpath("//*[@id=\"pageWrapper\"]/section/article/article[1]/div/div[1]/div[3]/ul/li[2]");
		By GrckiTombo4Kugla1 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(14)");
		By GrckiTombo4Kugla2 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(25)");
		By GrckiTombo4Kugla3 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(36)");
		By GrckiTombo4Kugla4 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(66)");
		By GrckiTombo5 = By.cssSelector("div#spa div.vb-content > div:nth-child(4) > div");
		By GrckiTombo5Time = By.xpath("//*[@id=\"pageWrapper\"]/section/article/article[1]/div/div[1]/div[4]/ul/li[2]");
		By GrckiTombo5Kugla1 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(3)");
		By GrckiTombo5Kugla2 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(22)");
		By GrckiTombo5Kugla3 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(45)");
		By GrckiTombo5Kugla4 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(66)");
		By GrckiTombo5Kugla5 = By.cssSelector("div#spa div.numbers.lucky > p:nth-child(79)");
		
		By uplata = By.cssSelector("div#pageWrapper div.payment > input");
		By uplataDugme = By.id("pay-lucky-ticket");
		By uplataDugme2 = By.cssSelector("div#pageWrapper div.actions > button");
		By UreduDugme = By.cssSelector("div#spa button.button.close");
		By title = By.cssSelector("div#pageWrapper div.message");
		
		By activeDugme = By.cssSelector("div#pageWrapper div.payment > div > button");

		
		public LuckyG(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement GrckiTombo2() {
			return driver.findElement(GrckiTombo2);
		}
		public WebElement GrckiTombo2Time() {
			return driver.findElement(GrckiTombo2Time);
		}
		public WebElement GrckiTombo2Kugla1() {
			return driver.findElement(GrckiTombo2Kugla1);
		}
		public WebElement GrckiTombo2Kugla2() {
			return driver.findElement(GrckiTombo2Kugla2);
		}
		public WebElement GrckiTombo3() {
			return driver.findElement(GrckiTombo3);
		}
		public WebElement GrckiTombo3Time() {
			return driver.findElement(GrckiTombo3Time);
		}
		public WebElement GrckiTombo3Kugla1() {
			return driver.findElement(GrckiTombo3Kugla1);
		}
		public WebElement GrckiTombo3Kugla2() {
			return driver.findElement(GrckiTombo3Kugla2);
		}
		public WebElement GrckiTombo3Kugla3() {
			return driver.findElement(GrckiTombo3Kugla3);
		}
		public WebElement GrckiTombo4() {
			return driver.findElement(GrckiTombo4);
		}
		public WebElement GrckiTombo4Time() {
			return driver.findElement(GrckiTombo4Time);
		}
		public WebElement GrckiTombo4Kugla1() {
			return driver.findElement(GrckiTombo4Kugla1);
		}
		public WebElement GrckiTombo4Kugla2() {
			return driver.findElement(GrckiTombo4Kugla2);
		}
		public WebElement GrckiTombo4Kugla3() {
			return driver.findElement(GrckiTombo4Kugla3);
		}
		public WebElement GrckiTombo4Kugla4() {
			return driver.findElement(GrckiTombo4Kugla4);
		}
		public WebElement GrckiTombo5() {
			return driver.findElement(GrckiTombo5);
		}
		public WebElement GrckiTombo5Time() {
			return driver.findElement(GrckiTombo5Time);
		}
		public WebElement GrckiTombo5Kugla1() {
			return driver.findElement(GrckiTombo5Kugla1);
		}
		public WebElement GrckiTombo5Kugla2() {
			return driver.findElement(GrckiTombo5Kugla2);
		}
		public WebElement GrckiTombo5Kugla3() {
			return driver.findElement(GrckiTombo5Kugla3);
		}
		public WebElement GrckiTombo5Kugla4() {
			return driver.findElement(GrckiTombo5Kugla4);
		}
		public WebElement GrckiTombo5Kugla5() {
			return driver.findElement(GrckiTombo5Kugla5);
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
		public WebElement activeDugme() {
			return driver.findElement(activeDugme);
		}
		

		
}
