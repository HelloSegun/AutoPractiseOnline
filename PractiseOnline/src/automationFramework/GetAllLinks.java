package automationFramework;

/*
 * Topic: Selenium - Find all Links
 * http://www.tutorialspoint.com/selenium/selenium_user_interactions.htm
 * http://www.tutorialspoint.com/selenium/selenium_find_all_links.htm
 */

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.seleniumhq.org/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links in the Page is " + links.size());
		
		for(int i = 0; i < links.size(); i = i+1) {
			System.out.println("Name of Link# " + i + "-" + links.get(i).getText());
		}

	}

}
