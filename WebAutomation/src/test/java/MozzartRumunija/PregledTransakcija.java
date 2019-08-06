package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import resources.base;

public class PregledTransakcija extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Transakcije() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getCont().click();
		MojRacun mr = new MojRacun(driver);
		mr.Transakcije().click();
		Thread.sleep(2000);
		String x = mr.TransakcijeTitle().getText();
		if(x.length()>0) {
			log.info("Ima transakcija");
		}
		else
			log.info("Nema transakcija");
	}
	
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
