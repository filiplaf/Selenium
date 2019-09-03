package MozzartGermania;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import resources.base;

public class Login extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(dataProvider = "getData")
	public void MozzartHomePage(String Username,String Password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url1"));
		LandingPage lp = new LandingPage(driver);
		lp.znak().click();
		lp.Cookie().click();
		lp.getLogin().click();
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getButtonClick().click();
		String Ime = lp.getnameNavigation().getText();
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
		
	}
	
	@DataProvider
	public Object[][] getData() {
		//Row stands for how many different data types test should run
		//Column stands for how many values send per test
		Object[][] data = new Object[1][2];             // 3 test, 2 parametars username and password
		data[0][0] = "pera68";
		data[0][1] = "8888888A";
		
		return data;
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
