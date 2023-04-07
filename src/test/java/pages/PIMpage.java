package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class PIMpage {

	@FindBy (xpath = "(//span[@Class ='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement PIMButton;
	
	
	@FindBy (xpath = "//a[@class='oxd-topbar-body-nav-tab-item']")
	public WebElement addEmployee;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active orangehrm-firstname'])[1]")
	public WebElement firstName;
	
	@FindBy (xpath = "//input[@class='oxd-input-group oxd-input-field-bottom-space'])")
	public WebElement middleName;
	
	@FindBy (xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	public WebElement lastName;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\']")
	public WebElement saveButton;
	
	
	
	@FindBy (xpath = "//a[@class='oxd-topbar-body-nav-tab-item']")
	public WebElement employeeList;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement searchButton;

	
	
	
	@FindBy (xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	public WebElement editButton;
	
	
	@FindBy (xpath = "//i[@class='oxd-icon bi-trash']")
	public WebElement deleteButton;
	
	
	
		
	@FindBy (xpath = "//a[@class='orangehrm-tabs-item']")
	public WebElement contactdetails;
	
	@FindBy (xpath = "//div[@class='oxd-select-text--after']")
	public WebElement country;
	
	

	
	
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement yesDeleteButton;
	
	@FindBy (xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement leave;
	
	@FindBy (xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	public WebElement employeeNameBox1;
	
	
	@FindBy (xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement time;
	
	
	
	@FindBy (xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	public WebElement employeeNameBox2;

	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement viewButton;
	
	
	@FindBy (xpath = ("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"))
	public WebElement recuitmentButton;
	
	@FindBy (xpath = "(//div[@class='data-v-2fe357a6'])")
	public WebElement keyword;
	
	
	
	
}
