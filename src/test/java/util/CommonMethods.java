package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	}
	
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.implicit_time);
		return wait;
	}
	
	public static void click(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public static void sendText(WebElement element, String txt) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element)).clear();
		element.sendKeys(txt);
	}
	
	public static void clickFromOptions(List <WebElement> list, String name) {
		
		for(WebElement e : list) {
			if(e.getText().equals(name)) {
				click(e);
				break;
			}
		}
	}
	
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		return js;
	}
	
	public static void scrollToElement(WebElement e) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true)", e);
	}
	
	public static void scrollDown(int value) {
		getJSObject().executeScript("window.scrollBy(0, "+value+")");
	}
	
	public static void wait(int sec) {
		try {
			Thread.sleep(sec * 1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doLogin() {
		sendText(lp.userNameBox, Config.getUserData("username"));
		sendText(lp.userPasswordBox, Config.getUserData("userpassword"));
		click(lp.loginButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
