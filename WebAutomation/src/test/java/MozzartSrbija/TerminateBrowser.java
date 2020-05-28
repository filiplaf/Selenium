package MozzartSrbija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import resources.base;

public class TerminateBrowser extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test(alwaysRun = true)
	public void teardown() throws IOException, InterruptedException {
			driver.close();
			driver.quit();
		}
	}
