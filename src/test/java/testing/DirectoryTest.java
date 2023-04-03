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
public class DirectoryTest extends CommonMethods{

	@Test(groups = {"all", "test1"}, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyUserInformationByJobTitleAndLocation() throws InterruptedException {
		doLogin();
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardurl"));
		clickFromMenu(hp.leftMenuList, "Directory");
		click(dp.jobTitleDrop);
		click(dp.hrManagerOption);
		click(dp.locationDrop);
		click(dp.texasRDOption);
		click(dp.searchButton);
		assertText(dp.employeesJobTitles, "HR Manager");
		assertText(dp.employeesLocation, "Texas R&D");
	}
	
	@Test(groups = {"all", "test2"}, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyNumberOfEmployeesByRecordShown() {
		doLogin();
		clickFromMenu(hp.leftMenuList, "Directory");
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("directoryurl"));
		click(dp.locationDrop);
		click(dp.texasRDOption);
		click(dp.searchButton);
		wait(2);
		Assert.assertEquals(numberOfEmployees(dp.recordsFoundText), dp.EmployeesList.size());
		
	}
	
	@Test(groups = {"all", "test3"}, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyUserInformationByClickingOnIt() {
		doLogin();
		clickFromMenu(hp.leftMenuList, "Directory");
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("directoryurl"));
		click(dp.firstEmployeeOnTheList);
		Assert.assertTrue(dp.firstEmployeeOnTheList.getText().contains(dp.firstEmployeeName.getText()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
