package MozzartRumunija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.TransferPage;
import resources.base;

public class TransferNovca extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(priority=1)
	public void transfer() throws IOException, InterruptedException {
	TransferPage tp = new TransferPage(driver);
	LandingPage lp = new LandingPage(driver);
	tp.tranferDugme().click();
	tp.iznos().sendKeys("150");
	tp.transferDugme2().click();
	String title = tp.title().getText();
	if(title.contains("succes")) {
		log.info(title);
	}
	else log.error("Greska prilikom transfera");
	tp.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void brziTransfer() throws IOException, InterruptedException {
	TransferPage tp = new TransferPage(driver);
	selectBrziTransferRumunija();
	wait_time(3);
	String title = tp.title().getText();
	if(title.contains("succes")) {
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