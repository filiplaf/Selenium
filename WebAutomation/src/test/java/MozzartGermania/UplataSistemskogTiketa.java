package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.KladjenjePage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test(priority=1)
	public void uplataSistemskogTiketa() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchGermania(2);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("10");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Sistemski tiket od DVA para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket od DVA para nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataSistemskogTiketa1() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchGermania(3);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("10");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Sistemski tiket od TRI para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket od TRI para nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataSistemskogTiketa2() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchGermania(4);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("10");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Sistemski tiket od CETIRI para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket od CETIRI para nije uplacen");
		}
		kp.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataSistemskogTiketa3() throws IOException, InterruptedException {
		KladjenjePage kp = new KladjenjePage(driver);
		selectRandomMatchGermania(5);
		kp.sistemski().click();
		kp.checkbox().click();
		kp.checkbox1().click();
		kp.uplataSistemski().clear();
		kp.uplataSistemski().sendKeys("10");
		kp.uplataDugmeSistemski().click();
		kp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", kp.title())) {
			log.info("Sistemski tiket od PET para uspesno uplacen");
			log.info(kp.title().getText());
		}
		else {
			log.error("Sistemski tiket od PET para nije uplacen");
		}
		kp.ureduDugme().click();
	}

}
