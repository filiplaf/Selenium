package MozzartMalta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsMalta.SportsPage;
import pageObjectsMalta.LandingPage;
import resources.base;

public class UplataTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataSingla() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.sports().click();
		wait_time(3);
		SportsPage sp = new SportsPage(driver);
		selectRandomMatchMalta(1);
		takeScreenshotMalta(name);
		sp.uplata().clear();
		sp.uplata().sendKeys("20");
		sp.uplataDugme().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("SINGL tiket uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.sports().click();
		wait_time(3);
		SportsPage sp = new SportsPage(driver);
		selectRandomMatchMalta(2);
		takeScreenshotMalta(name);
		sp.uplata().clear();
		sp.uplata().sendKeys("21");
		sp.uplataDugme().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Tiket od DVA PARA uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.sports().click();
		wait_time(3);
		SportsPage sp = new SportsPage(driver);
		selectRandomMatchMalta(3);
		takeScreenshotMalta(name);
		sp.uplata().clear();
		sp.uplata().sendKeys("22");
		sp.uplataDugme().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Tiket od TRI PARA uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.sports().click();
		wait_time(3);
		SportsPage sp = new SportsPage(driver);
		selectRandomMatchMalta(4);
		takeScreenshotMalta(name);
		sp.uplata().clear();
		sp.uplata().sendKeys("23");
		sp.uplataDugme().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Tiket od CETIRI PARA uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataTiket4() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		LandingPage lp = new LandingPage(driver);
		lp.sports().click();
		wait_time(3);
		SportsPage sp = new SportsPage(driver);
		selectRandomMatchMalta(5);
		takeScreenshotMalta(name);
		sp.uplata().clear();
		sp.uplata().sendKeys("24");
		sp.uplataDugme().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Tiket od PET PARA uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
}
