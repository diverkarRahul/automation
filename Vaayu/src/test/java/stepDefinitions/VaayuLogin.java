package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginWeb;
import pages.locators.LoginLocators;
import utils.SeleniumDriver;

public class VaayuLogin {

	LoginWeb login = new LoginWeb();
	
	@Given("^I Open Browser$")
	public void i_Open_Browser() throws Throwable {
		
	}

	@Given("^I Enter URL as \"([^\"]*)\"$")
	public void i_Enter_URL_as(String url) throws Throwable {
		SeleniumDriver.openURL(url);
	}

	@And("^I fill \"([^\"]*)\" field with text \"([^\"]*)\"$")
	public void i_fill_field_with_text(String id, String value) throws Throwable {	
		System.out.println("First"+id +" , "+ value);
		if(id.equals("Username")) {
			System.out.println("FirstUN"+id +" , "+ value);
			//Login.sendValue(value, LoginLocators.userName);
			login.LoginUserName(value);
		}else if(id.equals("Password")) {
			System.out.println("FirstPWD"+id +" , "+ value);
			//Login.sendValue(value, LoginLocators.password);
			login.LoginPassword(value);
		}		
	}

	@When("^I click on Submit$")
	public void i_click_on_Submit() throws Throwable {
		login.LoginSubmit();
	}

	/*
	 * @Then("^I should see \"([^\"]*)\"$") public void i_should_see(String arg1)
	 * throws Throwable {
	 * 
	 * }
	 */


}
