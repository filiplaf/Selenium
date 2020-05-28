package MozzartGermania;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import resources.base;
import MozzartGermania.Login;

public class balans extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(alwaysRun = true)
	public void webBalans() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url1"));
		LandingPage lp = new LandingPage(driver);
		Login login = new Login();
		lp.cookie().click();
		driver.navigate().refresh();
		lp.getUsername().sendKeys(login.username);
		lp.getPassword().sendKeys(login.password);
		lp.getButtonClick().click();
		lp.getKorisnik().click();
		String Ime = lp.getnameNavigation().getText();
		String TextBalans = lp.balans().getText();
		int Balans = Integer.parseInt(TextBalans.replaceAll("[^0-9]", ""))/100;
		log.info("/*****************************************************/");
		log.info("Balans na webu je! " + TextBalans);
		try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\balansGermania.txt")) {
	        writecsv.append(Balans + "");  //dodajemo + "" da bi mogao da se upise u fajl
		}

		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
	}
		
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
