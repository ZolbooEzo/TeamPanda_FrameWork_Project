package testing;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.CommonMethods;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class LoginTest extends CommonMethods{

	@Test(retryAnalyzer = RetryAnalyzerTest.class)
	public void loginTestFunctionalityCheck() {
		hp.loginButton.click();
	}
	
	
}
