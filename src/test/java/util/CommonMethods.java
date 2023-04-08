package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

	public static void clickFromMenu(List<WebElement> l, String s) {
		getWaitObject().until(ExpectedConditions.visibilityOfAllElements(l));
		for (WebElement e : l) {
			if (e.getText().equalsIgnoreCase(s)) {
				click(e);
				break;
			}
		}

	}

	public static void wait(int Seconds) {
		try {
			Thread.sleep(Seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static WebDriverWait getWaitObject(){
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 15);
		return wait;
	}

	public static void click(WebElement e) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(e)).click();
	}

	public static void sendText(WebElement e, String s) {
		getWaitObject().until(ExpectedConditions.visibilityOf(e)).sendKeys(s);
	}

	public static void doLogin() {
		sendText(hp.userNameBox, Config.getUserData("username"));
		sendText(hp.passwordBox, Config.getUserData("userpassword"));
		click(hp.loginButton);
	}
	
	public static void assertIfListContainsElement(List <WebElement> list, String s) {
		List<String> l = new ArrayList<String>();
		for(WebElement e : list) {
			l.add(e.getText());
		}
		if(l.contains(s)) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	public static void displayedAssertion(WebElement e) {
		getWaitObject().until(ExpectedConditions.visibilityOf(e));
		Assert.assertTrue(e.isDisplayed());
	}
	
	public static void assertURL(String expected, String url) {
		wait(1);
		Assert.assertEquals(expected, url);
	}
	
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
	
	public static void assertText(List<WebElement> list, String s) {
		getWaitObject().until(ExpectedConditions.visibilityOfAllElements(list));
		for(WebElement e : list) {
			Assert.assertEquals(e.getText(), s);
		}
	}
}
