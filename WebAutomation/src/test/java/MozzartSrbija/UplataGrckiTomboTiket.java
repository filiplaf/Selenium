package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjectsSrbija.GrckiTomboPage;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class UplataGrckiTomboTiket extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(priority=4)
	public void UplataG2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		wait_time(1);
		moveToElementAndClick(lp.getGrckiTombo());
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		
		//G2 tiket
		wait_time(2);
		moveToElementAndClick(gt.grckiTomboTime());
		wait_time(1);
		selectRandomGNumber(2);
		gt.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		gt.uplata().sendKeys("30");
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
					log.info("G2 tiket uspesno uplacen");
					log.info(gt.title().getText());
					log.info("Jackpot code " + gt.jackpotCode().getText());
				}
				else {
					log.error("G2 tiket nije uplacen");
				}
				gt.ureduDugme().click();
			}
		}
		catch(Exception e) {
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
			log.info("G2 tiket uspesno uplacen");
			log.info(gt.title().getText());
			log.info("Jackpot code " + gt.jackpotCode().getText());
		}
		else {
			log.error("G2 tiket nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}
		
		@Test(priority=4)
		public void UplataG3() throws IOException, InterruptedException {
			GrckiTomboPage gt = new GrckiTomboPage(driver);
		//G3 tiket
		wait_time(1);
		selectRandomGNumber(3);
		try
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
				gt.activeDugme().click();
				gt.uplataDugme().click();
				gt.uplataDugme2().click();
				if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
					log.info("G3 tiket uspesno uplacen");
					log.info(gt.title().getText());
					log.info("Jackpot code " + gt.jackpotCode().getText());
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
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
			log.info("G3 tiket uspesno uplacen");
			log.info(gt.title().getText());
			log.info("Jackpot code " + gt.jackpotCode().getText());
		}
		else {
			log.error("G3 tiket nije uplacen");
		}
		gt.ureduDugme().click();
	}
	}

		@Test(priority=4)
		public void UplataG4() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		wait_time(1);
		//G4 tiket
		selectRandomGNumber(4);
		try 		
		{
			if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
			log.info("G4 tiket uspesno uplacen");
			log.info(gt.title().getText());
			log.info("Jackpot code " + gt.jackpotCode().getText());
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
			if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
				log.info("G4 tiket uspesno uplacen");
				log.info(gt.title().getText());
				log.info("Jackpot code " + gt.jackpotCode().getText());
			}
			else {
				log.error("G4 tiket nije uplacen");
			}
			gt.ureduDugme().click();
		}
		}
		
		@Test(priority=4)
		public void UplataG5() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		//G5 tiket
		wait_time(1);
		selectRandomGNumber(5);
		try 		
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
			log.info("G5 tiket uspesno uplacen");
			log.info(gt.title().getText());
			log.info("Jackpot code " + gt.jackpotCode().getText());
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
	if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
		log.info("G5 tiket uspesno uplacen");
		log.info(gt.title().getText());
		log.info("Jackpot code " + gt.jackpotCode().getText());
	}
	else {
		log.error("G5 tiket nije uplacen");
	}
	gt.ureduDugme().click();
}
		}
		
		@Test(priority=4)
		public void UplataGZaViseKola() throws IOException, InterruptedException {
		GrckiTomboPage gt = new GrckiTomboPage(driver);
		wait_time(1);
		selectRandomGNumber(2);
		selectRandomGKolo();
		try 		
		{
		if(gt.activeDugme().isDisplayed()) {
		System.out.println("Aktivno dugme je bilo prikazano");
		gt.activeDugme().click();
		gt.uplata().clear();
		gt.uplata().sendKeys("40");
		gt.uplataDugme().click();
		gt.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
			log.info("G2 tiket za VISE KOLA uspesno uplacen");
			log.info(gt.title().getText());
			log.info("Jackpot code " + gt.jackpotCode().getText());
		}
		else {
			log.error("G2 tiket za VISE KOLA nije uplacen");
		}
		gt.ureduDugme().click();
	}
		}
	catch(Exception e) {
	gt.uplata().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	gt.uplata().sendKeys("40");
	gt.uplataDugme().click();
	gt.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", gt.title())) {
		log.info("G2 tiket za VISE KOLA uspesno uplacen");
		log.info(gt.title().getText());
		log.info("Jackpot code " + gt.jackpotCode().getText());
	}
	else {
		log.error("G2 tiket za VISE KOLA nije uplacen");
	}
	gt.ureduDugme().click();
}
		}

}
