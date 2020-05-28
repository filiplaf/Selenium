package MozzartSrbija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsSrbija.BrzziTiketPage;
import resources.base;

public class UplataBrzziTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataBrzogTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(3);
		selectRandomMatch(1);
		takeScreenshotSerbia(name);
		bt.obican().click();
		bt.uplata().clear();
		bt.uplata().sendKeys("100");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi SINGL tiket je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(2);
		takeScreenshotSerbia(name);
		bt.uplata().clear();
		bt.uplata().sendKeys("50");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi tiket od DVA PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(3);
		takeScreenshotSerbia(name);
		bt.uplata().clear();
		bt.uplata().sendKeys("50");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi tiket od TRI PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogTiketa4() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(4);
		takeScreenshotSerbia(name);
		bt.uplata().clear();
		bt.uplata().sendKeys("50");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi tiket od CETIRI PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogTiketa5() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(5);
		takeScreenshotSerbia(name);
		bt.uplata().clear();
		bt.uplata().sendKeys("50");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi tiket od PET PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogSistemskogTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(2);
		takeScreenshotSerbia(name);
		bt.sistemski().click();
		bt.checkbox1().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("200");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi SISTEMSKI tiket od DVA PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogSistemskogTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(3);
		takeScreenshotSerbia(name);
		bt.sistemski().click();
		bt.checkbox1().click();
		bt.checkbox2().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("350");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi SISTEMSKI tiket od TRI PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogSistemskogTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(4);
		takeScreenshotSerbia(name);
		bt.sistemski().click();
		bt.checkbox1().click();
		bt.checkbox2().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("520");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi SISTEMSKI tiket od CETIRI PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}
	
	@Test
	public void uplataBrzogSistemskogTiketa4() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		BrzziTiketPage bt = new BrzziTiketPage(driver);
		wait_time(1);
		selectRandomMatch(5);
		takeScreenshotSerbia(name);
		bt.sistemski().click();
		bt.checkbox1().click();
		bt.checkbox2().click();
		bt.uplataSistemski().clear();
		bt.uplataSistemski().sendKeys("800");
		bt.uplataDugme().click();
		bt.uplataDBrzziTiketDugmeugme2().click();
		if(waitForTextToAppear(driver, "Brzzi tiket", bt.title())) {
			log.info("Brzi SISTEMSKI tiket od PET PARA je generisan");
			log.info(bt.title().getText());
		}
		else
		{
			log.error("Kod se nije generisao");
		}
		bt.ureduDugme().click();
		}

}
