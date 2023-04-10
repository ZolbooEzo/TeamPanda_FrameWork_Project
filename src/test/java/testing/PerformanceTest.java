package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;
import util.Config;

public class PerformanceTest extends CommonMethods{
	
	@Test
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
	
	@Test
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
	
	@Test
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
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("addcomment"));
	}
	
	
	
	
	
	
	
	
	
	
}
