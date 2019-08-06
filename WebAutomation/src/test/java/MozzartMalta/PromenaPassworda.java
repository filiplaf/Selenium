package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
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
	public void PromenaPassworda() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		ChangePassword cp = new ChangePassword(driver);
		Login login = new Login();
		Actions action = new Actions(driver);
		action.moveToElement(lp.user()).perform();
		lp.account().click();
		MojRacun mr = new MojRacun(driver);
		mr.ChangePassword().click();
		cp.Password().sendKeys(login.password);
		cp.NewPassword().sendKeys(newPassword);
		cp.ConfirmPassword().sendKeys(confirmPassword);
		cp.SaveButton().click();
		Thread.sleep(2000);
		String title = cp.Title().getText();
		log.info(title);
		cp.OkButton().click();	
	}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
