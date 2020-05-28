package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.BrzziTiketPage;
import resources.base;

public class UplataBrzziTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test(priority=2)
	public void uplataBrzogTiketaSingl() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		selectRandomMatch(1);
		bt.obican().click();
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzi listić", bt.title())) {
			log.info("Brzi SINGL tiket je uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi listic nije kreiran");
		}
		bt.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void uplataBrzogTiketa() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		selectRandomMatch(2);
		bt.obican().click();
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzi listić", bt.title())) {
			log.info("Brzi tiket sa DVA para je uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi listic nije kreiran");
		}
		bt.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void uplataBrzogTiketa1() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		selectRandomMatch(3);
		bt.obican().click();
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzi listić", bt.title())) {
			log.info("Brzi tiket sa TRI para je uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi listic nije kreiran");
		}
		bt.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void uplataBrzogTiketa2() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		selectRandomMatch(4);
		bt.obican().click();
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzi listić", bt.title())) {
			log.info("Brzi tiket sa CETIRI para je uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi listic nije kreiran");
		}
		bt.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void uplataBrzogTiketa3() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		selectRandomMatch(5);
		bt.obican().click();
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzi listić", bt.title())) {
			log.info("Brzi tiket sa PET para je uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi listic nije kreiran");
		}
		bt.ureduDugme().click();
	}
	
	@Test(priority=3)
	public void uplataBrzogSistemskogTiketa() throws IOException, InterruptedException {
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		selectRandomMatch(3);
		bt.sistemski().click();
		bt.checkbox().click();
		bt.checkbox1().click();
		bt.uplataDugmeSistemski().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzi listić", bt.title())) {
			log.info("Brzi SISTEMSKI tiket sa TRI para je uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi listic nije kreiran");
		}
		bt.ureduDugme().click();
	}

}
