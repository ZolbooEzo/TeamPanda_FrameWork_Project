package testing;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.CommonMethods;
import util.Config;
import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class OrderTrackingTest extends CommonMethods{
	
	
	@Test(enabled = false, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyValidOrderNumberAndEmailAddress() {
		
		
	}
	
	@Test(enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void invalidOrderNumberTracking() {
		scrollDown(9000);
		click(hp.trackOrderLink);
		sendText(lp.userNameBox, Config.getUserData("username"));
		wait(1);
		sendText(lp.userPasswordBox, Config.getUserData("userpassword"));
		wait(5);
		click(lp.loginButton);
//		doLogin();
		wait(5);
	}
	
	@Test(enabled = false, retryAnalyzer = RetryAnalyzerTest.class)
	public void trackingAGiftOrder() {
		
		
	}
	//hello
	
	
}
