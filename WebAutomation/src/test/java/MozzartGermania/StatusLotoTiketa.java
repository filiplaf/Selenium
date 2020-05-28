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


public class StatusLotoTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void statusLotoTiketaGermania() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		StatusTiketaPage st = new StatusTiketaPage(driver);
		lp.provjeraListica().click();
		st.provjeraLotoListic().click();
		wait_time(1);
		try {
			FileInputStream fstream = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodLotoTiketaGermania.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String srtLine;
			while ((srtLine = br.readLine()) !=null) {
			st.sifraTiketa().sendKeys(srtLine);
			st.pronadjiListic().click();
			if(st.ureduDugme().isDisplayed()) {
				takeScreenshotGermania(name);
				st.ureduDugme().click();
				log.info("Loto tiket uspesno ocitan sa sifrom: " + srtLine);
			}
			else log.info("Loto tiket nije ocitan");
		}	
			
		}
		catch (Exception e) {
			log.error("Ne postoji dokument sa kodom!");
		}
	}	
}
