package MozzartRumunija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsRumunija.KladjenjePage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataSistemskogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatchRumunija(2);
		takeScreenshotRumunija(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("50");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Sistemski tiket od DVA para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataSistemskogTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatchRumunija(3);
		takeScreenshotRumunija(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("50");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Sistemski tiket od TRI para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataSistemskogTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatchRumunija(4);
		takeScreenshotRumunija(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("50");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Sistemski tiket od CETIRI para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataSistemskogTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatchRumunija(5);
		takeScreenshotRumunija(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("50");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", kp.title())) {
			log.info("Sistemski tiket od PET para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
}
