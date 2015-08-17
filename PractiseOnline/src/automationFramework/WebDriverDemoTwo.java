package automationFramework;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;

public class WebDriverDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.jobserve.co.uk/gb/en/find-jobs-in-united-kingdom/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("li#mnuJobSearch a[href='/gb/en/JobSearch.aspx']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle().compareToIgnoreCase("Find Jobs with JobServe.com");
		String overlayTitle  = driver.findElement(By.cssSelector("div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.dialogblue.dialogTop.searchPopupDialog.DialogOnTop.ui-draggable[role='dialog'] span#ui-id-4")).getText();
		int result = overlayTitle.compareTo("Job Search");
		if (result == 0) {
			System.out.println("Overlay title is correct " + overlayTitle);
		} else {
			System.out.println("Overlay title is incorrect " + overlayTitle + " should be Job Search");
		}
		
		driver.findElement(By.cssSelector("div#searchdialog input#txtKeyWords")).sendKeys("Automation Test Lead");
		//WebElement select = driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span"));
		WebElement select = driver.findElement(By.cssSelector("div#searchdialog span.ui-dropdownchecklist-text"));
		//select.getText();
		System.out.println(select.getText());
		driver.findElement(By.cssSelector("div#searchdialog a#RunMainSearch")).click();
		
		driver.close();
	}

}
