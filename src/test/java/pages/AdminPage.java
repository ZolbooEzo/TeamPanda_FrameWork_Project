package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class AdminPage {
	
	public AdminPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper'][1]")
	public WebElement AdminButton;

	@FindBy(xpath = "//div[@class='oxd-select-text--after'][1]")
	public WebElement UserRoleDP;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement EmployeeNameBox;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement AddButton;

	@FindBy(xpath = "//div[@class='oxd-select-option'][2]")
	public WebElement SelectAdmin;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]/div[2]")
	public WebElement StatusDP;

	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input--after']")
	public WebElement SelectDominic;

	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[2]")
	public WebElement SelectEnabled;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active'][2]")
	public WebElement UserNameTextBox;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active'][3]")
	public WebElement PasswordTextBox;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active'][4]")
	public WebElement ConfirmPasswordTextBox;

	@FindBy(xpath = "//li[@class='--active oxd-topbar-body-nav-tab --parent --visited']")
	public WebElement UserMgmt;

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']")
	public WebElement SelectUser;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'][2])")
	public WebElement enterUsername;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement SelectUserRole;

	@FindBy(xpath = "//div[@class='oxd-select-option'][2]")
	public WebElement SelectAdminUM;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement enterEmployeeName;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	public WebElement selectStatus;

	@FindBy(xpath = "//div[@class='oxd-select-option'][2]")
	public WebElement selectEnabled;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']/div[2]/div[1]")
	public WebElement DominicOption;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement userNameEnterBox;
	
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]/div[2]/input")
	public WebElement passwordInputBox;		
	
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]/div[2]/input")
	public WebElement passwordReEnterInputBox;		
			
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement saveUser;			
	
	@FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
	public WebElement successMessage;	
	
	@FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[1]")
	public WebElement uManagement;
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a")
	public WebElement userButton;
	
	@FindBy(xpath = "(//div[@class='oxd-table-body']/div/div/div[6]/div)[10]/button[1]")
	public WebElement deleteButton;		
			
	@FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]")
	public WebElement yesDeleteButton;			
			
	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div/div/div[2]/input")
	public WebElement searchUserBox1;		
			
	@FindBy(xpath = "(//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div/div)[2]/div[2]/div/div")
	public WebElement userRole1;		
			
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[2]")
	public WebElement adminOption;		
			
	@FindBy(xpath = "(//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div/div)[4]/div[2]/div/div")
	public WebElement statusButton;		
			
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/div[2]")
	public WebElement enabledOption;
	
	@FindBy(xpath = "//div[@class='oxd-form-actions']/button[2]")
	public WebElement searchButton1;
	
	@FindBy(xpath = "//div[@class='oxd-table-card']/div/div[2]")
	public WebElement searchList1;
	
	
}
