package selenium2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = browser.OpenBrowser("http://demo.guru99.com/test/simple_context_menu.html");
//	
//		// right click mouse action 
//	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
//	
//	Actions act = new Actions (driver);
//	act.contextClick(rightclick);
//	act.perform();
//	
//	WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
//	edit.click();
//	
//	Alert a = driver.switchTo().alert();
//	a.accept();
//	
//	Thread.sleep(3000);
//	WebElement twotimes = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//	Actions two = new Actions(driver);
//	two.doubleClick(twotimes);
//	two.perform();
//	
//	Alert b = driver.switchTo().alert();
//	b.accept();
	
		// DragandDrop mouse actions 
//	WebDriver driver = browser.OpenBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
//	
//	WebElement ifm = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//	driver.switchTo().frame(ifm);
//	
//	Thread.sleep(2000);
//	WebElement image = driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content')]"));
//	
//	WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
//	Actions act = new Actions(driver);
//	act.dragAndDrop(image, target);
//	act.perform();
//	
		
		WebDriver driver = browser.OpenBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> image = driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ui')]"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		// for single image 
//		Actions act = new Actions(driver);
//		act.dragAndDrop(image.get(0), destination);
//		act.perform();
		
		// for all image
		for (int i=0;i<image.size();i++) {
			Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.dragAndDrop(image.get(i), destination);
		act.perform();
		}
		
		
		
	}
}
