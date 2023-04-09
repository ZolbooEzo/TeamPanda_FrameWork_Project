package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static WebDriver driver;

	@BeforeMethod
	public static WebDriver getDriver() {
		if (driver == null) {
			String browser = Config.getRequiredData("browser");
			switch (browser) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "edge":
				if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
					throw new WebDriverException("Your OS doesn't support edge!");
				}
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			case "safari":
				if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
					throw new WebDriverException("You OS doesn't support safari!");
				}
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;

			default:
				throw new IllegalArgumentException("Please enter correct browser name");

			}

			driver.manage().window().maximize();
			driver.get(Config.getRequiredData("url"));
			PageInitializer.initializer();

		}

		return driver;

	}

	@AfterMethod
	public static void closeDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
