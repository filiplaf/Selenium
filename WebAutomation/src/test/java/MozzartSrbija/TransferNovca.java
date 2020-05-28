package MozzartSrbija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.TransferPage;
import resources.base;



public class TransferNovca extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(priority=1)
	public void transfer() throws IOException, InterruptedException {
	TransferPage tp = new TransferPage(driver);
	tp.korisnik().click();
	tp.tranferDugme().click();
	tp.iznos().sendKeys("2000");
	tp.transferDugme2().click();
	String title = tp.title().getText();
	if(title.contains("Uspešno")) {
		log.info(title);
	}
	else log.error("Greska prilikom transfera");
	tp.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void brziTransfer() throws IOException, InterruptedException {
	TransferPage tp = new TransferPage(driver);
	selectBrziTransfer();
	wait_time(3);
	String title = tp.title().getText();
	if(title.contains("Uspešno")) {
		log.info(title);
	}
	else log.error("Greska prilikom transfera");
	tp.ureduDugme().click();
	}
	
@AfterTest(alwaysRun = true)
public void teardown() {
	driver.close();
	driver.quit();
}

}