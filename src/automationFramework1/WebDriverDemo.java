package automationFramework1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public WebDriverDemo() {

	}

	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverDemo TestDr = new WebDriverDemo();

		// open firefox browser
		TestDr.openFirefoxBrowser();
		// 10 seconds wait before throwing an exception
		TestDr.waitToLoad();
		// Deleting all browser cookies
		TestDr.deleteAllCookie();
		// Launch website
		TestDr.navigateTo("http://www.seleniumhq.org");
		// Maximize the browser
		TestDr.maxBrowser();
		// Send keys to textbox
		TestDr.sendKeys("Support");
		// Submit text box keys to search
		TestDr.clickSubmit();
		// returns boolean for browser title
		TestDr.compareBrowserTitle("Google Custom Search");
		// get the value in the search box of the new page
		TestDr.testValue();
		// navigate back to the previous screen
		TestDr.navigateBack();
		// 10 seconds wait before throwing an exception
		// Close browser
		TestDr.CloseBrowser();
		// driver.quit();

	}

	public void waitToLoad() {
		// 10 seconds wait before throwing an exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void openFirefoxBrowser() {
		// open firefox browser
		this.driver = new FirefoxDriver();
	}

	public void CloseBrowser() {
		// Close browser
		driver.close();
	}

	public void navigateBack() {
		// navigate back to the previous screen
		driver.navigate().back();
	}

	public void testValue() {
		// get the value in the search box of the new page
		String result;
		result = driver.findElement(By.cssSelector("#gsc-i-id1")).getAttribute("value");
		System.out.println("The text in the search box is: " + result);
	}

	public void compareBrowserTitle(String title) {
		// returns boolean for browser title
		int result;
		result = driver.getTitle().compareToIgnoreCase(title);

		if (result != 0) {
			System.out
					.println("Expected browser title: " + title + "," + " Actual browser title: " + driver.getTitle());
		}

	}

	// Deleting all browser cookies
	public void deleteAllCookie() {
		driver.manage().deleteAllCookies();
	}

	public void navigateTo(String url) {
		// Launch website
		// url = "http://www.seleniumhq.org";
		driver.navigate().to(url);
	}

	public void maxBrowser() {
		// Maximize the browser
		driver.manage().window().maximize();
	}

	public void sendKeys(String keys) {
		// Send keys to textbox
		// keys = "Support";
		driver.findElement(By.cssSelector("#q[type='text'][name='q']")).sendKeys(keys);
	}

	public void clickSubmit() {
		// Submit text box keys to search
		driver.findElement(By.cssSelector("#submit")).click();
	}

	/*
	 * public void foo() { driver.findElement(By.id("ggas")).click(); }
	 */

}
