package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
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
	public static void click(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element)).click();
    }

public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 7);
        return wait;
    }
	
}
