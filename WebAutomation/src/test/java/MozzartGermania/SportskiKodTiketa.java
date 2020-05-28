package MozzartGermania;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsGermania.LandingPage;
import pageObjectsGermania.MojRacun;
import resources.base;

public class SportskiKodTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void statusSportskogTiketa() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.transakcije().click();
		wait_time(1);
		String x = moveToElementAndRead(mr.transactionTable());
		if(x.contains("Klađenje")) {
			moveToElementAndClick(mr.sportskiTiket());
			wait_time(3);
			//Ovo mora da se menja svako kolo da bi radilo
			String kod = mr.kodSportski().getText();
			StringBuilder sb = new StringBuilder(kod);
		    sb.insert(4, "-");
		    sb.insert(10, "-");
		    sb.insert(15, "-");
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodSportskogTiketaGermania.txt")) {
		        writecsv.append(sb);
		}
			log.info("Kod sportkog tiketa je: " + sb);
		}
		else log.info("Nema sportskog tiketa");
	}

}
