package MozzartGermania;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsGermania.LandingPage;
import pageObjectsGermania.MojRacun;
import resources.base;

public class LotoKodTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void StatusLotoTiketa() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.transakcije().click();
		wait_time(2);
		String x = moveToElementAndRead(mr.transactionTable());
		if(x.contains("Loto")) {
			moveToElementAndClick(mr.lotoTiket());
			wait_time(4);
			String kod = mr.kodLoto().getText().substring(15);
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodLotoTiketaGermania.txt")) {
		        writecsv.append(kod);
		}
			log.info("Kod loto tiketa je: " + kod);
		}
		else log.info("Nema loto tiketa");
	}
	
//	@AfterTest(alwaysRun = true)
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}

}
