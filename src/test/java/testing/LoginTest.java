package testing;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.CommonMethods;
import util.Config;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)

public class LoginTest extends CommonMethods{

	@Test(retryAnalyzer = RetryAnalyzerTest.class)
	public void loginTestFunctionalityCheck() throws InterruptedException {
		
		hp.userNameBox.sendKeys(Config.getUserData("username"));

		hp.passwordBox.sendKeys(Config.getUserData("userpassword"));
			
		hp.loginButton.click();
		

		Thread.sleep(6000);
	
		}
}
