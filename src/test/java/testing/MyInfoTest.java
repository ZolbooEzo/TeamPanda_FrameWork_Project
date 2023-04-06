package testing;

import org.testng.annotations.Test;

import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;

public class MyInfoTest extends CommonMethods{

	@Test(enabled = true, groups = {"all", "allMyInfo", "myInfo1"}, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyifDependentsAreAddable() {
		doLogin();
		clickFromMenu(hp.leftMenuList, "My Info");
		clickFromMenu(mip.MyInfoList, "Dependents");
		click(mip.assignDependentsAddButton);
		sendText(mip.assignDependentsNameBox, Config.getUserData("name"));
		click(mip.relationshipDropDown);
		click(mip.childOption);
		click(mip.dependentsSaveButton);
		click(mip.dependentsEditButton);
		assertIfListContainsElement(mip.dependentsList, Config.getUserData("name"));
	}
	
	@Test(enabled = true, groups = {"all", "allMyInfo", "myInfo2"}, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyifSuccessfulluSaveMessageIsFunctional() {
		doLogin();
		clickFromMenu(hp.leftMenuList, "My Info");
		click(mip.genderButton);
		click(mip.saveButtonPersonal);
		displayedAssertion(mip.successfullySavedMessage);
	}
	
	@Test(enabled = true, groups = {"all", "allMyInfo", "myInfo3"}, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyIfEducationIsDeletable() {
		doLogin();
		clickFromMenu(hp.leftMenuList, "My Info");
		clickFromMenu(mip.MyInfoList, "Qualifications");
		click(mip.educationAddButton);
		click(mip.educationSelect);
		click(mip.mastersDegreeOption);
		click(mip.educationSaveButton);
		click(mip.educationAddButton);
		click(mip.educationDeleteButton);
		displayedAssertion(mip.deleteConfimation);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
