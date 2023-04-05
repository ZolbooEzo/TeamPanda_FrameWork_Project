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
			
			
			
			
			
			
			
}
