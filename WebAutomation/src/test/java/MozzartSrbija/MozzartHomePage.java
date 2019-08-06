package MozzartSrbija;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class MozzartHomePage extends base {

	
	public MozzartHomePage(String Username,String Password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getButtonClick().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		//Row stands dor how many differen data types test should run
		//Column stands for how many values send per test
		Object[][] data = new Object[0][2];             // 3 test, 2 parametars username and password
		data[0][0] = "pera61";
		data[0][1] = "888888";

//		data[1][0] = "pera36";
//		data[1][1] = "888888";
//		
//		data[2][0] = "pera37";
//		data[2][1] = "888888";
		
		return data;
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		//driver=null;
		driver.quit();
	}
}
