package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//input[@name='username']")
	public WebElement userNameBox;
	
	@FindBy (xpath = "//input[@name='password']")
	public WebElement passwordBox;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginButton;
	
	@FindBy (xpath = "//ul[@class='oxd-main-menu']/li/a")
	public List <WebElement> leftMenuList;
	
	@FindBy (xpath = "//ul[@class='oxd-main-menu']/li[9]")
	public WebElement dashboardLink;
	
	
	
}
