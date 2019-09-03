package MozzartGermania;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.RegistrationPage;
import resources.base;

public class Registracija extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

public String KorisnickoIme = "test75";
public String email = "test75@mailinator.com";
public String lozinka = "8888888A";
public String ime = "Petar";
public String prezime = "Prvi";
public String country = "Hrvatska";
public String mesto = "Zagreb";
public String adresa = "Mate Parlov 22";
public String drzavljanstvo = "Hrvatsko";
public String brojIsprave = "1234";
public String nazivIzdavatelja = "HP-HRVATSKA";
public String drzavaIzdavatelja = "Hrvatska";
public String iban = "HR9123600006197873678";
public String nazivBanke = "Telenor";
public String brojTelefona = "38512345678";
	
    @Test
	public void Registacija() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url1"));
		LandingPage lp = new LandingPage(driver);
		lp.znak().click();
		lp.Cookie().click();
		lp.getRegistruj().click();
		//Unosenje podataka
		Thread.sleep(1000);
		RegistrationPage rp = new RegistrationPage(driver);
		rp.KorisnickoIme().sendKeys(KorisnickoIme);
		rp.EmailAdress().sendKeys(email);
		rp.Lozinka().sendKeys(lozinka);
		rp.PonovljenaLozinka().sendKeys(lozinka);
		rp.Ime().sendKeys(ime);
		rp.Prezime().sendKeys(prezime);
		//Unosenje datuma
		//Year and Month
		rp.DateOfBirth().click();
		rp.Year().click();
		rp.Year1().click();
		rp.BackArrow().click();
		rp.BackArrow().click();
		rp.PickYear().get(9).click();  //1989
		rp.PickMonth().get(0).click(); //january
		//Day
		for (int i=0; i<rp.PickDay().size(); i++) {
			String temp = rp.PickDay().get(i).getText();
			if(temp.equals("1")) {
				rp.PickDay().get(i).click();
				break;
			}
		}
		//Nastavak
		//OIB
		try {
			FileInputStream fstream = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\table.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String srtLine;
			while ((srtLine = br.readLine()) !=null) {
				rp.OIB().sendKeys(srtLine);
			}
			in.close();
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		//Country selection
		rp.Country().click();
		for (int i=0; i<rp.CountrySelection().size(); i++) {
			String temp = rp.CountrySelection().get(i).getText();
			if(temp.equals(country)) {
				rp.CountrySelection().get(i).click();
				break;
			}			
		}
		//Mesto
		rp.Mesto().sendKeys(mesto);
		//Adresa
		rp.Adresa().sendKeys(adresa);	
		//Drzavljanstvo
		rp.Drzavljanstvo().sendKeys(drzavljanstvo);
		//Isprava
		rp.Isprava().click();
		//Broj isprave
		rp.BrojIsprave().sendKeys(brojIsprave);
		//Naziv Izdavatelja
		rp.NazivIzdavatelja().sendKeys(nazivIzdavatelja);
		//Drzava Izdavatelja
		rp.DrzavaIzdavatelja().sendKeys(drzavaIzdavatelja);
		//IBAN
		rp.Iban().sendKeys(iban);
		//Naziv banke
		rp.NazivBanke().sendKeys(nazivBanke);
		//Broj telefona
		rp.BrojTelefona().sendKeys(brojTelefona);
		//Politicki izlozen
		rp.PolitickiIzlozen().click();
		//Promocije
		//rp.Promocije().click();
		//Uslovi koriscenja
		rp.UsloviKoricenja().click();
		//Registracija dugme
		rp.RegistracijaDugme().click();
		Thread.sleep(5000);
		String title = rp.Title().getText();
		log.info(title);
		
		driver.close();
		driver.quit();

	}
}
