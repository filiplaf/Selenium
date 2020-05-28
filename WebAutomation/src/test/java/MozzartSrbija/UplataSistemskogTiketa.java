package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsSrbija.KladjenjePage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataSistemskogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		//Tiket se ponasa kao SINGL uplata jer je 1/2
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatch(2);
		takeScreenshotSerbia(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("100");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Sistemski tiket od 2 PARA uspesno uplacen 1/2");
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
		selectRandomMatch(3);
		takeScreenshotSerbia(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("300");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Sistemski tiket od 3 PARA uspesno uplacen");
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
		selectRandomMatch(4);
		takeScreenshotSerbia(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("500");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Sistemski tiket od 4 PARA uspesno uplacen");
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
		selectRandomMatch(5);
		takeScreenshotSerbia(name);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("800");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Sistemski tiket od 5 PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}

}
