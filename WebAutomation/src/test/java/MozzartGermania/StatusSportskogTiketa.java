package MozzartGermania;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsGermania.LandingPage;
import pageObjectsGermania.StatusTiketaPage;
import resources.base;


public class StatusSportskogTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void statusSportskogTiketaGermania() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		StatusTiketaPage st = new StatusTiketaPage(driver);
		lp.provjeraListica().click();
		wait_time(1);
		try {
			FileInputStream fstream = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodSportskogTiketaGermania.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String srtLine;
			while ((srtLine = br.readLine()) !=null) {
			st.sifraTiketa().sendKeys(srtLine);
			st.pronadjiListic().click();
			wait_time(2);
			if(st.ureduDugme().isDisplayed()) {
				takeScreenshotGermania(name);
				st.ureduDugme().click();
				log.info("Sportski tiket uspesno ocitan sa sifrom: " + srtLine);
			}
			else log.info("Sportski tiket nije ocitan");
		}	
			
		}
		catch (Exception e) {
			log.error("Ne postoji dokument sa kodom!");
		}
	}	
}
