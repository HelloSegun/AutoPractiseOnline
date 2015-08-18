package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class PageObjectPercCalc {

	private static WebElement element = null;
	private static Select dropdown = null;

	/*
	 * Text box elements section
	 */
	// The percentage value
	public static WebElement percentageValue(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input#cpar1[type=text][name=cpar1]"));
		return element;
	}

	// The calculated value
	public static WebElement calculatedValue(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input#cpar2[type=text][name=cpar2]"));
		return element;
	}

	// The result of the percentage value
	public static WebElement resultValue(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input#cpar3[type=text][name=cpar3]"));
		return element;
	}

	// First Percentage difference value to be calculated
	public static WebElement valueOne(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input.bigtext[type=text][name=c3par1]"));
		return element;
	}

	// Second Percentage difference value to be calculated
	public static WebElement valueTwo(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input.bigtext[type=text][name=c3par2]"));
		return element;
	}

	// First percentage increase value to be calculated
	public static WebElement perIncreValueOne(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input.bigtext[type=text][name=c2par1]"));
		return element;
	}

	// Second percentage increase value to be calculated
	public static WebElement perIncreValueTwo(WebDriver driver) {

		element = driver.findElement(By.cssSelector("input.bigtext[type=text][name=c2par2]"));
		return element;
	}

	/*
	 * Action buttons section
	 */
	// Percentage calculator button
	public static WebElement perCalButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
		return element;
	}

	// Percentage difference calculator button
	public static WebElement perDiffCalButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='content']/table[2]/tbody/tr[3]/td/input[2]"));
		return element;
	}

	// Percentage Increase calculator button
	public static WebElement perIncreCalButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='content']/table[3]/tbody/tr[2]/td/input[2]"));
		return element;
	}

	/*
	 * Actions dropdown selection
	 */
	// Percentage Increase calculator - increase or decrease dropdown
	public static Select perIncreCalDropD(WebDriver driver) {
		dropdown = new Select(driver.findElement(By.cssSelector("select.bigtext[name=c2type]")));
		// dropdown.selectByValue("");
		return dropdown;
	}

	/*
	 * Results
	 */

	// Percentage Calculator results
	public static WebElement result(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div#content font[color=green]"));
		return element;
	}

	/*
	 * //Percentage Calculator results public static WebElement
	 * perCalResult(WebDriver driver) {
	 * 
	 * element = driver.findElement(By.cssSelector("div#content p#verybigtext"
	 * )); return element; }
	 */
}
