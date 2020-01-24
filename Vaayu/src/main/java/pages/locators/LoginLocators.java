package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginLocators {
	
	
	/*
	 * public static By userName = (By.id("user_username")); public static By
	 * password = (By.id("user_password")); public static By signIn =
	 * (By.id("signin"));
	 */
	
		
	  @FindBy(how=How.XPATH, using="//input[@id='user_username']")
	  public WebElement userName;
	  
	  @FindBy(how=How.XPATH, using="//input[@id='user_password']") 
	  public WebElement password;
	  
	  @FindBy(how=How.NAME, using="commit") 
	  public WebElement signIn;
	  
	  
	 
	 
}
