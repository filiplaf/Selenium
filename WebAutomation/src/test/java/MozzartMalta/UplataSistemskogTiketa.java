package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.SportsPage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {

		SportsPage sp = new SportsPage(driver);
		sp.sistemski().click();
		sp.checkbox().click();
		sp.checkbox1().click();
		sp.uplataDugmeSistemski().click();
		sp.uplataDugme2().click();
		Thread.sleep(2000);
		String title = sp.title().getText();
		log.info(title);
		log.info("Sistemski tiket uplacen");
		sp.UreduDugme().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
