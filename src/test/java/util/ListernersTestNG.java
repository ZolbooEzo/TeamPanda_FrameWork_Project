package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners(ListernersTestNG.class)
public class ListernersTestNG implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(">>>>>>>>>>Test Started<<<<<<<<<<");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(">>>>>>>>>>Test Passed<<<<<<<<<<");
		System.out.println("Name: ----" + result.getName() + " ---- Passed!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		CommonMethods.takeScreenshot(result.getName());
		System.out.println("Screen shot is captured!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
}
