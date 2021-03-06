package MozzartMalta;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class SportskiKodTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void sportskiKodTiket() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.betSlips().click();
		wait_time(2);
		String x = moveToElementAndRead(mr.transactionTable());
		if(x.contains("Sports")) {
			moveToElementAndClick(mr.sportskiTiket());
			wait_time(1);
			String kod = mr.kodSportski().getText().substring(11);
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodSportskogTiketaMalta.txt")) {
		        writecsv.append(kod);
		}
			log.info("Kod tiketa je: " + kod);
		}
		else log.info("Nema sportskog tiketa");
	}

}
