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

		@Test
		public void OIB() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url5"));
		OibPage op = new OibPage(driver);
		String oib = op.Oib().getText();
		
		String csvOutputFile = "table.txt";
		
		try(FileWriter writecsv = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\table.txt")) {
	        writecsv.append(oib);
		}
		driver.close();
		driver.quit();
		}
}
