package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class popup {

	// Divisible Popup blur the main page but poppage will clear we can inspect them
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = browser.OpenBrowser("https://www.facebook.com/");
			
			WebElement creat = driver.findElement(By.xpath("//a[@rel='async']"));
			creat.click();
			
			Thread.sleep(4000);
			WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
			name.sendKeys("ASHWINI");
		
			Thread.sleep(3000);
			WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
			surname.sendKeys("pawar");
			
			Thread.sleep(3000);
			WebElement num = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			num.sendKeys("9403771057");
		
			Thread.sleep(3000);
			WebElement pass = driver.findElement(By.xpath("//input[@data-type='password']"));
			pass.sendKeys("pawarashwi");
			
			
		    Thread.sleep(4000);
		    WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		    Select date = new Select (day);
		    date.selectByIndex(2);
	     
		    Thread.sleep(3000);
		    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		    Select month1 = new Select(month);
		    month1.selectByIndex(1);
		 
		    Thread.sleep(3000);
		    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		    Select year1 = new Select (year);
		    year1.selectByIndex(1995);
}}
