package testing;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;

public class MyInfoDuaTest extends CommonMethods {

	@Test(enabled = true, groups = { "all", "allMyInfo", "myInfoDua1" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void VerifyJobDetails() throws InterruptedException {
		doLogin();
		click(mi.myInfoButton);
		click(mi.JDButton);
		wait(2);
		assertURL(mi.JDSubUnitText.getText(), Config.getUserData("SubUnit"));
		assertURL(mi.JDLocationText.getText(), Config.getUserData("Location"));
		click(mi.JDIncludeDetailButton);

	}

	@Test(enabled = true, groups = { "all", "allMyInfo", "myInfoDua2" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyInfoButtonFunctionality() throws InterruptedException {
		doLogin();
		Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardurl"));
		click(mi.myInfoButton);
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("myinfopersonalurl"));
		String storedTextPersonal = mi.PersonalDetailsText.getText();
		assertURL(storedTextPersonal, Config.getUserData("myInfoPageDua"));
	}

	@Test(enabled = true, groups = { "all", "allMyInfo", "myInfoDua3" }, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyEmergencyContactFunctionality() throws InterruptedException {
		doLogin();
		click(mi.myInfoButton);
		click(mi.EmergencyContactsButton);
		waitForVisibility(mi.EmergencyRecordsText);
		
		String i = mi.EmergencyRecordsText.getText();
		String numbers = i.replaceAll("[^0-20]", "");
		
		if (!numbers.isEmpty()) {
			int totalRecord = Integer.parseInt(numbers);
			System.out.println(totalRecord);
			List<WebElement> contacts = (List<WebElement>) mi.EmergencyContactsList;
			int count = contacts.size();
			System.out.println("Emergency contact" + count);
			Assert.assertEquals(totalRecord, count);
		}

		click(mi.AddEmergencyContactButton);
		sendText(mi.ECNameTextBox, Config.getUserData("Name"));
		sendText(mi.ECRelationshipTextBox, Config.getUserData("Relationship"));
		sendText(mi.ECHomeTelephoneTextBox, Config.getUserData("HomeTelephone"));
		sendText(mi.ECMobileTextBox, Config.getUserData("Mobile"));
		sendText(mi.ECWorkTelephoneTextBox, Config.getUserData("WorkTelephone"));
		click(mi.ECSaveButton);
		click(mi.ECEditBox);
		sendText(mi.ECNameTextBox, Config.getUserData("UpdatedName"));
		click(mi.ECSaveButton);
		click(mi.ECDeleteBox);
		click(mi.ECYesDeleteButton);
	}

}
