package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;




public class DashBoardTest extends CommonMethods {
	
 @Test(groups= {"all","test1"}, enabled = true, retryAnalyzer= RetryAnalyzerTest.class)
	public void DashBoard() throws InterruptedException {
	 
		//Log in to dashboard
		db.userNameBox.sendKeys(Config.getUserData("username"));
		db.passwordBox.sendKeys(Config.getUserData("userpassword"));
		db.loginButton.click();
		//https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("dashboardUrl"));
		
		//Verify that “Time work, My Actions, Quick Launch” cards are displayed on Dashboard page
		Assert.assertTrue(db.myActions.isDisplayed());
		Assert.assertTrue(db.timeAtWork.isDisplayed());
		Assert.assertTrue(db.quickLaunch.isDisplayed());
		
		Thread.sleep(3000);
		
	
	}

	@Test(groups= {"all","test2"}, enabled = true, retryAnalyzer= RetryAnalyzerTest.class)
	
	public void LeaveIcon() throws InterruptedException {
	
//		Log in to dashboard
		db.userNameBox.sendKeys(Config.getUserData("username"));
		db.passwordBox.sendKeys(Config.getUserData("userpassword"));
	    click(db.loginButton);
	    
//		https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
	    Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("dashboardUrl"));
	    
//		Enable the “Only show accessible employees on leave for other users” by clicking the switch interaction.
		click(db.switchBttn);
		
//		Click on “employee on leave” icon card and check if the switch label is displaying on screen.
		click(db.switchTab);
		
//		Click on the save icon inside its label.
		click(db.saveButtn);
		
//		Click again  “employee on leave” icon card and check if the switch label is displaying the switch as enable.
		click(db.switchBttn);
	
		Thread.sleep(3000);
		
		
	}



	
		
	
@Test(groups= {"all","test3"}, enabled = true, retryAnalyzer= RetryAnalyzerTest.class)
	public void QuickLaunchFunctions() throws InterruptedException {
	
//		Log in to dashboard
//		https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		db.userNameBox.sendKeys(Config.getUserData("username"));
		db.passwordBox.sendKeys(Config.getUserData("userpassword"));
		db.loginButton.click();
//		Once inside of dashboard page 
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("dashboardUrl"));
		
//		Click on “Assign Leave” which will redirect you to https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave
//			assert the url and then navigate back to the dashboard pagehttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
	
		db.assingLeave.click();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("assingLeaveURL"));
		Thread.sleep(1000);
		BaseClass.getDriver().navigate().back();
		
		
//		Click on “Leave List” which will redirect you to  https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList 
//		assert the url and then navigate back to the dashboard pagehttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		db.leaveList.click();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("leaveListURL"));
		Thread.sleep(1000);
		BaseClass.getDriver().navigate().back();
	
		
//		Click on “Time Sheets” which will redirect you to https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet
//		assert the url and then navigate back to the dashboard pagehttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		db.timeSheets.click();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("timeSheets"));
		Thread.sleep(1000);
		BaseClass.getDriver().navigate().back();
		
		
//		Click on “Apply Leave” which will redirect you to https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave
//		assert the url and then navigate back to the dashboard pagehttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		db.applyLeave.click();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("applyLeave"));
		Thread.sleep(1000);
		BaseClass.getDriver().navigate().back();
		
		
//		Click on “My Leave ” which will redirect you to  https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList 
//		assert the url and then navigate back to the dashboard pagehttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		db.myLeave.click();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("myLeave"));
		Thread.sleep(1000);
		BaseClass.getDriver().navigate().back();
		
		
//		Click on “My Time Sheet” which will redirect you to https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave
//		assert the url and then navigate back to the dashboard pagehttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		db.myTimeSheet.click();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(),Config.getRequiredData("timeSheet"));
		Thread.sleep(1000);
		BaseClass.getDriver().navigate().back();
	
	
	
	
		Thread.sleep(3000);

	}

}
