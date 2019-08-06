package MozzartSrbija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import MozzartSrbija.Podaci_Baza;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class ProveraBalansa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
public Integer web_balans;

	@Test
	public void Balans() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		String balans = lp.getBalans().getText();
		System.out.println("Balans je " + balans);
		Integer web_balans = Integer.parseInt((balans.replaceAll("[^0-9]", "")));
		System.out.println(web_balans);
		Podaci_Baza pb = new Podaci_Baza();
		System.out.println("AAAA" + pb.balance_after1);
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}


}