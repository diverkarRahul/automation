package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResourcePeople {
	
	  //----------------Places Header details----------------//

	  @FindBy(how=How.XPATH, using="//span[contains(text(),'Resources')]") 
	  public WebElement resources;
	  
	  @FindBy(how=How.XPATH, using="//a[@class='btn btn-default people-style active']") 
	  public WebElement resourcePeople;
	  
	  @FindBy(how=How.XPATH, using="//a[@class='btn btn-default places-style']") 
	  public WebElement resourcePlaces;
	  
	  @FindBy(how=How.XPATH, using="//a[@class='btn btn-default things-style']") 
	  public WebElement resourceThings;
	  
	  @FindBy(how=How.XPATH, using="//a[contains(text(),'Sites')]") 
	  public WebElement placesSites;
	  
	  @FindBy(how=How.XPATH, using="//a[contains(text(),'Routes')]") 
	  public WebElement placesRoutes;
	  
	  
	  //----------------Sites & Routes details---------------//
	  
	  @FindBy(how=How.XPATH, using=".//div[contains(@class,'action-buttons')]/a[2]") 
	  public WebElement add;
	  
	  @FindBy(how=How.XPATH, using=".//div[contains(@class,'edit-buttons')]/button") 
	  public WebElement saveChanges;
	  
	  @FindBy(how=How.XPATH, using=".//div[contains(@class,'edit-buttons')]/a[1]") 
	  public WebElement cancel;
	  
	  @FindBy(how=How.ID, using="siteName") 
	  public WebElement siteName;
	  
	  @FindBy(how=How.ID, using="phone") 
	  public WebElement sitePhone;

	  @FindBy(how=How.ID, using="company") 
	  public WebElement siteCompany;
	  
	  @FindBy(how=How.ID, using="address") 
	  public WebElement siteAddress;
	  
	  @FindBy(how=How.ID, using="services") 
	  public WebElement siteServiceSection;
	  
	  @FindBy(how=How.ID, using="operator") 
	  public WebElement siteOperator;
	  
	  @FindBy(how=How.XPATH, using="//div[@id='addServicesDiv']/button") 
	  public WebElement siteAddService;
	  
	  @FindBy(how=How.ID, using="serviceType_1") 
	  public WebElement siteServiceType;
	  
	  @FindBy(how=How.ID, using="billingModel_1") 
	  public WebElement siteBillingModel;
	  
	  @FindBy(how=How.ID, using="varyWithVehicleYes_1") 
	  public WebElement siteVaryWithVehicleYes;
	  
	  @FindBy(how=How.ID, using="varyWithVehicleNo_1") 
	  public WebElement siteVaryWithVehicleNo;
	  
	  @FindBy(how=How.ID, using="defaultRate_1") 
	  public WebElement siteDefaultRate;
	  
	  @FindBy(how=How.ID, using="guardRate_1") 
	  public WebElement siteGuardRate;
	  
	  @FindBy(how=How.ID, using="serviceDelete_1") 
	  public WebElement siteServiceDelete;
	  
	  @FindBy(how=How.ID, using="cgst_1") 
	  public WebElement siteCGST;
	  
	  @FindBy(how=How.ID, using="sgst_1") 
	  public WebElement siteSGST;
	  
	  @FindBy(how=How.ID, using="route_name") 
	  public WebElement routeName;
	  
	  @FindBy(how=How.ID, using="stop_1_name") 
	  public WebElement routeStopName;
	  
	  @FindBy(how=How.ID, using="stop_1_address") 
	  public WebElement routeStopAddress;
	  
	  @FindBy(how=How.ID, using="add-stop") 
	  public WebElement routeAddStop;
	  
	  
	  
	  
	
}
