package MozzartGermania;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.LotoPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataGrckiloto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		//grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(1);
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Grcki kino sa JEDNIM brojem uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void uplataGrckiloto1() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(2);
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Grcki kino sa DVA broja uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void uplataGrckiloto2() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(3);
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Grcki kino sa TRI broja uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test
	public void uplataGrckiloto3() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(4);
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Grcki kino sa CETIRI broja uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski1() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(2);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa DVA broja uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski2() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(3);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa TRI broja uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski3() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(4);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa CETIRI broja uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski4() throws IOException, InterruptedException {

		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(5);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa PET brojeva uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski5() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(6);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa SEST brojeva uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski6() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(7);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa SEDAM brojeva uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=1)
	public void uplataGrckilotoSistemski7() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(8);
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa OSAM brojeva uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=2)
	public void uplataGrckilotoSistemskiZaViseKola() throws IOException, InterruptedException {
		LotoPage loto = new LotoPage(driver);
		//grcki sistem loto tiket
		wait_time(1);
		moveToElementAndClick(loto.grckiLotoTime());
		selectRandomLotoNumberGermania(3);
		selectRandomLotoKoloGermania();
		loto.checkbox().click();
		loto.uplata().clear();
		loto.uplata().sendKeys("5");
		loto.uplataDugme().click();
		loto.uplataDugme2().click();
		if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
			log.info("Sistemski grcki kino sa TRI broja za vise kola uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino nije uplacen");
		}
		loto.ureduDugme().click();
	}
	
	@Test(priority=3)
	public void uplataGrckilotoSingl() throws IOException, InterruptedException {
	LotoPage loto = new LotoPage(driver);
	selectRandomSinglLotoGermania();
	loto.uplata().clear();
	loto.uplata().sendKeys("10");		
	loto.uplataSingl().click();
	loto.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
		log.info("Grcki kino SINGL uspesno uplacen");
		log.info(loto.title().getText());
	}
	else {
		log.error("Grcki kino nije uplacen");
	}
	loto.ureduDugme().click();
}
	
	@Test(priority=3)
	public void uplataGrckilotoSing1l() throws IOException, InterruptedException {
	LotoPage loto = new LotoPage(driver);
	selectRandomSinglLotoGermania();
	loto.uplata().clear();
	loto.uplata().sendKeys("10");		
	loto.uplataSingl().click();
	loto.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
		log.info("Grcki kino SINGL uspesno uplacen");
		log.info(loto.title().getText());
	}
	else {
		log.error("Grcki kino nije uplacen");
	}
	loto.ureduDugme().click();
}
	
	@Test(priority=4)
	public void uplataGrckilotoSingl2() throws IOException, InterruptedException {
	LotoPage loto = new LotoPage(driver);
	selectRandomSinglLotoLowHigh();
	loto.uplata().clear();
	loto.uplata().sendKeys("10");		
	loto.uplataSingl().click();
	loto.uplataDugme2().click();
	if(waitForTextToAppear(driver, "Uspješno ste uplatili listić", loto.title())) {
		log.info("Grcki kino SINGL uspesno uplacen");
		log.info(loto.title().getText());
	}
	else {
		log.error("Grcki kino nije uplacen");
	}
	loto.ureduDugme().click();
}
}

