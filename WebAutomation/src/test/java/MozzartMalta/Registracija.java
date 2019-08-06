package MozzartMalta;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.RegistrationPage;
import resources.base;

public class Registracija extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

public String ime = "teeest59";
public String password = "8888888A";
public String email = "teeeest@mailinator.com";
public String name = "Petar";
public String surname = "Prvi";
public String country = "Malta";
public String street = "Takovska 45";
public String zipcode = "11000";
public String city = "Beograd";
public String phoneNumber = "111111";

	@Test
	public void Registacija() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url3"));
		LandingPage lp = new LandingPage(driver);
		lp.znak().click();
		lp.getRegistruj().click();
		//Unosenje podataka
		Thread.sleep(1000);
		RegistrationPage rp = new RegistrationPage(driver);
		rp.Username().sendKeys(ime);
		rp.EmailAdress().sendKeys(email);
		rp.Password().sendKeys(password);
		rp.ConfirmPassword().sendKeys(password);
		rp.Name().sendKeys(name);
		rp.Surname().sendKeys(surname);
		//Unosenje datuma
		//Year and Month
		rp.DateOfBirth().click();
		rp.Year().click();
		rp.Year1().click();
		rp.BackArrow().click();
		rp.BackArrow().click();
		rp.PickYear().get(2).click();  //1992
		rp.PickMonth().get(0).click(); //january
		//Day
		for (int i=0; i<rp.PickDay().size(); i++) {
			String temp = rp.PickDay().get(i).getText();
			if(temp.equals("1")) {
				rp.PickDay().get(i).click();
				break;
			}
		}
		//Nastavak
		rp.Street().sendKeys(street);
		rp.Zipcode().sendKeys(zipcode);
		rp.City().sendKeys(city);
		//Country selection
		rp.Country().click();
		for (int i=0; i<rp.CountrySelection().size(); i++) {
			String temp = rp.CountrySelection().get(i).getText();
			if(temp.equals(country)) {
				rp.CountrySelection().get(i).click();
				break;
			}
		}
		//PhoneNumber
		rp.PhoneNumber().sendKeys(phoneNumber);
		//Gender
		rp.GenderMale().click();	
		//Terms of use
		rp.TermsOfUse().click();
		rp.RecieveNews().click();
		//Register
		rp.RegisterButton().click();
		Thread.sleep(1000);
		String title = rp.Title().getText();
		if(title.contains("You have successfully completed registration. Please check your email"))
			log.info("Verifikacioni mail je uspesno poslat");
		else {
			log.error("Verifikacioni mail nije uspesno poslat");
		}
		Thread.sleep(500);
		rp.OkButton().click();
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
