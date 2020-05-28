package MozzartGermania;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsGermania.LandingPage;
import pageObjectsGermania.MojRacun;
import resources.base;

public class PregledTransakcija extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void pregledTransakcija() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Login login = new Login();
		lp.getKorisnik().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		moveToElementAndClick(mr.transakcije());
		wait_time(4);
		String x = moveToElementAndRead(mr.noTransactionTitle());
		String user = login.username;
		if(x.contains("Nema transakcija na Vašem nalogu za odabrani dan.")) {
			log.info("Nema transakcija u ovom danu");
			jsClick(mr.kalendar(), driver);
			boolean isPresent = driver.findElements(By.cssSelector(".cell.day.highlighted")).size()>0;
			if(isPresent) {
				log.info("Ima transakcija u ovom mesecu");
				wait_time(1);
				String transaction = mr.noTransactionTitle().getText();
				try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsGermania.txt")) {
			        writecsv.append("USERNAME je " +user+ "\n");
			        writecsv.append("**********************************" + "\n");
					writecsv.append(transaction);
				}
			}
			else {
				log.info("Nema transakcija u ovom mesecu");
			}
		}
		else {
			String datum =  mr.datum().getText().substring(0, 9);
			log.info("Poslednja transakcija je " +datum);
			String transaction1 = mr.noTransactionTitle().getText();
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsGermaniaToday.txt")) {
		        writecsv.append("USERNAME je " +user+ "\n");
		        writecsv.append("**********************************" + "\n");
				writecsv.append(transaction1);
			}
			mr.kalendar().click();
			if(mr.transactionExist().isEnabled()) {
				mr.transactionExist().click();
				wait_time(1);
				String transaction = mr.noTransactionTitle().getText();
				try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsGermania.txt")) {
			        writecsv.append("USERNAME je " +user+ "\n");
			        writecsv.append("**********************************" + "\n");
					writecsv.append(transaction);
				}
				log.info("Ima transakcija u ovom mesecu");
			}
	}
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
