package MozzartGermania;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.RegistrationPage;
import resources.base;

public class Registracija extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


public String korisnickoIme = "jakov1666";
public String email = "jakov1666@yopmail.com";
public String lozinka = "8888888A";
public String ime = "Filip";
public String prezime = "Maljenovic";
public String country = "Hrvatska";
public String mesto = "Zagreb"; 
public String adresa = "Mate Parlov 22";
public String drzavljanstvo = "Hrvatsko";
public String brojIsprave = "1234";
public String nazivIzdavatelja = "HP-HRVATSKA";
public String drzavaIzdavatelja = "Hrvatska";
public String iban = "HR9123600006197873678";
public String nazivBanke = "Telenor";
	
    @Test(priority=2)
	public void registacija() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url1"));
		LandingPage lp = new LandingPage(driver);
		lp.cookie().click();
		driver.navigate().refresh();
		lp.getRegistruj().click();
		//Unosenje podataka
		RegistrationPage rp = new RegistrationPage(driver);
		rp.korisnickoIme().sendKeys(korisnickoIme);
		rp.emailAdress().sendKeys(email);
		rp.lozinka().sendKeys(lozinka);
		rp.ponovljenaLozinka().sendKeys(lozinka);
		rp.ime().sendKeys(ime);
		rp.prezime().sendKeys(prezime);
		//Unosenje datuma
		//Year and Month
		rp.dateOfBirth().click();
		rp.year().click();
		rp.year1().click();
		rp.backArrow().click();
		rp.backArrow().click();
		rp.pickYear().get(9).click();  //1989
		rp.pickMonth().get(0).click(); //january
		//Day
		for (int i=0; i<rp.pickDay().size(); i++) {
			String temp = rp.pickDay().get(i).getText();
			if(temp.equals("1")) {
				rp.pickDay().get(i).click();
				break;
			}
		}
		//Nastavak
		//OIB
		try {
			FileInputStream fstream = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\OIB.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String srtLine;
			while ((srtLine = br.readLine()) !=null) {
				rp.oib().sendKeys(srtLine);
			}
			in.close();
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		//Country selection
		rp.country().click();
		for (int i=0; i<rp.countrySelection().size(); i++) {
			//System.out.println(rp.countrySelection().size());
			String temp = rp.countrySelection().get(i).getText();
			//System.out.println(temp);
			if(temp.equals(country)) {
				rp.countrySelection().get(i).click();
				break;
			}			
		}
		//Mesto
		rp.mesto().sendKeys(mesto);
		//Adresa
		rp.adresa().sendKeys(adresa);	
		//Drzavljanstvo
		rp.drzavljanstvo().sendKeys(drzavljanstvo);
		//Isprava
		rp.isprava().click();
		//Broj isprave
		rp.brojIsprave().sendKeys(brojIsprave);
		//Naziv Izdavatelja
		rp.nazivIzdavatelja().sendKeys(nazivIzdavatelja);
		//Drzava Izdavatelja
		rp.drzavaIzdavatelja().sendKeys(drzavaIzdavatelja);
		//IBAN
		rp.iban().sendKeys(iban);
		//Naziv banke
		rp.nazivBanke().sendKeys(nazivBanke);
		//Broj telefona
		Random rand = new Random();
		int broj = rand.nextInt(9999);
		rp.brojTelefona().sendKeys("365");
		rp.brojTelefona().sendKeys(Integer.toString(broj));
		//Politicki izlozen
		rp.politickiIzlozen().click();
		//Promocije
		//rp.Promocije().click();
		//Uslovi koriscenja
		rp.usloviKoricenja().click();
		//Registracija dugme
		rp.registracijaDugme().click();
		//Trenutno nema poruke da je poslat aktivacioni mail
//		String title = moveToElementAndRead(rp.title());
//		log.info(title);
		wait_time(10);
		log.info("Aktivacioni mail poslat");
		driver.close();
		driver.quit();

	}
}
