package testing;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.CommonMethods;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class LoginTest extends CommonMethods{

	@Test(groups = {"all", "login"}, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void loginTestFunctionalityCheck() {
		doLogin();
		displayedAssertion(db.timeAtWork);
	}
	
	@Test(groups = {"all", "login"}, enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void tryLoginWithInvalidUserName() {
		doLogin("falseUserName", "falsePassword123");
		displayedAssertion(hp.invalidText);
	}
	
}
