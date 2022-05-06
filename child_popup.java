package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class child_popup {

//	public static void main(String[] args) throws InterruptedException  {
//		WebDriver driver = browser.OpenBrowser("https://www.drdo.gov.in/");
//		
//		Thread.sleep(2000);
//		WebElement search = driver.findElement(By.xpath("//span[@class='hamburger-inner']"));
//		search.click();
//		
//		Set<String> a = driver.getWindowHandles();
//		Iterator <String> b = a.iterator();
//		System.out.println(b.next());
//		
//		while (b.hasNext())
//		{    driver.switchTo().window(b.next());//span[@class='hamburger-inner']
//			 String actual= driver.getTitle();
//			 String expected = "Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
//			 if (actual.equals(expected)) 
//			 {
//				Thread.sleep(3000); 
//				WebElement organisation = driver.findElement(By.xpath("(//a[text()='Organisation'])[2]"));
//				organisation.click();
//			 }
//		}
		
//		WebDriver driver = browser.OpenBrowser("https://www.drdo.gov.in/");
//		
//		WebElement news = driver.findElement(By.xpath("(//a[@class='impLinksBox thirdPartyUrl'])[6]"));
//		news.click();
//		
//		Set <String> opt = driver.getWindowHandles();
//		Iterator <String> b = opt.iterator();
//		System.out.println(b.next());
//		
//		while(b.hasNext()) {
//			driver.switchTo().window(b.next());
//			String actual = driver.getTitle();
//			String expected = "Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
//			if (actual.equals(expected)) 
//			{
//				Thread.sleep(3000);
//				WebElement option = driver.findElement(By.xpath("//span[@class='hamburger-inner']"));
//				option.click();
//			}
		
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = browser.OpenBrowser("https://www.drdo.gov.in/");
			
		WebElement carrer = driver.findElement(By.xpath("//span[@class='homeSprite icon icon6']"));
		carrer.click();
		Set<String> a = driver.getWindowHandles();
		Iterator <String> b= a.iterator();
		System.out.println(b.next());
		while (b.hasNext()) {
			driver.switchTo().window(b.next());
			String current = driver.getTitle();
			String expected = "Careers | Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
		if(current.equals(expected))
		{
			WebElement options = driver.findElement(By.xpath("//span[@class='hamburger-inner']"));
			options.click();
			
			Thread.sleep(2000);
			WebElement contactus = driver.findElement(By.xpath("(//a[text()='Contact Us'])[3]"));
			contactus.click();
		}
		}
		
		}

		
	}
	 
	
	

