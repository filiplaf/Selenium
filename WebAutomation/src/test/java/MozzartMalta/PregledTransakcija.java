package MozzartMalta;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.MojRacun;
import resources.base;

public class PregledTransakcija extends base{
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void transakcije() throws IOException, InterruptedException {
		Login login = new Login();
		LandingPage lp = new LandingPage(driver);
		lp.user().click();
		lp.getMojracun().click();
		MojRacun mr = new MojRacun(driver);
		mr.transakcije().click();
		wait_time(2);
		String x = mr.noTransactionTitle().getText();
		String user = login.username;
		if(x.contains("There are no transactions on your account for selected day.")) {
			log.info("Nema transakcija");
			mr.kalendar().click();
			boolean isPresent = driver.findElements(By.cssSelector(".cell.day.highlighted")).size()>0;
			if(isPresent) {
				log.info("Ima transakcija u ovom mesecu");
				mr.transactionExist().click();
				wait_time(1);
				String transaction = mr.noTransactionTitle().getText();
				try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsMalta.txt")) {
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
			try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsMaltaToday.txt")) {
		        writecsv.append("USERNAME je " +user+ "\n");
		        writecsv.append("**********************************" + "\n");
				writecsv.append(transaction1);
			}
			mr.kalendar().click();
			if(mr.transactionExist().isEnabled()) {
				mr.transactionExist().click();
				wait_time(2);
				String transaction = mr.noTransactionTitle().getText();
				try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\transactionsMalta.txt")) {
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
