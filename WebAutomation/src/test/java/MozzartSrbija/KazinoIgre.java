package MozzartSrbija;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjectsSrbija.KazinoPage;
import pageObjectsSrbija.LandingPage;
import resources.base;

public class KazinoIgre extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void kazinoIgranje() throws Exception {
		LandingPage lp = new LandingPage(driver);
		lp.getKazino().click();
		wait_time(3);
		KazinoPage kp = new KazinoPage(driver);
		Actions action = new Actions(driver);
		//Hover da bi videli dugme IGRAJ
		action.moveToElement(kp.casomatic()).perform();
		wait_time(2);
		kp.casomaticPlay().click();
		wait_time(15);
		log.info("Trenutni kazino balans je: "+kp.kazinoBalans().getText());
		//Klik na Continue dugme
		Robot robot = new Robot();
		//laptop
		//robot.mouseMove(275, 685);
		//destop
		robot.mouseMove(350, 865);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		wait_time(5);
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#pageWrapper > section > section > section > section.central-part > article.single-game-window.dark > iframe")));
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("gameFrame")));
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("netEntGame")));
		wait_time(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		wait_time(3);
		WebElement auto = driver.findElement(By.id("autoplaySettingsSettingsButton"));
		auto.click();
		WebElement desetSpinova = driver.findElement(By.id("value10"));
		desetSpinova.click();
		wait_time(100);
	}
	
	
	}
