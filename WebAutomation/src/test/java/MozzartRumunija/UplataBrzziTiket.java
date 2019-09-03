package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.BrzziTiketPage;
import resources.base;

public class UplataBrzziTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void Uplata() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		bt.ObrisiDugme().click();
		Thread.sleep(2000);
		bt.getmec1().click();
		bt.getmec2().click();
		bt.getmec3().click();
		Thread.sleep(2000);
		bt.Simplu().click();
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		Thread.sleep(15000);
		String title = bt.title().getText();
		String title1 = bt.title1().getText();
		log.info(title + "" +title1);
		bt.UreduDugme().click();
		
		}
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
