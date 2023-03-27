package testing;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.ListernersTestNG;
import util.RetryAnalyzerTest;

@Listeners(ListernersTestNG.class)
public class OrderTrackingTest {
	
	
	@Test(enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void verifyValidOrderNumberAndEmailAddress() {
		
		
	}
	
	@Test(enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void invalidOrderNumberTracking() {
		
		
	}
	
	@Test(enabled = true, retryAnalyzer = RetryAnalyzerTest.class)
	public void trackingAGiftOrder() {
		
		
	}
	
	
}
