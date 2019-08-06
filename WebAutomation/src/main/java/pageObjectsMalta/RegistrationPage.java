package pageObjectsMalta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

		public WebDriver driver;
		By Username = By.cssSelector("input#username");
		By EmailAdress = By.cssSelector("input#email_address");
		By Password = By.cssSelector("input#password");
		By ConfirmPassword = By.cssSelector("input#confirm_password");
		By Name = By.cssSelector("input#firstName");
		By Surname = By.cssSelector("input#lastName");
		By DateOfBirth = By.cssSelector("input#date_birth");
		By Year = By.cssSelector("div#pageWrapper span.day__month_btn.up");
		By Year1 = By.cssSelector("div#pageWrapper span.month__year_btn.up");
		By BackArrow = By.cssSelector("div#pageWrapper div:nth-child(4) > header > span.prev");
		By PickYear = By.xpath("//*[contains(@class,'cell year')]");
		By PickMonth = By.xpath("//*[contains(@class,'cell month')]");
		By PickDay = By.xpath("//*[contains(@class,'cell day')]");
		By Street = By.cssSelector("input#address");
		By Zipcode = By.cssSelector("input#postCode");
		By City = By.cssSelector("input#city");
		By Country = By.cssSelector("div#pageWrapper div:nth-child(9) > div > div");
		By CountrySelection = By.cssSelector("#pageWrapper > section > div > div.right > form > div:nth-child(9) > div > div.form__select__options > div");
		By PhoneNumber = By.cssSelector("input#phone");
		By GenderMale = By.cssSelector("div#pageWrapper div.form__group.radio > div > label:nth-child(1) > span");
		By GenderFemale = By.cssSelector("div#pageWrapper label:nth-child(2) > span");
		By TermsOfUse = By.cssSelector("div#pageWrapper div:nth-child(13) > label > span");
		By RecieveNews = By.cssSelector("div#pageWrapper div:nth-child(14) > label > span");
		By RegisterButton = By.cssSelector("div#pageWrapper button[type=\"submit\"]");
		By Title = By.cssSelector("#pageWrapper > section > div > div.right > div.overlay > div > div.modal__body > p");
		By OkButton = By.cssSelector("#pageWrapper > section > div > div.right > div.overlay > div > div.modal__body > button");
		
		public RegistrationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public WebElement Username() {
			return driver.findElement(Username);
		}
		public WebElement EmailAdress() {
			return driver.findElement(EmailAdress);
		}
		public WebElement Password() {
			return driver.findElement(Password);
		}
		public WebElement ConfirmPassword() {
			return driver.findElement(ConfirmPassword);
		}
		public WebElement Name() {
			return driver.findElement(Name);
		}
		public WebElement Surname() {
			return driver.findElement(Surname);
		}
		public WebElement DateOfBirth() {
			return driver.findElement(DateOfBirth);
		}
		public WebElement Year() {
			return driver.findElement(Year);
		}
		public WebElement Year1() {
			return driver.findElement(Year1);
		}
		public WebElement BackArrow() {
			return driver.findElement(BackArrow);
		}
		public List<WebElement> PickYear() {
			return driver.findElements(PickYear);
		}
		public List<WebElement> PickMonth() {
			return driver.findElements(PickMonth);
		}
		public List<WebElement> PickDay() {
			return driver.findElements(PickDay);
		}
		public WebElement Street() {
			return driver.findElement(Street);
		}
		public WebElement Zipcode() {
			return driver.findElement(Zipcode);
		}
		public WebElement City() {
			return driver.findElement(City);
		}
		public WebElement Country() {
			return driver.findElement(Country);
		}
		public List<WebElement> CountrySelection() {
			return driver.findElements(CountrySelection);
		}
		public WebElement PhoneNumber() {
			return driver.findElement(PhoneNumber);
		}
		public WebElement GenderMale() {
			return driver.findElement(GenderMale);
		}
		public WebElement GenderFemale() {
			return driver.findElement(GenderFemale);
		}
		public WebElement TermsOfUse() {
			return driver.findElement(TermsOfUse);
		}
		public WebElement RecieveNews() {
			return driver.findElement(RecieveNews);
		}
		public WebElement RegisterButton() {
			return driver.findElement(RegisterButton);
		}
		public WebElement Title() {
			return driver.findElement(Title);
		}
		public WebElement OkButton() {
			return driver.findElement(OkButton);
		}
		
		
}
