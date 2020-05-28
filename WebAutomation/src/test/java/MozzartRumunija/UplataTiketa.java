package MozzartRumunija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsRumunija.KladjenjePage;
import pageObjectsRumunija.LandingPage;
import resources.base;

public class UplataTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataSingla() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.getKladjenje().click();
		wait_time(3);
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchRumunija(1);
		takeScreenshotRumunija(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("20");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("SINGL tiket uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		wait_time(1);
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchRumunija(2);
		takeScreenshotRumunija(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("21");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Tiket od DVA PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		wait_time(1);
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchRumunija(3);
		takeScreenshotRumunija(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("22");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Tiket od TRI PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		wait_time(1);
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchRumunija(4);
		takeScreenshotRumunija(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("23");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Tiket od CETIRI PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket4() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		wait_time(1);
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchRumunija(5);
		takeScreenshotRumunija(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("24");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Tiket od PET PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
}
