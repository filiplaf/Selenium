package MozzartGermania;

import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsGermania.LandingPage;
import pageObjectsGermania.ZaboravljenaLozinkaPage;
import resources.base;

public class ZaboravljenaLozinka extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void zaboravljenaSifra() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		driver = initializeDriver();
		driver.get(prop.getProperty("url1"));
		LandingPage lp = new LandingPage(driver);
		Login login = new Login();
		ZaboravljenaLozinkaPage zl = new ZaboravljenaLozinkaPage(driver);
		lp.cookie().click();
		driver.navigate().refresh();
		lp.zaboravljenaLozinka().click();
		//Switchujemo se na novi tab!!
	    Set<String> handles = driver.getWindowHandles();
	    String currentHandle = driver.getWindowHandle();
	    for (String handle : handles) {
	     if (!handle.equals(currentHandle))
	     {
	         driver.switchTo().window(handle);
	     }
	   }
		zl.korisnickoIme().sendKeys(login.username);
		zl.posaljiZahtevDugme().click();
		wait_time(2);
		takeScreenshotGermania(name);
		String title = zl.title().getText();
		log.info(title);
		zl.ureduDugme().click();
		
}
}
