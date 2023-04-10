package testing;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class PerformanceTest extends CommonMethods {

	@Test(enabled = false, groups = { "all", "performance", "performance1" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyThePerformanceMenuIsWorking() {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardUrl"));
		click(perp.performanceButton);
		click(perp.configureButton);
		click(perp.trackerOption);
		waitForVisibility(perp.records);
		wait(1);
		Assert.assertEquals(numberOfEmployees(perp.records), perp.numberOfEmployees.size());
		click(perp.manageReviews);
		click(perp.manageReviewsOption);
		waitForVisibility(perp.noRecords);
		Assert.assertTrue(perp.noRecords.isDisplayed());
	}

	@Test(enabled = false, groups = { "all", "performance", "performance2" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void toVerifyTheSearchingOptionByNameIsWorking() {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardUrl"));
		click(perp.performanceButton);
		click(perp.configureButton);
		click(perp.trackerOption);
		sendText(perp.hintInputBox, "C");
		click(perp.Charlie);
		click(perp.searchButton);
		wait(2);
		Assert.assertEquals(perp.charlieText.getText(), "Charlie Carter");
	}

	@Test(enabled = true, groups = { "all", "performance", "performance3" })
	public void toVerifyTheAddTrackersLogIsWorking() {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardUrl"));
		click(perp.performanceButton);
		click(perp.employeeTrackers);
		click(perp.alia);
		click(perp.addLog);
		sendText(perp.logInputBox, "Nice work!");
		sendText(perp.comment, "great!");
		click(perp.saveComment);
		wait(2);
		displayedAssertion(perp.sMessage);
	}

}
