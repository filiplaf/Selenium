package pageObjectsMalta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

		public WebDriver driver;
		By username = By.cssSelector("input#username");
		By emailAdress = By.cssSelector("input#email_address");
		By password = By.cssSelector("input#password");
		By confirmPassword = By.cssSelector("input#confirm_password");
		By name = By.cssSelector("input#firstName");
		By surname = By.cssSelector("input#lastName");
		By dateOfBirth = By.cssSelector("input#date_birth");
		By year = By.cssSelector("div#pageWrapper span.day__month_btn.up");
		By year1 = By.cssSelector("div#pageWrapper span.month__year_btn.up");
		By backArrow = By.cssSelector("div#pageWrapper div:nth-child(4) > header > span.prev");
		By pickYear = By.xpath("//*[contains(@class,'cell year')]");
		By pickMonth = By.xpath("//*[contains(@class,'cell month')]");
		By pickDay = By.xpath("//*[contains(@class,'cell day')]");
		By street = By.cssSelector("input#address");
		By zipcode = By.cssSelector("input#postCode");
		By city = By.cssSelector("input#city");
		By country = By.cssSelector("#pageWrapper > section > div.step1 > div.right > form > div:nth-child(9) > div > div > div.vs__selected-options > input");
		By countrySelection = By.cssSelector("div#dropdown v-select single searchable>div+ul>i");	
		By phoneNumber = By.cssSelector("input#phone");
		By genderMale = By.cssSelector("div#pageWrapper div.form__group.radio > div > label:nth-child(1) > span");
		By genderFemale = By.cssSelector("div#pageWrapper label:nth-child(2) > span");
		By termsOfUse = By.cssSelector("div#pageWrapper div:nth-child(13) > label > span");
		By recieveNews = By.cssSelector("div#pageWrapper div:nth-child(14) > label > span");
		By registerButton = By.cssSelector("div#pageWrapper div.step1 > div.right > form > button[type=\"submit\"]");
		By title = By.cssSelector("div#pageWrapper p.typ-text-secondary");
		By okButton = By.cssSelector("#pageWrapper > section > div > div.right > div.overlay > div > div.modal__body > button");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement username() {
			return driver.findElement(username);
		}
		public WebElement emailAdress() {
			return driver.findElement(emailAdress);
		}
		public WebElement password() {
			return driver.findElement(password);
		}
		public WebElement confirmPassword() {
			return driver.findElement(confirmPassword);
		}
		public WebElement name() {
			return driver.findElement(name);
		}
		public WebElement surname() {
			return driver.findElement(surname);
		}
		public WebElement dateOfBirth() {
			return driver.findElement(dateOfBirth);
		}
		public WebElement year() {
			return driver.findElement(year);
		}
		public WebElement year1() {
			return driver.findElement(year1);
		}
		public WebElement backArrow() {
			return driver.findElement(backArrow);
		}
		public List<WebElement> pickYear() {
			return driver.findElements(pickYear);
		}
		public List<WebElement> pickMonth() {
			return driver.findElements(pickMonth);
		}
		public List<WebElement> pickDay() {
			return driver.findElements(pickDay);
		}
		public WebElement street() {
			return driver.findElement(street);
		}
		public WebElement zipcode() {
			return driver.findElement(zipcode);
		}
		public WebElement city() {
			return driver.findElement(city);
		}
		public WebElement country() {
			return driver.findElement(country);
		}
		public List<WebElement> countrySelection() {
			return driver.findElements(countrySelection);
		}
		public WebElement phoneNumber() {
			return driver.findElement(phoneNumber);
		}
		public WebElement genderMale() {
			return driver.findElement(genderMale);
		}
		public WebElement genderFemale() {
			return driver.findElement(genderFemale);
		}
		public WebElement termsOfUse() {
			return driver.findElement(termsOfUse);
		}
		public WebElement recieveNews() {
			return driver.findElement(recieveNews);
		}
		public WebElement registerButton() {
			return driver.findElement(registerButton);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement okButton() {
			return driver.findElement(okButton);
		}
}
