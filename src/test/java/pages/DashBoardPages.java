package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;
import util.CommonMethods;

public class DashBoardPages {
	
public DashBoardPages() {
	PageFactory.initElements(BaseClass.getDriver(), this);
}

//
//@FindBy (xpath="")
//public WebElement DashBoardBttn;
//
//
//@FindBy (xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")
//public WebElement TimeWorkCard;
//
//
//@FindBy (xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div/p")
//public WebElement MyActionsCard;
//
//
//@FindBy (xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div[1]/div/p")
//public WebElement QuickLaunchCard;


@FindBy (xpath="//li[@class='oxd-main-menu-item-wrapper']")
public List<WebElement> allMenu;


public void menu () {
	
CommonMethods.clickListOfWebElements(allMenu, "Dashboard");
}



}
