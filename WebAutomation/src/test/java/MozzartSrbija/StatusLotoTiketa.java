package MozzartSrbija;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.StatusTiketaPage;
import resources.base;


public class StatusLotoTiketa extends base{
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void statusLotoTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		StatusTiketaPage st = new StatusTiketaPage(driver);
		lp.statusTiketa().click();
		st.mojBrojTiket().click();
		wait_time(1);
		try {
			FileInputStream fstream = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kodLotoTiketaSrbija.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String srtLine;
			while ((srtLine = br.readLine()) !=null) {
			st.sifraTiketa().sendKeys(srtLine);
			st.pronadjiTiket().click();
			wait_time(1);
			if(st.ureduDugme().isDisplayed()) {
				takeScreenshotSerbia(name);
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
	
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
