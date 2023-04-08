package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class MyInfoPageDua {
	
	public MyInfoPageDua() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//li[@class='oxd-main-menu-item-wrapper'][6]")
	public WebElement myInfoButton;
	
	@FindBy (xpath = "//div[@class='orangehrm-tabs']/div")
    public List <WebElement> MyInfoList;
	
	@FindBy (xpath = "//div[@class='orangehrm-tabs-wrapper'][6]")
	public WebElement JDButton;

	@FindBy (xpath = "//div[@class='orangehrm-edit-employee-content']/div/h6")
	public WebElement PersonalDetailsText;
	
	@FindBy (xpath = "//div[@role='tablist']/div[3]")
	public WebElement EmergencyContactsButton;

	@FindBy (xpath = "(//div[@class='orangehrm-action-header']/button)[1]")
	public WebElement AddEmergencyContactButton;

	@FindBy (xpath = "(//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span)[1]")
	public WebElement EmergencyRecordsText;

	@FindBy (xpath = "//div[@class='oxd-table-card-cell-checkbox']/div/label/input")
	public List<WebElement> EmergencyContactsList;
	
	@FindBy (xpath = "(//div[@class='oxd-form-row'])[1]/div/div[1]/div/div[2]/input")
	public WebElement ECNameTextBox;
	
	@FindBy (xpath = "(//div[@class='oxd-form-row'])[1]/div/div[2]/div/div[2]/input")
	public WebElement ECRelationshipTextBox;

	@FindBy (xpath = "(//div[@class='oxd-form-row'])[2]/div/div[1]/div/div[2]/input")
	public WebElement ECHomeTelephoneTextBox;

	@FindBy (xpath = "(//div[@class='oxd-form-row'])[2]/div/div[2]/div/div[2]/input")
	public WebElement ECMobileTextBox;

	@FindBy (xpath = "(//div[@class='oxd-form-row'])[2]/div/div[3]/div/div[2]/input")
	public WebElement ECWorkTelephoneTextBox;
	
	@FindBy (xpath = "//div[@class='oxd-form-actions']/button[@type='submit']")
	public WebElement ECSaveButton;
			
	@FindBy (xpath = "(//div[@class=\"oxd-table-cell-actions\"]/button)[2]")
	public WebElement ECEditBox;

	@FindBy (xpath = "(//div[@class=\"oxd-table-cell-actions\"]/button)[1]")
	public WebElement ECDeleteBox;
			
	@FindBy (xpath = "(//div[@class=\"orangehrm-modal-footer\"]/button)[2]")
	public WebElement ECYesDeleteButton;		
	
	@FindBy (xpath = "//div[@class='oxd-switch-wrapper']/label/span")
	public WebElement JDIncludeDetailButton;
	
	@FindBy (xpath = "//div[@class=\"oxd-input-group__label-wrapper\"]/label[contains(text(),'Contract Start Date')]")
	public WebElement JDCheckForDD;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text-input'])[3]")
	public WebElement JDSubUnitText;
	
	@FindBy (xpath = "(//div[@class='oxd-select-text-input'])[4]")
	public WebElement JDLocationText;
	
	@FindBy (xpath = "//div[@class='oxd-toast-start']")
	public WebElement JDSuccessBox;
	
	@FindBy (xpath = "(//div[@class='oxd-input-group__label-wrapper'])[1]")
	public WebElement JDJoinedDate;
	
}
