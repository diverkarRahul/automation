package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait webDriverWait;
	public static final int TIMEOUT = 30;
	public static final int PAGE_LOAD_TIMEOUT = 30;
    
	public SeleniumDriver() {
		System.out.println("in seleniumDriver");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\project-workspace\\Vaayu\\src\\test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\25004801\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		webDriverWait = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	
	public static void openURL(String url) {

		driver.get(url);
	}

	@BeforeTest
	public static WebDriver getDriver() {

		return driver;
	}

	
	public static void setDriver() {

		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	@AfterTest
	public static void tearDown() {
		if(driver!= null) {
			driver.close();
			driver.quit();			
		}
		seleniumDriver = null;
	}

}
