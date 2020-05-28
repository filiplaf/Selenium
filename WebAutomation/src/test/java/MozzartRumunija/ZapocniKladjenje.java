package MozzartRumunija;

import java.io.IOException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;
import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.ZapocniKladjenjePage;
import MozzartRumunija.Registracija;

public class ZapocniKladjenje extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

public String adresa = "Bucuresti 11";

	@Test
	public void login() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url2"));
		LandingPage lp = new LandingPage(driver);
		Registracija reg = new Registracija();
		driver.navigate().refresh();
		lp.cookie().click();
		lp.getUsername().sendKeys(reg.korisnickoIme);
		lp.getPassword().sendKeys(reg.lozinka);
		lp.getButtonClick().click();
		lp.user().click();
		String Ime = lp.getKorisnik().getText();
		log.info("/************************************************************************************/");
		log.info("Korisnik " +Ime+ " je uspesno ulogovan");
	}

	@Test
	public void zapocniKladjenje() throws Exception {
	String name = new Object(){}.getClass().getEnclosingMethod().getName();
	LandingPage lp = new LandingPage(driver);
	lp.zapocniKladjenje().click();
	ZapocniKladjenjePage zk = new ZapocniKladjenjePage(driver);
	
	//Unos podataka na stranici
	//Grad koji se u object modelu zakucao u bucurest, treba popraviti ako moze
	wait_time(1);
	zk.grad().click();
	zk.bucurest().click();
	zk.adresa().sendKeys(adresa);
	zk.cnp().sendKeys("19001014");    //podeseno za 01.01.1990
	for(int i=0;i<5;i++) {
	Random rand = new Random();
	int randomBroj = rand.nextInt(8)+1;
	String cnp = Integer.toString(randomBroj);
	zk.cnp().sendKeys(cnp);
	}
	zk.usloviKoriscenja().click();
	zk.prihvatiDugme().click();
	wait_time(1);
	String title = zk.title().getText();
			if(title.contains("Multumim pentru finalizarea activarii contului de joc.")) {
				log.info("Uspesno ste aktivirali korisnika");
				takeScreenshotRumunija(name);
			}
			else
				log.error("Nije prikazan prozor za uspesnu aktivaciju");
	zk.okDugme().click();		
}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
	
