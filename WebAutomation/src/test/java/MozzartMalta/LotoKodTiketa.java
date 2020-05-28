package MozzartMalta;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class LotoKodTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void StatusLotoTiketa() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.betSlips().click();
		wait_time(2);
		String x = moveToElementAndRead(mr.transactionTable());
		if(x.contains("Lotto")) {
			moveToElementAndClick(mr.lotoTiket());
			waitForTextToAppear(driver, "Ticket ID", mr.kodLoto());
			String kod = mr.kodLoto().getText().substring(11);
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodLotoTiketaMalta.txt")) {
		        writecsv.append(kod);
		}
			log.info("Kod loto tiketa je: " + kod);
		}
		else log.info("Nema loto tiketa");
	}

}
