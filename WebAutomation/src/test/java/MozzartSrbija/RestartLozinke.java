package MozzartSrbija;

import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.base;
import pageObjectsSrbija.ZaboravljenaLozinkaPage;

public class RestartLozinke extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void restartLozinke() throws IOException, InterruptedException {
		wait_time(7);
		driver = initializeDriver();
		driver.get(prop.getProperty("url6"));
		//Yomail
		Login login = new Login();
		WebElement MailName = driver.findElement(By.id("login"));
		MailName.sendKeys(login.username);
		MailName.sendKeys(Keys.ENTER);
		//Switch na frame i klik na link
		WebElement iframeMsg = driver.findElement(By.id("ifmail"));
		driver.switchTo().frame(iframeMsg); 
		wait_time(2);
		WebElement Clicklink = driver.findElement(By.xpath("//a[contains(@href,'new-password')]"));
		Clicklink.click();
		//Switcujemo se na novi tab
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();  
		for (String handle : handles) {
		    if (!handle.equals(mainWindow)) {
		          driver.switchTo().window(handle);
		          break;
		    }
		}
		//Popunjavamo polja za promenu sifre
	   ZaboravljenaLozinkaPage zl = new ZaboravljenaLozinkaPage(driver);
	   zl.lozinka().sendKeys(login.password);
	   zl.ponoviLozinku().sendKeys(login.password);
	   zl.posaljiZahtevDugme().click();
	   
		driver.close();
		driver.quit();
	}
}
