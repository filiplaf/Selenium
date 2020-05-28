package resources;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Git workspace\\Selenium\\chromedriver.exe");
			System.setProperty("webdriver.chrome.logfile", "C:\\Git workspace\\chromedriver.log");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			// options.addArguments("--headless");
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Git workspace\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

//Ukljucen Maven dependency
	public void getScreenshots(String result) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Git workspace\\Selenium\\WebAutomation\\screenshotsFailed\\" +result+"screenshot.png"));
}
	public void takeScreenshotSerbia(String name) throws Exception{
		wait_time(1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Git workspace\\Selenium\\WebAutomation\\ScreenshotsSerbia\\" + name+".png"));
	}
	
	public void takeScreenshotGermania(String name) throws Exception{
		wait_time(1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Git workspace\\Selenium\\WebAutomation\\ScreenshotsGermania\\" + name+".png"));
	}
	
	public void takeScreenshotRumunija(String name) throws Exception{
		wait_time(1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Git workspace\\Selenium\\WebAutomation\\ScreenshotsRumunija\\" + name+".png"));
	}
	
	public void takeScreenshotMalta(String name) throws Exception{
		wait_time(1);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Git workspace\\Selenium\\WebAutomation\\ScreenshotsMalta\\" + name+".png"));
	}
	
//    public static void deleteScreenshot() {
//        //absolute file name with path
//        File file = new File("C:\\Git workspace\\Selenium\\WebAutomation\\ScreenshotsSerbia");
//        if(file.exists()){
//        	file.delete();
//        	log.info("Old file deleted, new will be created!");
//        }
//        else log.info("File doesn't exist, will be created!");
//	}

	public static void wait_time(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
		}
	}

	public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement webElement, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}

	public static void jsClick(WebElement element, WebDriver driver) {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", element);

	}

	public static void moveToElementAndClick(WebElement element) {
		new Actions(driver).moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static String moveToElementAndRead(WebElement element) {
		new Actions(driver).moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element.getText();
	}
	
	public static boolean waitForElementToAppear(WebDriver driver, WebElement element) {	
		try { Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
	}
		catch (Exception e) {
			return false;
		}
	}

	public static boolean waitForTextToAppear(WebDriver driver, String textToAppear, WebElement element) {	
		try { Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
			return true;
	}
		catch (Exception e) {
			return false;
		}
	}
	
	public static void staleElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.stalenessOf(element));	
	}	
	
	public void selectRandomMatch(int numMatches) {
		while(true) {
		List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='partvar odds'] span span"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(40);   //Kada se pokrece na desktopu staviti 150
		wait_time(1);
		allOdds.get(randomMatch).click();
		List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='partvar odds active'] span span"));
		if(activeOdds.size()==numMatches) {break;}
	}}
	
	public void selectRandomMatchGermania(int numMatches) {
		while(true) {
		List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='partvar odds'] span span"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(40);   //Kada se pokrece na desktopu staviti 150
		wait_time(1);
		allOdds.get(randomMatch).click();
		List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='partvar odds active']"));
		if(activeOdds.size()==numMatches) {break;}
	}}
	
	public void selectRandomMatchRumunija(int numMatches) {
		while(true) {
		List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='partvar odds'] span span"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(40);  //Kada se pokrece na desktopu staviti 150
		wait_time(1);
		allOdds.get(randomMatch).click();
		List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='partvar odds active']"));
		if(activeOdds.size()==numMatches) {break;}
	}}
	
	public void selectRandomMatchMalta(int numMatches) {
		while(true) {
		List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='partvar odds'] span span"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(40);  //Kada se pokrece na desktopu staviti 150
		wait_time(1);
		allOdds.get(randomMatch).click();
		List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='partvar odds active']"));
		if(activeOdds.size()==numMatches) {break;}
	}}
	
	public void selectBrziTransfer() {
		List<WebElement> allBrzi = driver.findElements(By.cssSelector("div[class='values'] span"));
		Random rand = new Random();
		int randomBrzi = rand.nextInt(4);
		wait_time(1);
		allBrzi.get(randomBrzi).click();
	}
	
	public void selectBrziTransferGermania() {
		List<WebElement> allBrzi = driver.findElements(By.cssSelector("div[class='values'] span"));
		Random rand = new Random();
		int randomBrzi = rand.nextInt(4);
		wait_time(1);
		allBrzi.get(randomBrzi).click();
	}
	
	public void selectBrziTransferRumunija() {
		List<WebElement> allBrzi = driver.findElements(By.cssSelector("div[class='values'] span"));
		Random rand = new Random();
		int randomBrzi = rand.nextInt(4);
		wait_time(1);
		allBrzi.get(randomBrzi).click();
	}
	
	public void selectRandomLotoNumber(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers'] p[class='number']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(70);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, 'number list')]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomLotoNumberGermania(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers'] span[class='n']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(70);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, 'number list')]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomLotoNumberRumunija(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers'] span[class='n']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(70);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, 'number list')]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomLotoNumberMalta(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers'] span[class='n']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(70);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, 'number list')]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomLotoKolo() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("p[class='round']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
	
	public void selectRandomLotoKoloGermania() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='next-rounds'] p"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
	
	public void selectRandomLotoKoloRumunija() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='next-rounds'] p"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
	
	public void selectRandomLotoKoloMalta() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='next-rounds'] p"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
	
	public void selectRandomGNumber(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers lucky'] p[class='number']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(75);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, \"number list\")]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomGNumberGermania(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers lucky'] p[class='number']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(75);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, 'number list')]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomGNumberMalta(int numLoto) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='numbers lucky'] p[class='number']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(75);
		allLotoOdds.get(randomMatch).click();
		List<WebElement> activeLotoOdds = driver.findElements(By.xpath("//*[contains(@class, 'number list')]"));
		if(activeLotoOdds.size()==numLoto) {break;}
	}}
	
	public void selectRandomGKolo() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("p[class='round']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
	
	public void selectRandomGKoloGermania() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='next-rounds'] p"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
	
	public void selectRandomGKoloMalta() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='next-rounds'] p"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(3);
		allLotoOdds.get(randomMatch).click();
		break;
	}}
			
		public void selectRandomVirtualMatch(int numMatch) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("td[class='odd']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(22);
		allLotoOdds.get(randomMatch).click();  
		List<WebElement> activeLotoOdds = driver.findElements(By.cssSelector("td[class='odd selected']"));
		if(activeLotoOdds.size()==numMatch) {break;}
	}}
		
		public void selectRandomVirtualMatchGermania(int numMatch) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("td[class='odd']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(22);
		allLotoOdds.get(randomMatch).click();  
		List<WebElement> activeLotoOdds = driver.findElements(By.cssSelector("td[class='odd selected']"));
		if(activeLotoOdds.size()==numMatch) {break;}
	}}
		
		public void selectRandomVirtualMatchRumunija(int numMatch) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("td[class='odd']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(22);
		allLotoOdds.get(randomMatch).click();  
		List<WebElement> activeLotoOdds = driver.findElements(By.cssSelector("td[class='odd selected']"));
		if(activeLotoOdds.size()==numMatch) {break;}
	}}
		
		public void selectRandomVirtualMatchMalta(int numMatch) {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("td[class='odd']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(22);
		allLotoOdds.get(randomMatch).click();  
		List<WebElement> activeLotoOdds = driver.findElements(By.cssSelector("td[class='odd selected']"));
		if(activeLotoOdds.size()==numMatch) {break;}
	}}
		
		public void selectRandomSinglLotoSrbija() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("span[class='odd-font lotto-additional-css']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(10);
		allLotoOdds.get(randomMatch).click();  
		break;
	}}
		
		public void selectRandomSinglLotoGermania() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("span[class='odd-font lotto-additional-css']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(10);
		allLotoOdds.get(randomMatch).click();  
		break;
	}}
		
		public void selectRandomSinglLotoRumunija() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("span[class='odd-font lotto-additional-css']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(10);
		allLotoOdds.get(randomMatch).click();  
		break;
	}}
		
		public void selectRandomSinglLotoMalta() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("span[class='odd-font lotto-additional-css']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(10);
		allLotoOdds.get(randomMatch).click();  
		break;
	}}
		public void selectRandomSinglLotoLowHigh() {
		while(true) {
		List<WebElement> allLotoOdds = driver.findElements(By.cssSelector("div[class='slider-button subgame']"));
		Random rand = new Random();
		int randomMatch = rand.nextInt(7);
		allLotoOdds.get(randomMatch).click();  
		break;
	}}
		
		public void selectRandomLucky6Kuglice(int numKuglica) {
		while(true) {
		List<WebElement> allKuglice = driver.findElements(By.xpath("//*[contains(@class, 'number small')]"));
		Random rand = new Random();
		int randomKuglica = rand.nextInt(40);
		allKuglice.get(randomKuglica).click(); 
		List<WebElement> activeKuglice = driver.findElements(By.xpath("//*[contains(@class, 'number small active')]"));
		if(activeKuglice.size()==numKuglica) {break;}
	}}
		
		public void selectLucky6Kolo() {
		while(true) {
		List<WebElement> allKola = driver.findElements(By.cssSelector("div[class='next-rounds'] p"));
		Random rand = new Random();
		int randomKuglica = rand.nextInt(3);
		allKola.get(randomKuglica).click(); 
		break;
	}}
		
		public void selectRandomLiveMatchSerbia(int numMatches){
			while(true) {
			List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='odd flex1']"));
			Random rand = new Random();
			int randomMatch = rand.nextInt(20);   //menjanje u zavisnosti koliko meceva ima
			wait_time(1);
			allOdds.get(randomMatch).click();
			List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='odd flex1 active']"));
			if(activeOdds.size()==numMatches) {break;}
		}}
		
		public void selectRandomLiveMatchGermania(int numMatches){
			while(true) {
			List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='odd flex1']"));
			Random rand = new Random();
			int randomMatch = rand.nextInt(20);
			wait_time(1);
			allOdds.get(randomMatch).click();
			List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='odd flex1 active']"));
			if(activeOdds.size()==numMatches) {break;}
		}}
		
		public void selectRandomLiveMatchRumunija(int numMatches){
			while(true) {
			List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='odd flex1']"));
			Random rand = new Random();
			int randomMatch = rand.nextInt(20);
			wait_time(1);
			allOdds.get(randomMatch).click();
			List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='odd flex1 active']"));
			if(activeOdds.size()==numMatches) {break;}
		}}
		
		public void selectRandomLiveMatchMalta(int numMatches){
			while(true) {
			List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='odd flex1']"));
			Random rand = new Random();
			int randomMatch = rand.nextInt(20);
			wait_time(1);
			allOdds.get(randomMatch).click();
			List<WebElement> activeOdds = driver.findElements(By.cssSelector("div[class='odd flex1 active']"));
			if(activeOdds.size()==numMatches) {break;}
		}}
		
		public void selectRandomPredefinisan(int numMatches){
			while(true) {
			List<WebElement> allOdds = driver.findElements(By.cssSelector("div[class='games'] span"));
			Random rand = new Random();
			int randomMatch = rand.nextInt(10);
			wait_time(1);
			allOdds.get(randomMatch).click();
			List<WebElement> activeOdds = driver.findElements(By.cssSelector("span[class='active']"));
			if(activeOdds.size()==numMatches) {break;}
		}}
}
