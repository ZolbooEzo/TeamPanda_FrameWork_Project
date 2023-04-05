package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class DirectoryPage {

	public DirectoryPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "oxd-autocomplete-text-input oxd-autocomplete-text-input--active")
	public WebElement employeeNameBox;
	
	@FindBy (xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement jobTitleDrop;
	
	@FindBy (xpath = "//*[contains(text(), 'HR Manager')]")
	public WebElement hrManagerOption;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement locationDrop;
	
	@FindBy (xpath = "//*[contains(text(),'Texas R&D')]")
	public WebElement texasRDOption;
	
	@FindBy (xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement searchButton;
	
	@FindBy (xpath = "//*[@class='oxd-text oxd-text--p orangehrm-directory-card-subtitle --break-words']")
	public List <WebElement> employeesJobTitles;
	
	@FindBy (xpath = "//*[@class='oxd-text oxd-text--p orangehrm-directory-card-description --break-words'][2]")
	public List <WebElement> employeesLocation;
	
	@FindBy (xpath = "//*[@class='oxd-text oxd-text--span']")
	public WebElement recordsFoundText;
	
	@FindBy (xpath = "//div[@class='orangehrm-container']/div/div")
	public List <WebElement> EmployeesList;
	
	
	@FindBy (xpath = "//div[@class='orangehrm-container']/div/div[1]/div")
	public WebElement firstEmployeeOnTheList;
	
					  
	@FindBy (xpath = "//p[@class='oxd-text oxd-text--p orangehrm-directory-card-header --break-words'][1]")
	public WebElement firstEmployeeName;
	
	@FindBy (xpath = "//p[@class='oxd-text oxd-text--p orangehrm-directory-card-header']")
	public WebElement employeeProfilePopUpName;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	


