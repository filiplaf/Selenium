package MozzartRumunija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsRumunija.BrzziTiketPage;
import resources.base;

public class UplataBrzziTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test(priority=1)
	public void uplataSinglBrzogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(1);
		takeScreenshotRumunija(name);
		bt.simplu().click();
		bt.uplata().clear();
		bt.uplata().sendKeys("50");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi SINGL tiket uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi SINGL tiket nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	@Test(priority=2)
	public void uplataBrzogTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(2);
		takeScreenshotRumunija(name);
		bt.simplu().click();
		bt.uplata().clear();
		bt.uplata().sendKeys("20");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi tiket od DVA para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi tiket od DVA para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	@Test(priority=2)
	public void uplataBrzogTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(3);
		takeScreenshotRumunija(name);
		bt.simplu().click();
		bt.uplata().clear();
		bt.uplata().sendKeys("20");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi tiket od TRI para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi tiket od TRI para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	@Test(priority=2)
	public void uplataBrzogTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(4);
		takeScreenshotRumunija(name);
		bt.simplu().click();
		bt.uplata().clear();
		bt.uplata().sendKeys("20");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi tiket od CETIRI para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi tiket od CETIRI para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	@Test(priority=2)
	public void uplataBrzogTiketa4() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(5);
		takeScreenshotRumunija(name);
		bt.simplu().click();
		bt.uplata().clear();
		bt.uplata().sendKeys("20");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi tiket od PET para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi tiket od PET para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	@Test(priority=3)
	public void uplataBrzogSistemskogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(2);
		takeScreenshotRumunija(name);
		bt.sistem().click();
		bt.checkbox().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("50");
		bt.uplataDugmeSistemski().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi sistemski tiket od DVA para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi sistemski tiket od DVA para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	@Test(priority=3)
	public void uplataBrzogSistemskogTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(3);
		takeScreenshotRumunija(name);
		bt.sistem().click();
		bt.checkbox().click();
		bt.checkbox1().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("50");
		bt.uplataDugmeSistemski().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi sistemski tiket od TRI para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi sistemski tiket od TRI para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	
	@Test(priority=3)
	public void uplataBrzogSistemskogTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(4);
		takeScreenshotRumunija(name);
		bt.sistem().click();
		bt.checkbox().click();
		bt.checkbox1().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("50");
		bt.uplataDugmeSistemski().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi sistemski tiket od CETIRI para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi sistemski tiket od CETIRI para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
	
	
	@Test(priority=3)
	public void uplataBrzogSistemskogTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatchRumunija(5);
		takeScreenshotRumunija(name);
		bt.sistem().click();
		bt.checkbox().click();
		bt.checkbox1().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("50");
		bt.uplataDugmeSistemski().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Codul generat", bt.title()))
		{
			log.info("Brzi sistemski tiket od PET para uspesno kreiran");
			log.info(bt.title().getText());
		}
		else {
			log.error("Brzi sistemski tiket od PET para nije uspesno kreiran");
		}
		bt.ureduDugme().click();
		}
}
