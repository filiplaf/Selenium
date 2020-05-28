package MozzartSrbija;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import resources.base;
import MozzartSrbija.Login;

public class Balans extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(alwaysRun = true)
	public void homepage() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		Login login = new Login();
		lp.cookie().click();
		lp.getUsername().sendKeys(login.username);
		lp.getPassword().sendKeys(login.password);
		lp.getButtonClick().click();
		lp.userclick().click();
		String Ime = lp.getUser().getText();
		String TextBalans = lp.getBalans().getText();
		int Balans = Integer.parseInt(TextBalans.replaceAll("[^0-9]", ""))/100;
		System.out.println(Balans);
		log.info("/**********************************************************/");
		log.info("Balans na webu je! " + TextBalans);
		try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\balans.txt")) {
	        writecsv.append(Balans + "");
		}

		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
	}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
