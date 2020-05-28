package MozzartRumunija;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsRumunija.LandingPage;
import pageObjectsRumunija.LotoPage;
import resources.base;

public class UplataLotoTiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void uplataGrckiLoto() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.getKorisnik().click();
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(3);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(1);
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa JEDNOM kuglicom uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa JEDNOM kuglicom nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa JEDNOM kuglicom uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa JEDNOM kuglicom nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLoto1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(2);
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa DVE kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa DVE kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa DVE kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa DVE kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLoto2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(3);
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa TRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa TRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa TRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa TRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLoto3() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(4);
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa CETIRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa CETIRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa CETIRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa CETIRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(2);
		loto.checkbox().click();
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa DVE kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa DVE kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa DVE kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa DVE kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(3);
		loto.checkbox().click();
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa TRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa TRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa TRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa TRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(4);
		loto.checkbox().click();
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa CETIRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa CETIRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa CETIRI kuglice uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa CETIRI kuglice nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem3() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(5);
		loto.checkbox().click();
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa PET kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa PET kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa PET kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa PET kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem4() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(6);
		loto.checkbox().click();
		
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa SEST kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa SEST kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa SEST kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa SEST kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem5() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(7);
		loto.checkbox().click();
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa SEDAM kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa SEDAM kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa SEDAM kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa SEDAM kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test
	public void uplataGrckiLotoSistem6() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(8);
		loto.checkbox().click();
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa OSAM kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa OSAM kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki sistem kino sa OSAM kuglica uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki sistem kino sa OSAM kuglica nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}
	
	@Test(priority=1)
	public void uplataGrckiLotoZaViseKola() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomLotoNumberRumunija(3);
		selectRandomLotoKoloRumunija();
		loto.checkbox().click();
		try {
			if(loto.activeDugme().isDisplayed()) {
			System.out.println("Aktivno dugme je bilo prikazano");
			loto.activeDugme().click();
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa TRI kuglice za vise kola uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa TRI kuglice za vise kola nije uplacen");
			}
			loto.UreduDugme().click();
		}
		}
		catch (Exception e) {
			loto.uplataDugme().click();
			loto.uplataDugme2().click();
			if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
				log.info("Grcki kino sa TRI kuglice za vise kola uspesno uplacen");
				log.info(loto.title().getText());
			}
			else {
				log.error("Grcki kino sa TRI kuglice za vise kola nije uplacen");
			}
			loto.UreduDugme().click();
		}
	}

	@Test(priority=2)
	public void uplataGrckiLotoSingl() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomSinglLotoRumunija();
		loto.uplataDugmeSingl().click();
		loto.uplataDugmeSingl1().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
			log.info("Grcki kino SINGL tiket uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino SINGL tiket uspesno uplacen");
		}
		loto.UreduDugme().click();
	}
	
	@Test(priority=3)
	public void uplataGrckiLotoSingl1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomSinglLotoRumunija();
		loto.uplataDugmeSingl().click();
		loto.uplataDugmeSingl1().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
			log.info("Grcki kino SINGL tiket uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino SINGL tiket uspesno uplacen");
		}
		loto.UreduDugme().click();
	}
	
	@Test(priority=4)
	public void uplataGrckiLotoSingl2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		lp.loto().click();
		LotoPage loto = new LotoPage(driver);
		wait_time(1);
		loto.GrckiLotoTime().click();
		selectRandomSinglLotoLowHigh();
		loto.uplataDugmeSingl().click();
		loto.uplataDugmeSingl1().click();
		if(waitForTextToAppear(driver, "Bilet inregistrat cu succes.", loto.title())) {
			log.info("Grcki kino SINGL tiket uspesno uplacen");
			log.info(loto.title().getText());
		}
		else {
			log.error("Grcki kino SINGL tiket uspesno uplacen");
		}
		loto.UreduDugme().click();
	}
}
