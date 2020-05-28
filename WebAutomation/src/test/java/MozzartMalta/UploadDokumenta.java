package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.DocumentUpload;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class UploadDokumenta extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void uploadDokumenta() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.documentUpload().click();
		DocumentUpload du = new DocumentUpload(driver);
		du.upload().sendKeys("C:\\Git workspace\\Selenium\\WebAutomation\\PictureForTest\\picture.png");
		du.uploadButton().click();
		String title = du.title().getText();
		log.info(title);
		du.okButton().click();
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
