package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods extends PageInitializer{

	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}

	public static byte[] takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();

		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
		File file = ts.getScreenshotAs(OutputType.FILE);

		String destinationFile = Constants.screenshotFilePath + fileName + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Can't take screen shot!");
		}

		return picBytes;

		
	} // login
	public static void Login() {
		
		hp.usernameTextBox.clear();
		hp.usernameTextBox.sendKeys(Config.getUserData("username"));
		
		hp.password.clear();
		hp.password.sendKeys(Config.getUserData("password"));
		hp.loginButton.click();;
		
	}
	
//	// this method gets explicit wait object
//
//		private static void click(WebElement loginButton) {
//		// TODO Auto-generated method stub
		
//	}

		public static WebDriverWait getWaitObject() {
			WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 15);
			return wait;
		}
		
		// this is explicit wait waiting for element to be visible
		
		public static void waitForVisibility(WebElement e) {
			getWaitObject().until(ExpectedConditions.visibilityOf(e));
		}
		
		public static void clickListOfWebElements(List<WebElement> list, String element) {            
            for (WebElement listOfElements : list) {            
                if (listOfElements.getText().contains(element)) {        
                    listOfElements.click();
                    break;
                }
            }        
        }
	
	
}
