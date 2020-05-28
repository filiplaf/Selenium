package MozzartMalta;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsMalta.LuckyG;
import pageObjectsMalta.LandingPage;
import resources.base;

public class UplataGrckiTomboTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(priority=4)
	public void uplataLuckyGTiketa1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		moveToElementAndClick(lp.getLuckyG());
		wait_time(1);
		LuckyG lg = new LuckyG(driver);
		moveToElementAndClick(lg.luckyGtime());
		//G2 tiket;
		selectRandomGNumberMalta(2);
		lg.uplata().clear();
		lg.uplata().sendKeys("1");
		try
		{
		if(lg.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				lg.activeDugme().click();
				lg.uplataDugme().click();
				lg.uplataDugme2().click();
				if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
					log.info("G2 tiket uspesno uplacen");
					log.info(lg.title().getText());
				}
				else {
					log.error("Grcki kino nije uplacen");
				}
				lg.ureduDugme().click();
			}
		}
		catch(Exception e) {
		lg.uplataDugme().click();
		lg.uplataDugme2().click();
		if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
			log.info("G2 tiket uspesno uplacen");
			log.info(lg.title().getText());
		}
		else {
			log.error("G2 tiket nije uplacen");
		}
		lg.ureduDugme().click();
	}
	}	
	
	@Test(priority=4)
	public void uplataLuckyGTiketa2() throws IOException, InterruptedException {
		LuckyG lg = new LuckyG(driver);
		//G3 tiket
		wait_time(1);
		selectRandomGNumberMalta(3);
		try
		{
		if(lg.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				lg.activeDugme().click();
				lg.uplataDugme().click();
				lg.uplataDugme2().click();
				if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
					log.info("G3 tiket uspesno uplacen");
					log.info(lg.title().getText());
				}
				else {
					log.error("G3 tiket nije uplacen");
				}
				lg.ureduDugme().click();
			}
		}
		catch(Exception e) {
		lg.uplataDugme().click();
		lg.uplataDugme2().click();
		if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
			log.info("G3 tiket uspesno uplacen");
			log.info(lg.title().getText());
		}
		else {
			log.error("G3 tiket nije uplacen");
		}
		lg.ureduDugme().click();
	}
	}	
	
	@Test(priority=4)
	public void uplataLuckyGTiketa3() throws IOException, InterruptedException {
		LuckyG lg = new LuckyG(driver);
		//G4 tiket
		wait_time(1);
		selectRandomGNumberMalta(4);
		try
		{
		if(lg.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				lg.activeDugme().click();
				lg.uplataDugme().click();
				lg.uplataDugme2().click();
				if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
					log.info("G4 tiket uspesno uplacen");
					log.info(lg.title().getText());
				}
				else {
					log.error("G4 tiket nije uplacen");
				}
				lg.ureduDugme().click();
			}
		}
		catch(Exception e) {
		lg.uplataDugme().click();
		lg.uplataDugme2().click();
		if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
			log.info("G4 tiket uspesno uplacen");
			log.info(lg.title().getText());
		}
		else {
			log.error("G4 tiket nije uplacen");
		}
		lg.ureduDugme().click();
	}
	}
	
	@Test(priority=4)
	public void uplataLuckyGTiketa4() throws IOException, InterruptedException {
		LuckyG lg = new LuckyG(driver);
		//G5 tiket
		wait_time(1);
		selectRandomGNumberMalta(5);
		try
		{
		if(lg.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				lg.activeDugme().click();
				lg.uplataDugme().click();
				lg.uplataDugme2().click();
				if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
					log.info("G5 tiket uspesno uplacen");
					log.info(lg.title().getText());
				}
				else {
					log.error("G5 tiket nije uplacen");
				}
				lg.ureduDugme().click();
			}
		}
		catch(Exception e) {
		lg.uplataDugme().click();
		lg.uplataDugme2().click();
		if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
			log.info("G5 tiket uspesno uplacen");
			log.info(lg.title().getText());
		}
		else {
			log.error("G5 tiket nije uplacen");
		}
		lg.ureduDugme().click();
	}
	}
	
	@Test(priority=5)
	public void uplataLuckyGTiketaZaViseKola() throws IOException, InterruptedException {
		LuckyG lg = new LuckyG(driver);
		//G3 tiket za vise kola
		wait_time(1);
		selectRandomGNumberMalta(3);
		selectRandomGKoloMalta();
		try
		{
		if(lg.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				lg.activeDugme().click();
				lg.uplataDugme().click();
				lg.uplataDugme2().click();
				if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
					log.info("G3 tiket za vise kola uspesno uplacen");
					log.info(lg.title().getText());
				}
				else {
					log.error("G3 tiket za vise kola nije uplacen");
				}
				lg.ureduDugme().click();
			}
		}
		catch(Exception e) {
		lg.uplataDugme().click();
		lg.uplataDugme2().click();
		if(waitForTextToAppear(driver, "You have successfully placed your bet", lg.title())) {
			log.info("G3 tiket za vise kola uspesno uplacen");
			log.info(lg.title().getText());
		}
		else {
			log.error("G3 tiket za vise kola nije uplacen");
		}
		lg.ureduDugme().click();
	}
	}
}