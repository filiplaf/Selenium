package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageObjectsSrbija.KladjenjePage;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class UplataTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void uplataSingla() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatch(1);
		takeScreenshotSerbia(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("100");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("SINGL tiket uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatch(2);
		takeScreenshotSerbia(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("52");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Tiket sa DVA PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatch(3);
		takeScreenshotSerbia(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("53");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Tiket sa TRI PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatch(4);
		takeScreenshotSerbia(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("54");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Tiket sa CETIRI PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa4() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(1);
		selectRandomMatch(5);
		takeScreenshotSerbia(name);
		kp.uplata().clear();
		kp.uplata().sendKeys("55");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", kp.title())) {
			log.info("Tiket sa PET PARA uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
}
