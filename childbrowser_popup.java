package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrowser_popup {

	public static void main(String[] args) {

		WebDriver driver = browser.OpenBrowser("https://vctcpune.com/");
		 
		WebElement selenium = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		selenium.click();
		selenium.click();
		
		//String address = driver.getWindowHandle();// get single address of main page by 
		//System.out.println(address);              // getHandle method it's webdriver method.
		
	
		
		Set <String> address = driver.getWindowHandles();// get all address of open pages
		Iterator <String> a = address.iterator(); // Generic tell us which kind of data we have <String>
		System.out.println(a.next());
		while(a.hasNext())// hasnext return boolean value.
		{
		driver.switchTo().window(a.next());// switch (method of webdriver) to change the focus from main page to child page
		                                  // next method return the next value from set (method of iterator interface)
		String actualtitle = driver.getTitle();
		String expected  = "Practice Page";
		if (actualtitle.equals(expected)) {
			WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
			radio1.click();
			
			break; // it will stop once the expected ans get
		//*************************
//			WebElement off = driver.findElement(By.xpath("(//img[@class='popupClose'])[1]"));
//			off.click(); // divisible popup
//			
//			WebElement demo = driver.findElement(By.xpath("//a[text()='DMEO'] "));
//			demo.click();
//			Thread.sleep(3000);
//			Alert a = driver.switchTo().alert();
//			a.accept();
//			
//			WebElement monitoring = driver.findElement(By.xpath("//svg[@focusable='false']"));
//			String page = driver.getWindowHandle();
//			System.out.println(page);
	//	
		
		}
		
		}
		
		
}}
