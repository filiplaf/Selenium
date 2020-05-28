package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.GrckiTomboPage;
import pageObjectsGermania.LandingPage;
import resources.base;

public class UplataLuckyGTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(priority=4)
	public void uplataLuckyGTiketa1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		moveToElementAndClick(lp.luckyG());
		wait_time(1);
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		moveToElementAndClick(gt.grckiTomboTime());
		//G2 tiket;
		selectRandomGNumberGermania(2);
		gt.uplata().clear();
		gt.uplata().sendKeys("10");
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
					log.info("G2 tiket uspesno uplacen");
					log.info(gt.title().getText());
				}
				else {
					log.error("Grcki kino nije uplacen");
				}
				gt.ureduDugme().click();
			}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
			log.info("G2 tiket uspesno uplacen");
			log.info(gt.title().getText());
		}
		else {
			log.error("G2 tiket nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}	
	
	@Test(priority=4)
	public void uplataLuckyGTiketa2() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		//G3 tiket
		wait_time(1);
		selectRandomGNumberGermania(3);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
					log.info("G3 tiket uspesno uplacen");
					log.info(gt.title().getText());
				}
				else {
					log.error("G3 tiket nije uplacen");
				}
				gt.ureduDugme().click();
			}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
			log.info("G3 tiket uspesno uplacen");
			log.info(gt.title().getText());
		}
		else {
			log.error("G3 tiket nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}	
	
	@Test(priority=4)
	public void uplataLuckyGTiketa3() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		//G4 tiket
		wait_time(1);
		selectRandomGNumberGermania(4);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
					log.info("G4 tiket uspesno uplacen");
					log.info(gt.title().getText());
				}
				else {
					log.error("G4 tiket nije uplacen");
				}
				gt.ureduDugme().click();
			}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
			log.info("G4 tiket uspesno uplacen");
			log.info(gt.title().getText());
		}
		else {
			log.error("G4 tiket nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}
	
	@Test(priority=4)
	public void uplataLuckyGTiketa4() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		//G5 tiket
		wait_time(1);
		selectRandomGNumberGermania(5);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
					log.info("G5 tiket uspesno uplacen");
					log.info(gt.title().getText());
				}
				else {
					log.error("G5 tiket nije uplacen");
				}
				gt.ureduDugme().click();
			}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
			log.info("G5 tiket uspesno uplacen");
			log.info(gt.title().getText());
		}
		else {
			log.error("G5 tiket nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}
	
	@Test(priority=5)
	public void uplataLuckyGTiketaZaViseKola() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		//G3 tiket za vise kola
		wait_time(1);
		selectRandomGNumberGermania(3);
		selectRandomGKoloGermania();
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
					log.info("G3 tiket za vise kola uspesno uplacen");
					log.info(gt.title().getText());
				}
				else {
					log.error("G3 tiket za vise kola nije uplacen");
				}
				gt.ureduDugme().click();
			}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", gt.title())) {
			log.info("G3 tiket za vise kola uspesno uplacen");
			log.info(gt.title().getText());
		}
		else {
			log.error("G3 tiket za vise kola nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}
}