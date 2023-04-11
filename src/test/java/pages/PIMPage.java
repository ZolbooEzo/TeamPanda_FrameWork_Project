package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class PIMPage {
	
	public PIMPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "(//span[@Class ='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	public WebElement PIMButton;

	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")
	public WebElement addEmployee;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active orangehrm-firstname'])[1]")
	public WebElement firstName;

	@FindBy(xpath = "//input[@name = 'middleName']")
	public WebElement middleName;

	@FindBy(xpath = "//input[@name = 'lastName']")
	public WebElement lastName;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement saveButton;

	@FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-item']")
	public WebElement employeeList;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement searchButton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	public WebElement editButton;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[5]")
	public WebElement deleteButton;

	@FindBy(xpath = "//div[@class='orangehrm-tabs-wrapper'][2]")
	public WebElement contactdetails;

	@FindBy(xpath = "//div[@class='oxd-select-text--after']")
	public WebElement country;

	@FindBy(xpath = "//div[@class ='oxd-select-text oxd-select-text--active']")
	public WebElement Afghanistan;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	public WebElement yesDeleteButton;

	@FindBy(xpath = "(//span[@Class ='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
	public WebElement leaveButton;

	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	public WebElement EmNameBox;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement EmNameBox2;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement viewButton;

	@FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
	public WebElement notfoundpage;
	
	@FindBy(xpath = "//div[@class='oxd-select-option'][3]")
	public WebElement albanianOption;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement saveButtonEdit;
}
