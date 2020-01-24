package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResourceThingsLocators {
	
	  //---------------Things Header details-------------------//

	  @FindBy(how=How.XPATH, using="//a[@class='btn btn-default things-style']") 
	  public WebElement resourceThings;
	  
	  @FindBy(how=How.XPATH, using="//a[contains(text(),'Vehicles')]") 
	  public WebElement thingsVehicles;
	  
	  @FindBy(how=How.XPATH, using="//a[contains(text(),'Devices')]") 
	  public WebElement thingsDevices;
	  
	  @FindBy(how=How.XPATH, using="//a[contains(text(),'Shifts')]") 
	  public WebElement thingsShifts;
	  	  
	  //----------Vehicle, Devices & Shift details------------//
	  
	  @FindBy(how=How.XPATH, using=".//div[contains(@class,'action-buttons')]/a[2]") 
	  public WebElement add;
	  
	  @FindBy(how=How.XPATH, using=".//div[contains(@class,'edit-buttons')]/button") 
	  public WebElement saveChanges;
	  
	  @FindBy(how=How.XPATH, using=".//div[contains(@class,'edit-buttons')]/a[1]") 
	  public WebElement cancel;
	  
	  @FindBy(how=How.ID, using="vehicle_business_associate_idSelectBoxIt") 
	  public WebElement vehicleChooseAssociate;
	  
	  @FindBy(how=How.ID, using="vehicle_make") 
	  public WebElement vehicleMake;
	  
	  @FindBy(how=How.XPATH, using="//input[@id='vehicle_photo']") 
	  public WebElement vehicleImage;
	  
	  
	  
	  
	  
	
}
