package resources;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
public static WebDriver driver;
public Properties prop;

	
public WebDriver initializeDriver() throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	//System.out.println(prop.getProperty("url"));
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Git workspace\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.logfile", "C:\\Git workspace\\chromedriver.log");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--headless");
		options.addArguments("disable-infobars"); 
		driver = new ChromeDriver(options);
	}
	else if (browserName.equals("firefox")) {
		 driver = new FirefoxDriver();
	}
	else if (browserName.equals("IE")) {
		 driver = new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
//Ukljucen Maven dependency
public void getScreenshots(String result) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("" + result + "screenshot.png"));
}

}

