package MozzartSrbija;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class LotoKodTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void lotoKodTiketa() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.userclick().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.pregledTiketa().click();
		wait_time(2);
		String x = moveToElementAndRead(mr.transactionTable());
		if(x.contains("Moj Broj")) {
			moveToElementAndClick(mr.lotoTiket());
			waitForTextToAppear(driver, "Šifra tiketa", mr.kodLoto());
			String kod = mr.kodLoto().getText().substring(14);
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodLotoTiketaSrbija.txt")) {
		        writecsv.append(kod);
		}
			log.info("Kod loto tiketa je: " + kod);
		}
		else log.info("Nema loto tiketa");
	}

}
