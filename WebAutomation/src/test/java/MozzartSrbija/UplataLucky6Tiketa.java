package MozzartSrbija;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.Lucky6Page;
import resources.base;

public class UplataLucky6Tiketa extends base {
public static Logger log = LogManager.getLogger(base.class.getName());
	
public void slucajniOdabir() {
	Lucky6Page lucky = new Lucky6Page(driver);
	lucky.slucajniOdabir().click();
}

public void slucajniSingl() {
	List<WebElement> allSingl = driver.findElements(By.xpath("//*[contains(@class, 'number large')]"));
	Random rand = new Random();
	int randomKvota = rand.nextInt(6);
	wait_time(1);
	allSingl.get(randomKvota).click();
}
	@Test
	public void uplataLucky6Kuglice() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(3);
		selectRandomLucky6Kuglice(6);
		lucky.uplata().clear();
		lucky.uplata().sendKeys("50");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket uspesno uplacen");
		else {
			log.error("Lucky 6 tiket nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
	
	@Test
	public void uplataLucky6Kuglice1() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		selectRandomLucky6Kuglice(7);
		lucky.uplata().clear();
		lucky.uplata().sendKeys("50");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket sa 7 KUGLICA uspesno uplacen");
		else {
			log.error("Lucky 6 tiket sa 7 KUGLICA nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
	
	@Test
	public void uplataLucky6Kuglice2() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		selectRandomLucky6Kuglice(8);
		lucky.uplata().clear();
		lucky.uplata().sendKeys("100");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket sa 8 KUGLICA uspesno uplacen");
		else {
			log.error("Lucky 6 tiket sa 8 KUGLICA nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
	
	@Test
	public void uplataLucky6Kuglice3() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		selectRandomLucky6Kuglice(9);
		lucky.uplata().clear();
		lucky.uplata().sendKeys("300");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket sa 9 KUGLICA uspesno uplacen");
		else {
			log.error("Lucky 6 tiket sa 9 KUGLICA nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
	
	@Test
	public void uplataLucky6Kuglice4() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		selectRandomLucky6Kuglice(10);
		lucky.uplata().clear();
		lucky.uplata().sendKeys("700");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket sa 10 KUGLICA uspesno uplacen");
		else {
			log.error("Lucky 6 tiket sa 10 KUGLICA nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
	
	@Test
	public void uplataLucky6Kuglice5() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		slucajniOdabir();
		lucky.uplata().clear();
		lucky.uplata().sendKeys("100");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket slucajni odabir uspesno uplacen");
		else {
			log.error("Lucky 6 tiket slucajni odabir nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
	
/*	@Test(priority=1)
	public void uplataLucky6Singl() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		slucajniSingl();
		lucky.uplata().sendKeys(Keys.CONTROL + "a");
		lucky.uplata().sendKeys(Keys.DELETE);
		lucky.uplata().sendKeys("100");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Uspešno ste uplatili tiket", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Uspešno ste uplatili tiket"))
			log.info("Lucky 6 tiket singl uspesno uplacen");
		else {
			log.error("Lucky 6 tiket singl nije uplacen");
		}
		log.info(title);
		String title1 = lucky.jackpotCode().getText();
		log.info("Jackpot code je: "+ title1);
		lucky.UreduDugme().click();
	}
*/
	
	@Test(priority=2)
	public void uplataLucky6ViseKola() throws IOException, InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Lucky6Page lucky = new Lucky6Page(driver);
		lp.luckySuper6().click();
		wait_time(1);
		selectRandomLucky6Kuglice(6);
		selectLucky6Kolo();
		lucky.uplata().clear();
		lucky.uplata().sendKeys("50");
		lucky.uplataDugme().click();
		lucky.uplataDugme2().click();
		waitForTextToAppear(driver, "Vaši tiketi se uplaćuju, status uplaćenih tiketa proverite na stranici tiketi.", lucky.title());
		String title = lucky.title().getText();
		if(title.contains("Vaši tiketi se uplaćuju, status uplaćenih tiketa proverite na stranici tiketi."))
			log.info("Lucky 6 tiket za vise kola uspesno uplacen");
		else {
			log.error("Lucky 6 tiket za vise kola nije uplacen");
		}
		log.info(title);
		lucky.UreduDugme().click();
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
