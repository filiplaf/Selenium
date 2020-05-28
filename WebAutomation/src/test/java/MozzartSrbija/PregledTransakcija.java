package MozzartSrbija;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.MojRacun;
import resources.base;

public class PregledTransakcija extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void transakcije() throws IOException, InterruptedException {
		Actions actions = new Actions(driver);
		LandingPage lp = new LandingPage(driver);
		Login login = new Login();
		lp.userclick().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		moveToElementAndClick(mr.transakcije());
		wait_time(2);    //OVAJ WAIT IDE ZATO STO JE STALE ELEMENT
		String x = moveToElementAndRead(mr.noTransactionTitle());
		String user = login.username;
		if(x.contains("Nema transakcija na Vašem nalogu za izabrani dan.")) {
			log.info("Nema transakcija");
			actions.moveToElement(mr.kalendar()).click().build().perform();
			boolean isPresent = driver.findElements(By.cssSelector(".cell.day.highlighted")).size()>0;
			if(isPresent) {
				log.info("Ima transakcija u ovom mesecu");
				mr.transactionExist().click();
				wait_time(1);
				String transaction = mr.noTransactionTitle().getText();
				try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsSrbija.txt")) {
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
			String datum = mr.datum().getText().substring(0, 9);
			log.info("Zadnje transakcije su " + datum);
			String transaction1 = mr.noTransactionTitle().getText();
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsSrbijaToday.txt")) {
		        writecsv.append("USERNAME je " +user+ "\n");
		        writecsv.append("**********************************" + "\n");
				writecsv.append(transaction1);
			}
			mr.kalendar().click();
			if(mr.transactionExist().isEnabled()) {
				mr.transactionExist().click();
				wait_time(1);
				String transaction = mr.noTransactionTitle().getText();
				try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsSrbija.txt")) {
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
