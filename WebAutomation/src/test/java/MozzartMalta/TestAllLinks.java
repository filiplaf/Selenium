package MozzartMalta;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectsMalta.LandingPage;
import resources.base;


public class TestAllLinks extends base {
    //get all links into a list
	//get the URL from list, then check if the URL response is 200
	
	@Test
	public void mozzartHomePage() throws IOException {
	driver = initializeDriver();
	driver.get(prop.getProperty("url3"));
	LandingPage lp = new LandingPage(driver);
	lp.cookie().click();
	driver.navigate().refresh();
	wait_time(2);
	List<WebElement> elementList = driver.findElements(By.tagName("a"));
	System.out.println("Total number of WebPage links present on webpage is " +elementList.size());
	
	List<WebElement> imageList = driver.findElements(By.tagName("img"));
	System.out.println("Total number of Image links present on webpage is " +imageList.size());
	
	//Total number of links present
	elementList.addAll(imageList);
	
	HttpURLConnection con = null;
	for(WebElement element:elementList) {
		String url = element.getAttribute("href");
		if(url!=null&&!url.contains("javascript")) {
			con =(HttpURLConnection)(new URL(url)).openConnection();
			con.connect();
			con.setConnectTimeout(3000);
			int respCode = con.getResponseCode();
			System.out.println("Connection Status for URL " +url+ " is " +respCode);
			if(respCode==500) {
				log.error("BROKEN LINK ****** " + url);
			}
		}
	}
	con.disconnect();
	driver.quit();
}
}