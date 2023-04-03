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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CommonMethods extends PageInitializer {

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
	
	// this method clicks on button whatever that is clickable

	public static void click(WebElement e) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(e)).click();
	}
	
	// this method also clicks but you need a list so it can iterate through the elements using if condition and click

	public static void clickFromMenu(List<WebElement> l, String s) {
		getWaitObject().until(ExpectedConditions.visibilityOfAllElements(l));
		for (WebElement e : l) {
			if (e.getText().equalsIgnoreCase(s)) {
				click(e);
				break;
			}
		}

	}
	
	// this method gets explicit wait object

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 15);
		return wait;
	}
	
	// this is explicit wait waiting for element to be visible
	
	public static void waitForVisibility(WebElement e) {
		getWaitObject().until(ExpectedConditions.visibilityOf(e));
	}
	
	// this method send waits for element to be visible and once its visible it will send text

	public static void sendText(WebElement element, String s) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element)).sendKeys(s);
	}
	
	// this is just thread.sleep

	public static void wait(int Seconds) {
		try {
			Thread.sleep(Seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// this method does the login functionality

	public static void doLogin() {
		getWaitObject().until(ExpectedConditions.visibilityOf(hp.userNameBox)).clear();
		hp.userNameBox.sendKeys(Config.getUserData("username"));
		getWaitObject().until(ExpectedConditions.visibilityOf(hp.passwordBox)).clear();
		hp.passwordBox.sendKeys(Config.getUserData("userpassword"));
		click(hp.loginButton);
		assertURL(BaseClass.getDriver().getCurrentUrl(), Config.getRequiredData("dashboardurl"));
	}
	
	// this method asserts url compares expected url with actual url

	public static void assertURL(String expected, String url) {
		Assert.assertEquals(expected, url);
	}
	
	// this is a select, it selects option from drop down

	public static void select(WebElement element, String s) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement o : options) {
				if (o.getText().equalsIgnoreCase(s)) {
					select.selectByVisibleText(s);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// this methods assert text if element text is equal to one where given    which is String s
	
	public static void assertText(List<WebElement> list, String s) {
		getWaitObject().until(ExpectedConditions.visibilityOfAllElements(list));
		for(WebElement e : list) {
			Assert.assertEquals(e.getText(), s);
		}
	}
	
	
	
	// this method will catch how many employees are the when it appears (47) records have found it only catches 47
	
	public static int numberOfEmployees(WebElement e) {
		String s = e.getText();
		char[] chars = s.toCharArray();
		String letter = "";
		String num = "";
		String special = "";
		for(char i : chars) {
			if(Character.isAlphabetic(i)) {
				letter += i;
			}
			if(Character.isDigit(i)) {
				num += i;
			}
			if(!Character.isAlphabetic(i) && !Character.isDigit(i)) {
				special += i;
			}
		}
		int last = Integer.parseInt(num);
		return last;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
