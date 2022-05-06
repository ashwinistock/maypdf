package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class child_browser_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.OpenBrowser("https://www.drdo.gov.in/");
//		
//		String z = driver.getWindowHandle();
//		System.out.println(z);
		WebElement career = driver.findElement(By.xpath("//span[@class='homeSprite icon icon6']"));
		career.click();
		
		
		Thread.sleep(3000);
		WebElement multi = driver.findElement(By.xpath("//a[text()='Login']"));
		multi.click();
		
		Set<String> A = driver.getWindowHandles();
		Iterator <String> m = A.iterator();
		
		System.out.println(m.next());
		Thread.sleep(2000);
		System.out.println(A);
		
		while (m.hasNext()) {
			driver.switchTo().window(m.next());
			String actualtitle = driver.getTitle();
			String expected = "Careers | Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
		 // System.out.println(m.next());
			if (actualtitle.equals(expected)) 
		
		{
			Thread.sleep(3000);
			WebElement mult = driver.findElement(By.xpath("//a[text()='Login']"));
			mult.click();
			
			Set<String> B = driver.getWindowHandles();
			Iterator <String> n = B.iterator();
			while (n.hasNext()) 
			{
				driver.switchTo().window(n.next());
				String actual = driver.getTitle();
				String expect = "Log in | Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
			
				System.out.println(n.next());
				if(actual.equals(expect)) 
			{
				Thread.sleep(3000);
				WebElement name = driver.findElement(By.xpath("//input[@id='edit-name']"));
				name.sendKeys("ashwini");
				
				Thread.sleep(3000);
				WebElement pass = driver.findElement(By.xpath("//input[@id='edit-pass']"));
				pass.sendKeys("@ashwini6");
				
				
			}
			}
			
		}
		}
	}
}
//
