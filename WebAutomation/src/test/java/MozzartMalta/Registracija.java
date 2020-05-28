package MozzartMalta;


import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import pageObjectsMalta.RegistrationPage;
import resources.base;

public class Registracija extends base {
public static Logger log = LogManager.getLogger(base.class.getName());

public String ime = "jakov13";
public String password = "8888888A";
public String email = "jakov13@yopmail.com";
public String name = "Filip";
public String surname = "Putnikovic";
public String street = "Buenos Aires";
public String zipcode = "11000";
public String country = "Argentina";
public String city = "Buenos";
public String phoneNumber = "111111";

	@Test
	public void registacija() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url3"));
		LandingPage lp = new LandingPage(driver);
		lp.cookie().click();
		lp.driver.navigate().refresh();
		lp.getRegistruj().click();
		//Unosenje podataka
		Thread.sleep(1000);
		RegistrationPage rp = new RegistrationPage(driver);
		rp.username().sendKeys(ime);
		rp.emailAdress().sendKeys(email);
		rp.password().sendKeys(password);
		rp.confirmPassword().sendKeys(password);
		rp.name().sendKeys(name);
		rp.surname().sendKeys(surname);
		//Unosenje datuma
		//Year and Month
		rp.dateOfBirth().click();
		rp.year().click();
		rp.year1().click();
		rp.backArrow().click();
		rp.backArrow().click();
		rp.pickYear().get(9).click();  //1989
		rp.pickMonth().get(0).click(); //january
		//Day
		for (int i=0; i<rp.pickDay().size(); i++) {
			String temp = rp.pickDay().get(i).getText();
			if(temp.equals("1")) {
				rp.pickDay().get(i).click();
				break;
			}
		}
		//Nastavak
		rp.street().sendKeys(street);
		rp.zipcode().sendKeys(zipcode);
		rp.city().sendKeys(city);
		//Country
		rp.country().click();
		rp.country().sendKeys(country);
		rp.country().sendKeys(Keys.ENTER);
		//PhoneNumber
		rp.phoneNumber().sendKeys(phoneNumber);
		//Gender
		rp.genderMale().click();	
		//Terms of use
		rp.termsOfUse().click();
		rp.recieveNews().click();
		//Register
		rp.registerButton().click();
		wait_time(1);
		String title = rp.title().getText();
		if(title.contains("We've just sent you an email with the activation link."))
			log.info("Verifikacioni mail je uspesno poslat");
		else 
			log.error("Verifikacioni mail nije uspesno poslat");
		driver.close();
		driver.quit();
	}
}
