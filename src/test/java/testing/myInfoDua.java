package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import util.BaseClass;
import util.CommonMethods;
import util.Config;

public class myInfoDua extends CommonMethods {

	@Test
	public void VerifyJobDetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		hp.userNameBox.sendKeys(Config.getUserData("username"));
		hp.passwordBox.sendKeys(Config.getUserData("userpassword"));
		hp.loginButton.click();
		hp.myInfoButton.click();
		wait.until(ExpectedConditions.elementToBeClickable( mi.JDButton));
		mi.JDButton.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf( mi.JDJoinedDate));
		wait.until(ExpectedConditions.visibilityOf( mi.JDSubUnitText));
		wait.until(ExpectedConditions.elementToBeClickable( mi.JDSubUnitText));
		String subUnit = mi.JDSubUnitText.getText();
		String location = mi.JDLocationText.getText();
		Assert.assertEquals(Config.getUserData("SubUnit"), subUnit);
		Assert.assertEquals(Config.getUserData("Location"), location);
		wait.until(ExpectedConditions.elementToBeClickable( mi.JDIncludeDetailButton));
		mi.JDIncludeDetailButton.click();
		wait.until(ExpectedConditions.visibilityOf( mi.JDCheckForDD));

		
	}
	//@Test
	public void verifyInfoButtonFunctionality() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(getDriver(),30);
		hp.userNameBox.sendKeys(Config.getUserData("username"));
		hp.passwordBox.sendKeys(Config.getUserData("userpassword"));
		hp.loginButton.click();
		String dashBoardUrl = BaseClass.getDriver().getCurrentUrl();
		hp.myInfoButton.click();
		String myInfoUrl = BaseClass.getDriver().getCurrentUrl();
		String storedTextPersonal = mi.PersonalDetailsText.getText();
		Assert.assertEquals(Config.getUserData("myInfoPageDua"), storedTextPersonal);
		Assert.assertNotEquals(myInfoUrl, dashBoardUrl);
		
		
	}
	
	//@Test
	public void verifyEmergencyContactFunctionality() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),30);
		hp.userNameBox.sendKeys(Config.getUserData("username"));
		hp.passwordBox.sendKeys(Config.getUserData("userpassword"));
		hp.loginButton.click();
		hp.myInfoButton.click();
		mi.EmergencyContactsButton.click();
		wait.until(ExpectedConditions.visibilityOf( mi.EmergencyContactsButton));
		String i = mi.EmergencyRecordsText.getText();
		String numbers = i.replaceAll("[^0-20]", "");
		if(!numbers.isEmpty()) {
		int totalRecord = Integer.parseInt(numbers);
		System.out.println(totalRecord);
			List<WebElement> contacts = (List<WebElement>) mi.EmergencyContactsList;
		int count = contacts.size();
		System.out.println("Emergency contact" + count);
	Assert.assertEquals(totalRecord, count);
	}
		
		mi.AddEmergencyContactButton.click();
		mi.ECNameTextBox.sendKeys(Config.getUserData("Name"));
		mi.ECRelationshipTextBox.sendKeys(Config.getUserData("Relationship"));
		mi.ECHomeTelephoneTextBox.sendKeys(Config.getUserData("HomeTelephone"));
		mi.ECMobileTextBox.sendKeys(Config.getUserData("Mobile"));
		mi.ECWorkTelephoneTextBox.sendKeys(Config.getUserData("WorkTelephone"));
		mi.ECSaveButton.click();
		wait.until(ExpectedConditions.visibilityOf(mi.JDSuccessBox));
		wait.until(ExpectedConditions.elementToBeClickable(mi.ECEditBox));
		mi.ECEditBox.click();
		wait.until(ExpectedConditions.visibilityOf(mi.ECNameTextBox));
		//Thread.sleep(4000);
		mi.ECNameTextBox.sendKeys(Config.getUserData("UpdatedName"));
		wait.until(ExpectedConditions.elementToBeClickable(mi.ECSaveButton));
		mi.ECSaveButton.click();
		wait.until(ExpectedConditions.visibilityOf(mi.JDSuccessBox));
		wait.until(ExpectedConditions.elementToBeClickable(mi.ECDeleteBox));
		mi.ECDeleteBox.click();
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(mi.ECYesDeleteButton));
		mi.ECYesDeleteButton.click();
		wait.until(ExpectedConditions.visibilityOf(mi.JDSuccessBox));
		//Thread.sleep(4000);
	}
}
