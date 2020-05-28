package MozzartRumunija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.RegistrationPage;
import resources.base;

public class Registracija extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

public String korisnickoIme = "jakov16";
public String email = "jakov16@yopmail.com";
public String lozinka = "8888888A";
public String ponoviLozinku = lozinka;
public String ime = "Filip";
public String prezime = "Mutresku";
public int godina = 0;   // prva godina na listi u ovom slucaju 1990
public int mesec = 0;   // prvi mesecu u listi u ovom slucaju Januar
public String dan = "1"; // dan u mesecu 1

	@Test
	public void registacija() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		driver = initializeDriver();
		driver.get(prop.getProperty("url2"));
		Actions actions = new Actions(driver);
		LandingPage lp = new LandingPage(driver);
		lp.cookie().click();
		driver.navigate().refresh();
		lp.getRegistruj().click();
		wait_time(1);
		
		//Unosenje podataka
		RegistrationPage rp = new RegistrationPage(driver);
		rp.korisnickoIme().sendKeys(korisnickoIme);
		rp.email().sendKeys(email);
		rp.lozinka().sendKeys(lozinka);
		rp.ponoviLozinku().sendKeys(ponoviLozinku);
		rp.ime().sendKeys(ime);
		rp.prezime().sendKeys(prezime);
		//Otvaramo kalendar
		rp.kalendar().click();
		//Dupli klik da bi otvorili dekadu za godinu
		actions.doubleClick(rp.godina()).perform();
		//Da se vratimo u dekadu ranije 1990-1999
		wait_time(1);
		rp.levaStrelica().click();
		rp.pickYear().get(godina).click();   //1990
		rp.pickMonth().get(mesec).click();	//
		//Day
		for (int i=0; i<rp.pickDay().size(); i++) {
			String temp = rp.pickDay().get(i).getText();
			if(temp.equals(dan)) {
				rp.pickDay().get(i).click();
				break;
			}
		}
		//Promocije
		rp.promocije().click();
		//Uslovi koriscenja
		rp.usloviKoriscenja().click();
		rp.otvoriNalogDugme().click();
		//Poruka za aktivacioni mail
		if(waitForTextToAppear(driver, "Tocmai ți-am trimis un e-mail cu un link pentru a iți confirma înregistrarea. Te rog să accesezi linkul din e-mail pentru a iți activa contul.", rp.title()));
		{
			String poruka = rp.title().getText();
			log.info(poruka);
			takeScreenshotRumunija(name);
		}
		
		driver.close();
		driver.quit();
	}		
}

