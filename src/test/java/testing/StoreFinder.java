package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.BaseClass;
import util.CommonMethods;
import util.Config;
import util.RetryAnalyzerTest;

public class StoreFinder extends CommonMethods{

	
	@Test (priority= 1, enabled= true, retryAnalyzer = RetryAnalyzerTest.class)
	public void StoreFinderZipcode () {
//	Open web browser 
		
//	Go to Target : Expect More. Pay Less. 
		
//	Verify if user is on home page by url
		Assert.assertTrue(sfp.SignInBtn.isDisplayed()); //makes sure this function is true
		
//	Go to menu bar the top of page and click “Find Stores”
		sfp.FindStoreBtn.click(); 
	Assert.assertTrue(sfp.ZipCodeBtn.isDisplayed());
		
		
		
//	Click on  “enter zip or city, state” on the center top of page
		sfp.ZipCodeBtn.click();
//	Click on text box “Zip Code ” and type “43016”. Then Click “Find store”
		sfp.InputZipBtn.sendKeys(Config.getUserData(("zipcode")));
		sfp.FSBtn.click();
		 
		
		
	}

}
