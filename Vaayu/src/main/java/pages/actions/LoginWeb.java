package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.LoginLocators;
import utils.SeleniumDriver;


public class LoginWeb extends SeleniumDriver {

	//WebDriver driver = null;
	LoginLocators loginloc = null;	

	public LoginWeb() {
		this.loginloc = new LoginLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginloc);
	}

	/*
	 * public static void sendValue(String val, By locator) { System.out.println(val
	 * +"...."+ locator);
	 * 
	 * WebElement sendValueEle = driver.findElement(locator);
	 * 
	 * System.out.println(sendValueEle); sendValueEle.clear();
	 * sendValueEle.sendKeys(val); }
	 */

	public void LoginUserName(String val) {
		System.out.println("inLoginLocator");
		System.out.println(val +"...." );
		this.loginloc.userName.sendKeys(val);
	}

	public void LoginPassword(String val) { 
		System.out.println(val +"...." );
		this.loginloc.password.sendKeys(val); 
	}


	public void LoginSubmit() {
	/*	WebElement clickButton = driver.findElement(signIn); 
		clickButton.click();*/
		if(this.loginloc.signIn.isEnabled()) {
			System.out.println("in SignIn");
			this.loginloc.signIn.click();
		}
		
	}

	/*
	 * public static void verifyText(By locator) {
	 * 
	 * }
	 */

}
