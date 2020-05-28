package MozzartRumunija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import resources.base;

public class ProveraKazinoBalansa extends base {
public static Logger log = LogManager.getLogger();
Login login = new Login();

public double value;
public String BalansWeb;

	@Test
	public void izvlacenjeBalansaIzJson() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		try {
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kazinoBalansRumunija.json"));
	    Object userId = jsonObject.get("userId");
	    value = (double) jsonObject.get("casinoTotal");
		log.info("Korisnik " +login.username+ " ciji je userID " + userId + " ima kazino balans sa Omege " + value);
    }
		catch (Exception e) {
			log.info("Kazino balans je null");
		}
}

	@Test(priority=1) 
	public void balansWeb() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url2"));
		LandingPage lp = new LandingPage(driver);
		Login login = new Login();
		driver.navigate().refresh();
		lp.cookie().click();
		lp.getUsername().sendKeys(login.username);
		lp.getPassword().sendKeys(login.password);
		lp.getButtonClick().click();
		lp.user().click();
		String Ime = lp.getKorisnik().getText();
		String Balans = lp.kazinoBalans().getText();
		log.info("Kazino balans na webu za igraca " +Ime+ " je: " + Balans);
		BalansWeb = Balans.substring(0, Balans.length()-2);   // string bez zadnja 2 karaktera sto predstavalju poslednje 2 decimale
}
	@Test(priority=2)
	public void proveraBalansa() {
	int balansWeb = Integer.parseInt(BalansWeb.replaceAll("[^0-9]", ""));	//zamenjujem znakove (tacku i zareze) praznim poljima i prebacujem u int radi uporedjivanja
	int balansOmega=(int) (Math.round(value));   //prebacujem double u integer
	if(balansWeb==balansOmega) {
		log.info("Kazino balans na webu JE isti kao i na Omegi");
	}
	else log.info("Kazino balans na webu NIJE isti kao i na Omegi");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		//driver.close();
		driver.quit();
	}
	
}
