package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PercentageCalculator {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://www.calculator.net/percent-calculator.html");

		// PageObjectPercCalc testDr = new PageObjectPercCalc();
		// Percentage Calculator Test
		PageObjectPercCalc.percentageValue(driver).sendKeys("34");
		PageObjectPercCalc.calculatedValue(driver).sendKeys("200");
		PageObjectPercCalc.perCalButton(driver).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String result1 = PageObjectPercCalc.result(driver).getText();
		System.out.println("Percentage calculation test result is: " + result1);
		float ans10 = 34.0f / 100.0f * 200.0f;
		int ans1 = Math.round(ans10);
		if (result1.equals(String.valueOf(ans1))) {
			System.out.println("Pass" + ans1);
		} else {
			System.out.println("Fail");
		}

		// Percentage difference calculator test
		PageObjectPercCalc.valueOne(driver).sendKeys("23");
		PageObjectPercCalc.valueTwo(driver).sendKeys("40");
		PageObjectPercCalc.perDiffCalButton(driver).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String result2 = PageObjectPercCalc.result(driver).getText().substring(0, 8);
		System.out.println("Percentage difference calculation result is: " + result2);
		float ans20 = (23.0f - 40.0f) / ((23.0f + 40.0f) / 2.0f) * 100.0f;
		float ans2 = Math.abs(ans20);
		if (result2.equals(String.valueOf(ans2).substring(0, 8))) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Percentage Increase calculator test
		PageObjectPercCalc.perIncreValueOne(driver).sendKeys("45");
		PageObjectPercCalc.perIncreCalDropD(driver).selectByVisibleText("Increase");
		PageObjectPercCalc.perIncreValueTwo(driver).sendKeys("100");
		PageObjectPercCalc.perIncreCalButton(driver).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String result3 = PageObjectPercCalc.result(driver).getText();
		System.out.println("Percentage increase calculation result is: " + result3);
		int ans3 = 45 * (1 + (100 / 100));
		if (result3.equals(String.valueOf(ans3))) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.close();

	}

}
