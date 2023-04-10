package testing;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.CommonMethods;
import util.Config;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class AdminTest extends CommonMethods {

	@Test(groups = { "all", "admin", "admin1" }, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void addUser() throws InterruptedException {

		doLogin();
		click(ap.AdminButton);
		click(ap.AddButton);
		click(ap.UserRoleDP);
		click(ap.SelectAdmin);
		sendText(ap.EmployeeNameBox, "Dom");
		wait(2);
		click(ap.DominicOption);
		click(ap.StatusDP);
		click(ap.SelectEnabled);
		sendText(ap.userNameEnterBox, randomUserName());
		sendText(ap.passwordInputBox, Config.getUserData("rpass"));
		sendText(ap.passwordReEnterInputBox, Config.getUserData("rpass"));
		wait(2);
		click(ap.saveUser);
		displayedAssertion(ap.successMessage);

	}

	@Test(groups = { "all", "admin", "admin2" }, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyDelete() throws InterruptedException {

		doLogin();
		click(ap.AdminButton);
		click(ap.uManagement);
		click(ap.userButton);
		click(ap.deleteButton);
		click(ap.yesDeleteButton);
		displayedAssertion(ap.successMessage);
	}

	@Test(groups = { "all", "admin", "admin3" }, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifySearchFunction() throws InterruptedException {

		doLogin();
		click(ap.AdminButton);
		sendText(ap.searchUserBox1, Config.getUserData("username"));
		click(ap.userRole1);
		click(ap.adminOption);
		click(ap.statusButton);
		click(ap.enabledOption);
		click(ap.searchButton1);
		waitForVisibility(ap.searchList1);
		if (ap.searchList1.getText().equalsIgnoreCase("admin")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
