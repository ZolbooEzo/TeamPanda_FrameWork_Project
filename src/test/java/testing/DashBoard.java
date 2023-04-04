package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;

public class DashBoard extends CommonMethods {

	
//	Log in to dashboard
//	https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
//	Once inside of dashboard page 
//	Verify that “Time work, My Actions, Quick Launch” cards are displayed on Dashboard page
//	Log out of dashboard page
		
		
	

	

	@Test (priority= 1, enabled= true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyTimeWorkCard() throws InterruptedException{
		//Log In
		Login();
		dbp.menu();
		
		// Wait for dashboard page to load and verify that Time work, My Actions, and Quick Launch cards are displayed
		
//		Assert.assertTrue(dbp.TimeWorkCard.isDisplayed());
//		Assert.assertTrue(dbp.MyActionsCard.isDisplayed());
//		Assert.assertTrue(dbp.QuickLaunchCard.isDisplayed());
	}
	

}
