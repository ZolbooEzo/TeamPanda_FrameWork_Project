package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;

public class DashBoardTest extends CommonMethods {

	@Test(groups = { "all", "dashboard", "dashboard1" }, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void DashBoard() throws InterruptedException {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardUrl"));
		displayedAssertion(db.myActions);
		displayedAssertion(db.timeAtWork);
		displayedAssertion(db.quickLaunch);
	}

	@Test(groups = { "all", "dashboard", "dashboard2" }, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void LeaveIcon() throws InterruptedException {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardUrl"));
		click(db.switchBttn);
		click(db.switchTab);
		click(db.saveButtn);
		click(db.switchBttn);
	}

	@Test(groups = { "all", "dashboard", "dashboard3" }, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void QuickLaunchFunctions() throws InterruptedException {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardUrl"));
		click(db.assingLeave);
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("assingLeaveURL"));
		wait(1);
		BaseClass.getDriver().navigate().back();
		click(db.leaveList);
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("leaveListURL"));
		wait(1);
		BaseClass.getDriver().navigate().back();
		
		click(db.timeSheets);
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("timeSheets"));
		wait(1);
		BaseClass.getDriver().navigate().back();
		
		click(db.applyLeave);
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("applyLeave"));
		wait(1);
		BaseClass.getDriver().navigate().back();
		click(db.myLeave);
		
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("myLeave"));
		wait(1);
		BaseClass.getDriver().navigate().back();
		click(db.myTimeSheet);
		
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("timeSheet"));
		wait(1);
		BaseClass.getDriver().navigate().back();
	}

}
