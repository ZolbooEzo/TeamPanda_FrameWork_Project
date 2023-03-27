package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class store_finderPage {
	
	public store_finderPage () {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	//Karen
	@FindBy (xpath="//span[@class='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']") // web elemnt to sign button
	public WebElement SignInBtn;
	
	@FindBy (xpath= "//a [@id=\"utilityNav-findStores\"]")
	public WebElement FindStoreBtn;
	
	@FindBy (xpath = "//button[normalize-space()='enter zip or city, state']")
	public WebElement ZipCodeBtn;
	
   @FindBy (xpath = "//input[@id=\"zipcode\"]")
    public WebElement InputZipBtn;
   
   @FindBy (xpath = "//button[normalize-space()='find store']")
   public WebElement FSBtn;

}
