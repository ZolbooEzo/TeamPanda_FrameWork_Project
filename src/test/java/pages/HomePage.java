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
	
	
	@FindBy (xpath = "//div[@id='footer']/div/div[2]/a")
	public List <WebElement> helpOptionsFooter;
	
	@FindBy (xpath = "//div[@id='footer']/div/div[2]/a[3]")
	public WebElement trackOrderLink;
	
	
}
