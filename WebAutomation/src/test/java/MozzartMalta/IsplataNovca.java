package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class IsplataNovca extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void isplataNaSkrill() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		String user = lp.userName().getText();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.withdrawal().click();
		mr.skrill().click();
		mr.skrillAmount().sendKeys("20");
		mr.skrillMail().sendKeys(user+"@yopmail.com");
		mr.withdrawalButton().click();
		waitForTextToAppear(driver, "Withdrawal successful", mr.confirmTitle());
		String title = mr.confirmTitle().getText();
		log.info(title + " od 20 eura");
		mr.closeButton().click();
		
		wait_time(1);
		mr.withdrawal().click();
		mr.skrill().click();
		mr.skrillAmount().sendKeys("21");
		mr.skrillMail().sendKeys(user+"@yopmail.com");
		mr.withdrawalButton().click();
		waitForTextToAppear(driver, "Withdrawal successful", mr.confirmTitle());
		log.info(title + " od 21 eura");
		mr.closeButton().click();
		
		wait_time(1);
		mr.withdrawal().click();
		mr.skrill().click();
		mr.skrillAmount().sendKeys("22");
		mr.skrillMail().sendKeys(user+"@yopmail.com");
		mr.withdrawalButton().click();
		waitForTextToAppear(driver, "Withdrawal successful", mr.confirmTitle());
		log.info(title + " od 22 eura");
		mr.closeButton().click();
		
		wait_time(1);
		mr.withdrawal().click();
		mr.skrill().click();
		mr.skrillAmount().sendKeys("23");
		mr.skrillMail().sendKeys(user+"@yopmail.com");
		mr.withdrawalButton().click();
		waitForTextToAppear(driver, "Withdrawal successful", mr.confirmTitle());
		log.info(title + " od 23 eura");
		mr.closeButton().click();
		
		wait_time(1);
		mr.withdrawal().click();
		mr.skrill().click();
		mr.skrillAmount().sendKeys("24");
		mr.skrillMail().sendKeys(user+"@yopmail.com");
		mr.withdrawalButton().click();
		waitForTextToAppear(driver, "Withdrawal successful", mr.confirmTitle());
		log.info(title + " od 24 eura");
		mr.closeButton().click();
		}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
