package MozzartSrbija;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsSrbija.LandingPage;
import pageObjectsSrbija.RegistrationPage;
import resources.base;

public class Registracija extends base {
public static Logger log = LogManager.getLogger(base.class.getName());


	@Test
	public void Registacija() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getRegistruj().click();
		//Unosenje podataka
		Thread.sleep(500);
		RegistrationPage rp = new RegistrationPage(driver);
		rp.Ime().sendKeys("Petar");
		rp.Prezime().sendKeys("Petrovic");
		//Odabir dana iz dropdown menija
		Select dropdown = new Select(rp.Dan());
		dropdown.selectByIndex(1);
		//Odabir meseca iz dropdown menija
		Select dropdown1 = new Select(rp.Mesec());
		dropdown1.selectByIndex(1);
		//Odabir godine is dropdown menija
		Select dropdown2 = new Select(rp.Godina());
		dropdown2.selectByIndex(14);
		//Email
		rp.Email().sendKeys("pera2004@mailinator.com");
		rp.PonoviEmail().sendKeys("pera2004@mailinator.com");
		//Korisnicko IME
		rp.KorisnickoIme().sendKeys("pera2004");
		//Lozinka
		rp.Lozinka().sendKeys("888888");
		rp.PonoviLozinku().sendKeys("888888");
		
		//Capcha
		//Trazimo frame i checkbox u tom frame-u
		WebElement iframeSwitch = rp.FrameCaptcha();
		driver.switchTo().frame(iframeSwitch);
		rp.FrameCheckbox().click();
		driver.switchTo().defaultContent();
		
		//Uslovi koriscenja
		rp.PrihvatamDugme().click();
		
		Thread.sleep(2000);
		//Otvori nalog
//		rp.OtvoriNalogDugme().click();
//		boolean title = rp.title().getText().contains("aktivacioni email");
//		if(title)
//			log.info("Aktivacioni mail poslat");
//		else if(!title)
//			log.info("Aktivacioni mail nije poslat");
		}

	@AfterTest(alwaysRun = true)
	public void teardown() {
		//driver.close();
		//driver=null;
		//driver.quit();
	}
}
