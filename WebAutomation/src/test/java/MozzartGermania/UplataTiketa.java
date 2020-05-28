package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.KladjenjePage;
import pageObjectsGermania.LandingPage;
import resources.base;

public class UplataTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataSingla() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKladjenje().click();
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatchGermania(1);
		kp.uplata().clear();
		kp.uplata().sendKeys("10");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("SINGL tiket uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("SINGL tiket nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa1() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatchGermania(2);
		kp.uplata().clear();
		kp.uplata().sendKeys("5");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Tiket od DVA para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket od DVA para nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa2() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatchGermania(3);
		kp.uplata().clear();
		kp.uplata().sendKeys("5");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Tiket od TRI para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket od TRI para nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa3() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatchGermania(4);
		kp.uplata().clear();
		kp.uplata().sendKeys("5");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Tiket od CETIRI para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket od CETIRI para nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiketa4() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		wait_time(3);
		selectRandomMatchGermania(5);
		kp.uplata().clear();
		kp.uplata().sendKeys("5");
		kp.uplataDugme().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Tiket od PET para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Tiket od PET para nije uplacen");
		}
		kp.ureduDugme().click();
	}

}
