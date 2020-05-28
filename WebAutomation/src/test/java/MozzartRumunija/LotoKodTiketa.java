package MozzartRumunija;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.MojRacun;
import resources.base;

public class LotoKodTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void lotoKodTiketa() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		MojRacun mr = new MojRacun(driver);
		mr.bilete().click();
		wait_time(2);
		try{
			moveToElementAndClick(mr.lotoTiket());
			wait_time(1);
			String kod = mr.kodLoto().getText().substring(10);
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodLotoTiketaRumunija.txt")) {
		        writecsv.append(kod);
		}
			log.info("Kod tiketa je: " + kod);
		}
		catch (Exception e) {
			 log.info("Nema loto tiketa");
		}
	}
}