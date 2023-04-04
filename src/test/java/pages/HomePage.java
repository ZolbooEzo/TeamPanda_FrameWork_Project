package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	

	@FindBy(xpath="//input[@name='username']")
	public WebElement usernameTextBox;
	
	@FindBy(xpath= "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(@class,orangehrm-login-button)]")
	public WebElement loginButton;
	
	
	
}
