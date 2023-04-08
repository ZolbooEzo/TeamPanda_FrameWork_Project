package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class DashBoardPages {
	
	public DashBoardPages() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//input[@name='username']")
	public WebElement userNameBox;
	
	@FindBy (xpath = "//input[@name='password']")
	public WebElement passwordBox;
	
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginButton;
	
	
	@FindBy (xpath = "(//p[@class='oxd-text oxd-text--p'])[1]")
	public WebElement timeAtWork;
	
	@FindBy (xpath = "(//p[@class='oxd-text oxd-text--p'])[4]")
	public WebElement myActions;
	
	@FindBy (xpath = "(//p[@class='oxd-text oxd-text--p'])[7]")
	public WebElement quickLaunch;
	
	
	@FindBy (xpath = "//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
	public WebElement switchBttn;
	
	
	@FindBy (xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement switchTab;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement saveButtn;
	
	
	
	@FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card'][1]")
	public WebElement assingLeave;
	
	@FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card'][2]")
	public WebElement leaveList;
	
	
	@FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card'][3]")
	public WebElement timeSheets;
	
	@FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card'][4]")
	public WebElement applyLeave;
	
	@FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card'][5]")
	public WebElement myLeave;
	
	@FindBy (xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card'][6]")
	public WebElement myTimeSheet;
	
	
	

}
