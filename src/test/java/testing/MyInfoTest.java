package testing;

import org.testng.annotations.Test;

import util.CommonMethods;

public class MyInfoTest extends CommonMethods{

	@Test
	public void verifyifDependentsAreAddable() {
		doLogin();
		clickFromMenu(hp.leftMenuList, "My Info");
		clickFromMenu(dp.MyInfoList, "Dependents");
		click(dp.assignDependentsAddButton);
		sendText(dp.assignDependentsNameBox, "abc");
		click(dp.relationshipDropDown);
		click(dp.childOption);
		click(dp.dependentsSaveButton);
		click(dp.dependentsEditButton);
	}
	
//	@Test
	public void verifyifDriversLicenseSsnNumberIsDisplayed() {
		
	}
	
//	@Test
	public void verifyIfEducationIsDeletable() {
		
	}
	
}
