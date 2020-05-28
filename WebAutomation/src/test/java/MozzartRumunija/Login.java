package MozzartRumunija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import resources.base;

public class Login extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
public String username = "jakov16";
public String password = "8888888A";

	@Test(groups = {"Login.test"} , alwaysRun = true, dataProvider = "getData")
	public void MozzartHomePage(String Username,String Password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url2"));
		LandingPage lp = new LandingPage(driver);
		lp.cookie().click();
		driver.navigate().refresh();
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getButtonClick().click();
		lp.user().click();
		String Ime = lp.getKorisnik().getText();
		log.info("/************************************************************************************/");
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		//Row stands dor how many different data types test should run
		//Column stands for how many values send per test
		Object[][] data = new Object[1][2];             // 3 test, 2 parametars username and password
		data[0][0] = "username";
		data[0][1] = "password";
		
		return data;
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
