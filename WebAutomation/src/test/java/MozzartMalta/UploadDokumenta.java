package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.DocumentUpload;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class UploadDokumenta extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void UploadDokumenta() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.user()).perform();
		lp.account().click();
		MojRacun mr = new MojRacun(driver);
		Thread.sleep(1000);
		mr.DocumentUpload().click();
		DocumentUpload du = new DocumentUpload(driver);
		du.Upload().sendKeys("C:\\Users\\filip.jakovlevski\\Desktop\\Sema.png");
		Thread.sleep(2000);
		du.UploadButton().click();
		Thread.sleep(2000);
		du.OkButton().click();
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}

}
