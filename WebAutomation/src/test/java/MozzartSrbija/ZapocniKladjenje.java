package MozzartSrbija;

import java.io.IOException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;
import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.ZapocniKladjenjePage;
import MozzartSrbija.Registracija;

public class ZapocniKladjenje extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

Random rand = new Random(); 
public int dan = 01;
public int mesec = 01;
public int godina = 990;
public int randomRegija = rand.nextInt(89) + 10;
public int pol = rand.nextInt(998);
public String brojLicneKarte = "1234";
public String brojTelefona = "064111222";
public String mestoRodjenjaDrzava = "Srbija";
public String mestoRodjenjaGrad = "Beograd";
public String prebivalisteDrzava = "Srbija";
public String prebivalasteGrad = "Beograd";
public String prebivalisteAdresa = "Takovska 45";

	@Test
	public void login() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		Registracija reg = new Registracija();
		lp.cookie().click();
		lp.getUsername().sendKeys(reg.korisnickoIme);
		lp.getPassword().sendKeys(reg.lozinka);
		lp.getButtonClick().click();
		lp.userclick().click();
		String Ime = lp.getUser().getText();
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
	//JMBG
	int A = dan/10;
	int B = dan%10;
	int C = mesec/10;
	int D = mesec%10;
	int E = godina/100;
	int F = (godina/10)%10;
	int G = godina%10;
	int H = randomRegija/10;
	int I = randomRegija%10;
	int J = pol/100;
	int K = (pol/10)%10;
	int L = pol%10;
	int M = 11 - ((7*(A+G) + 6*(B+H) + 5*(C+I) + 4*(D+J) + 3*(E+K) + 2*(F+L)) % 11);
	if(M>1 && M<9) {
		M = M;
	}
	else if(M>9) {
		M=0;
	}
	String JMBG = Integer.toString(A) + Integer.toString(B) + Integer.toString(C) + Integer.toString(D) + Integer.toString(E) + Integer.toString(F) + Integer.toString(G) + Integer.toString(H) + Integer.toString(I) + Integer.toString(J) + Integer.toString(K) + Integer.toString(L) + Integer.toString(M);
	//Unos generisanog JMBG
	zk.jmbg().sendKeys(JMBG);
	zk.brojLicneKarte().sendKeys(brojLicneKarte);
	zk.brojTelefona().sendKeys(brojTelefona);
	zk.mestoRodjenjaDrzava().sendKeys(mestoRodjenjaDrzava);
	zk.mestoRodjenjaGrad().sendKeys(mestoRodjenjaGrad);
	zk.prebivalisteDrzava().sendKeys(prebivalisteDrzava);
	zk.prebivalisteGrad().sendKeys(prebivalasteGrad);
	zk.prebivalisteAdresa().sendKeys(prebivalisteAdresa);
	zk.usloviKoriscenja().click();
	zk.potvrdiDugme().click();
	if(waitForTextToAppear(driver, "Uspešno ste aktivirali nalog.", zk.title()));
	{
		String poruka = zk.title().getText();
		log.info(poruka);
		takeScreenshotSerbia(name);
		zk.ureduDugme().click();
	}
	}
	
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
