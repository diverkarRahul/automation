import utils.SeleniumDriver;

public class Login {
	
	System.out.println("in login");

	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		SeleniumDriver.setDriver();
	}

	@Given("^Enter URL \"([^\"]*)\"$")
	public void enter_URL(String arg1) throws Throwable {
		SeleniumDriver.openURL(url);
	}

	/*
	 * @Given("^I fill \"([^\"]*)\" field with text \"([^\"]*)\"$") public void
	 * i_fill_field_with_text(String arg1, String arg2) throws Throwable {
	 * 
	 * }
	 * 
	 * @When("^I click on \"([^\"]*)\"$") public void i_click_on(String arg1) throws
	 * Throwable {
	 * 
	 * }
	 * 
	 * @Then("^I should see \"([^\"]*)\"$") public void i_should_see(String arg1)
	 * throws Throwable {
	 * 
	 * }
	 */

}
