package MozzartMalta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsMalta.SportsPage;
import resources.base;

public class UplataSistemskogTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataSistemskogTiketa() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		SportsPage sp = new SportsPage(driver);
		wait_time(1);
		selectRandomMatchMalta(2);
		takeScreenshotMalta(name);
		sp.sistemski().click();
		sp.checkbox().click();
		sp.checkbox1().click();
		sp.uplataSistemski().clear();
		sp.uplataSistemski().sendKeys("20");
		sp.uplataDugmeSistemski().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Sistemski tiket od DVA para uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataSistemskogTiketa1() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		SportsPage sp = new SportsPage(driver);
		wait_time(1);
		selectRandomMatchMalta(3);
		takeScreenshotMalta(name);
		sp.sistemski().click();
		sp.checkbox().click();
		sp.checkbox1().click();
		sp.uplataSistemski().clear();
		sp.uplataSistemski().sendKeys("21");
		sp.uplataDugmeSistemski().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Sistemski tiket od TRI para uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataSistemskogTiketa2() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		SportsPage sp = new SportsPage(driver);
		wait_time(1);
		selectRandomMatchMalta(4);
		takeScreenshotMalta(name);
		sp.sistemski().click();
		sp.checkbox().click();
		sp.checkbox1().click();
		sp.uplataSistemski().clear();
		sp.uplataSistemski().sendKeys("22");
		sp.uplataDugmeSistemski().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Sistemski tiket od CETIRI para uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
	
	@Test
	public void uplataSistemskogTiketa3() throws Exception {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		SportsPage sp = new SportsPage(driver);
		wait_time(1);
		selectRandomMatchMalta(5);
		takeScreenshotMalta(name);
		sp.sistemski().click();
		sp.checkbox().click();
		sp.checkbox1().click();
		sp.uplataSistemski().clear();
		sp.uplataSistemski().sendKeys("23");
		sp.uplataDugmeSistemski().click();
		sp.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Your bet has been successfully placed.", sp.title())) {
			log.info("Sistemski tiket od PET para uspesno uplacen");
			log.info(sp.title().getText());
		}
		else {
			log.error("Sistemski tiket nije uplacen");
		}
		sp.ureduDugme().click();
	}
}
