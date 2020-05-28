package MozzartGermania;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjectsGermania.OibPage;
import resources.base;

public class OibGenerator extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

		@Test (priority=1)
		public void oib() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url5"));
		OibPage op = new OibPage(driver);
		String oib = op.oib().getText();
		
		String csvOutputFile = "OIB.txt";
		
		try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\OIB.txt")) {
	        writecsv.append(oib);
	        log.info("OIB je: " + oib);
		}
		driver.close();
		driver.quit();
		}
}
