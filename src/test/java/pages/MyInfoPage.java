package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class MyInfoPage {
	
	public MyInfoPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//div[@class='orangehrm-tabs']/div")
	public List <WebElement> MyInfoList;
	
	@FindBy (xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text'])[1]")
	public WebElement assignDependentsAddButton;		
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement assignDependentsNameBox;		
	
	@FindBy (xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	public WebElement relationshipDropDown;		
			
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement dependentsSaveButton;		
		
	@FindBy (xpath = "//div[@class='oxd-select-option'][2]")
	public WebElement childOption;		
			
	@FindBy (xpath = "//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]")
	public WebElement dependentsEditButton;			
	
	@FindBy (xpath = "//div[@class='oxd-table-body']/div/div/div[2]")
	public List <WebElement> dependentsList;		
	
	@FindBy (xpath = "//div[@id='oxd-toaster_1']")
	public WebElement successfullySavedMessage;		
	
	@FindBy (xpath = "//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
	public WebElement genderButton;	
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'][1]")
	public WebElement saveButtonPersonal;		
	
	@FindBy (xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text'])[2]")
	public WebElement educationAddButton;
	
	@FindBy (xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	public WebElement educationSelect;
	
	@FindBy (xpath = "//div[@class='oxd-select-option'][4]")
	public WebElement mastersDegreeOption;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement educationSaveButton;
	
	@FindBy (xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'][1])[1]")
	public WebElement educationDeleteButton;	
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement deleteConfimation;
}
