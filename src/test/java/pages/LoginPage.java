package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//input[@id='username']")
	public WebElement userNameBox;
	
	@FindBy (xpath = "//input[@id='password']")
	public WebElement userPasswordBox;
	
	@FindBy (xpath = "//button[@id='login']")
	public WebElement loginButton;
	
	
	
}
