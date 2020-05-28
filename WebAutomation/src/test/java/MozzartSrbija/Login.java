package MozzartSrbija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import resources.base;

public class Login extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
public String username = "jakov16";
public String password = "8888888A";

	@Test(groups = {"Login.test"} , alwaysRun = true, dataProvider = "getData")
	public void mozzartHomePage(String Username,String Passwsord) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.cookie().click();
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getButtonClick().click();
		lp.userclick().click();
		String Ime = lp.getUser().getText();
		log.info("/************************************************************************************/");
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
		lp.userclick().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		//Row stands for how many different data types test should run
		//Column stands for how many values send per test
		Object[][] data = new Object[1][2];             // 3 test, 2 parametars username and password
		data[0][0] = username;
		data[0][1] = password;
		
		return data;
	}
}
