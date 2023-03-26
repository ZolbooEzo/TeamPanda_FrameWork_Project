package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "yueiwq//*[@class='styles__FlexColumn-sc-cdaur3-0 eHxtnK']/div/div/a")
	public WebElement loginButton;
	
	
	
}
