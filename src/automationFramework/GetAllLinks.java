package automationFramework;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		// driver.navigate().to("https://cs-uat2.interoute.com/");
		driver.get("https://cs-uat2.interoute.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of the Links in the Page is " + links.size());

		for (int i = 0; i < links.size(); i = i + 1) {
			System.out.println("Name of Link# " + i + " - " + links.get(i).getText());
		}

		driver.close();

	}

}
