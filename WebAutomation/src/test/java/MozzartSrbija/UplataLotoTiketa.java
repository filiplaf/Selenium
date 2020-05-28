package MozzartSrbija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.LotoPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void UplataGrckiloto1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		
		//obican grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumber(1);
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sa JEDNIM brojem uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckiloto2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
			
		//obican grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumber(2);
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sa DVA broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckiloto3() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		
		//obican grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumber(3);
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sa TRI broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckiloto4() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		
		//obican grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumber(4);
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sa CETIRI broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(2);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa DVA broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(3);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa TRI broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem3() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(4);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa CETIRI broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem4() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(5);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa PET broja uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem5() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(6);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa SEST brojeva uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem6() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(7);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa SEDAM brojeva uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void UplataGrckilotoSistem7() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		//sistemski grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(8);
		loto.sistemski().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("30");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino sistem sa OSAM brojeva uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void UplataGrckilotoZaViseKola() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getIgreNaBrojeve().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		wait_time(1);
		selectRandomLotoNumber(2);
		selectRandomLotoKolo();
		wait_time(3);
		loto.uplata().clear();
		loto.uplata().sendKeys("35");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
			log.info("Grcki kino za VISE KOLA uspesno uplacen");
			log.info(loto.title().getText());
			log.info("Jackpot code " + loto.jackpotcode().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}

	@Test(priority=3)
	public void UplataGrckilotoSingl() throws IOException, InterruptedException {
	LotoPage loto = new LotoPage(driver);
	selectRandomSinglLotoSrbija();
	waitForElementToBeClickable(driver, loto.uplata(), 5);
	loto.uplata().clear();
	loto.uplata().sendKeys("30");
	moveToElementAndClick(loto.uplataSingl());
	loto.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
		log.info("Grcki kino SINGL uspesno uplacen");
		log.info(loto.title().getText());
		log.info("Jackpot code " + loto.jackpotcode().getText());
	}
	else {
		log.error("Grcki kino nije uplacen");
	}
	loto.ureduDugme().click();
}
	
	@Test(priority=3)
	public void UplataGrckilotoSingl1() throws IOException, InterruptedException {
	LotoPage loto = new LotoPage(driver);
	selectRandomSinglLotoSrbija();
	waitForElementToBeClickable(driver, loto.uplata(), 5);
	loto.uplata().clear();
	loto.uplata().sendKeys("30");
	moveToElementAndClick(loto.uplataSingl());
	loto.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
		log.info("Grcki kino SINGL uspesno uplacen");
		log.info(loto.title().getText());
		log.info("Jackpot code " + loto.jackpotcode().getText());
	}
	else {
		log.error("Grcki kino nije uplacen");
	}
	loto.ureduDugme().click();
}
	
	@Test(priority=4)
	public void UplataGrckilotoSingl2() throws IOException, InterruptedException {
	LotoPage loto = new LotoPage(driver);
	selectRandomSinglLotoLowHigh();
	waitForElementToBeClickable(driver, loto.uplata(), 5);
	loto.uplata().clear();
	loto.uplata().sendKeys("30");
	moveToElementAndClick(loto.uplataSingl());
	loto.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspešno ste uplatili tiket", loto.title())) {
		log.info("Grcki kino SINGL LOW-HIGH uspesno uplacen");
		log.info(loto.title().getText());
		log.info("Jackpot code " + loto.jackpotcode().getText());
	}
	else {
		log.error("Grcki kino nije uplacen");
	}
}
	
}
