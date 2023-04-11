package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class PerformancePage {
	
	public PerformancePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li")
	public WebElement configureButton;
	
	@FindBy (xpath = "//ul[@class='oxd-dropdown-menu']/li[2]")
	public WebElement trackerOption;
	
	@FindBy (xpath = "//ul[@class='oxd-main-menu']/li[7]")
	public WebElement performanceButton;
	
	@FindBy (xpath = "//div[@class='orangehrm-paper-container']/div[2]")
	public WebElement records;
	
	@FindBy (xpath = "//div[@class='orangehrm-container']/div/div[2]/div")
	public List <WebElement> numberOfEmployees;
	
	@FindBy (xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[2]")
	public WebElement manageReviews;
	
	@FindBy (xpath = "//ul[@class='oxd-dropdown-menu']/li[1]")
	public WebElement manageReviewsOption;
	
	@FindBy (xpath = "//div[@class='oxd-toast oxd-toast--info oxd-toast-container--toast']")
	public WebElement noRecords;
	
	@FindBy (xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']/div[5]")
	public WebElement Charlie;
	
	@FindBy (xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")
	public WebElement hintInputBox;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement searchButton;
	
	@FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div/div[2]")
	public WebElement charlieText;
	
	@FindBy (xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[4]")
	public WebElement employeeTrackers;
	
	@FindBy (xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-left-space oxd-table-cell-action-space'])[4]")
	public WebElement alia;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addLog;
	
	@FindBy (xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
	public WebElement logInputBox;
	
	@FindBy (xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[2]/div[2]/textarea")
	public WebElement comment;
	
	@FindBy (xpath = "//div[@class='oxd-form-actions orangehrm-form-action']/button[2]")
	public WebElement saveComment;
	
	@FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
	public WebElement sMessage;	
	
	
}
