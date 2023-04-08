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
public class MyInfoTest extends CommonMethods {

	@Test(enabled = true, groups = { "all", "allMyInfo", "myInfo1" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyifDependentsAreAddable() {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardurl"));
		clickFromMenu(hp.leftMenuList, "My Info");
		clickFromMenu(mip.MyInfoList, "Dependents");
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("myinfodependentsurl"));
		click(mip.assignDependentsAddButton);
		sendText(mip.assignDependentsNameBox, Config.getUserData("name"));
		click(mip.relationshipDropDown);
		click(mip.childOption);
		click(mip.dependentsSaveButton);
		click(mip.dependentsEditButton);
		assertIfListContainsElement(mip.dependentsList, Config.getUserData("name"));
	}

	@Test(enabled = true, groups = { "all", "allMyInfo", "myInfo2" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyifSuccessfulluSaveMessageIsFunctional() {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardurl"));
		clickFromMenu(hp.leftMenuList, "My Info");
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("myinfopersonalurl"));
		click(mip.genderButton);
		click(mip.saveButtonPersonal);
		displayedAssertion(mip.successfullySavedMessage);
	}

	@Test(enabled = true, groups = { "all", "allMyInfo", "myInfo3" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyIfEducationIsDeletable() {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardurl"));
		clickFromMenu(hp.leftMenuList, "My Info");
		clickFromMenu(mip.MyInfoList, "Qualifications");
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("myinfoqualificationurl"));
		click(mip.educationAddButton);
		click(mip.educationSelect);
		click(mip.mastersDegreeOption);
		click(mip.educationSaveButton);
		click(mip.educationAddButton);
		click(mip.educationDeleteButton);
		displayedAssertion(mip.deleteConfimation);
	}

}
