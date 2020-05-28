package MozzartMalta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.ChangePassword;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import MozzartMalta.Login;
import resources.base;

public class PromenaPassworda extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

public String newPassword = "8888888A";
public String confirmPassword = newPassword;

	@Test
	public void promenaPassworda() throws InterruptedException  {
		LandingPage lp = new LandingPage(driver);
		ChangePassword cp = new ChangePassword(driver);
		Login login = new Login();
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		wait_time(1);
		mr.changePassword().click();
		cp.password().sendKeys(login.password);
		cp.newPassword().sendKeys(newPassword);
		cp.confirmPassword().sendKeys(confirmPassword);
		cp.saveButton().click();
		wait_time(1);
		String title = cp.title().getText();
		log.info(title);
		cp.okButton().click();	
	}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
