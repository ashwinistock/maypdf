package selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert_popup {


	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = browser.OpenBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	//	
//		WebElement alertbox = driver.findElement(By.xpath("//input[@value='Alert']"));
//		alertbox.click();
//		Thread.sleep(3000);
//		Alert a = driver.switchTo().alert();  // (DONE)alert is class 
//		a.accept();
	//	
//		WebElement conformation = driver.findElement(By.xpath("//input[@name='confirmation']"));
//		conformation.click();
//		Thread.sleep(4000);
//		Alert b = driver.switchTo().alert();
//		b.accept();
	//	
//	    WebElement prompt = driver.findElement(By.xpath("//input[@value='Prompt']"));
//	    prompt.click();
//	    Alert c = driver.switchTo().alert(); // (key not sended )
//	    c.sendKeys("yes");
//	    c.dismiss();
	    
			WebDriver driver = browser.OpenBrowser("https://the-internet.herokuapp.com/javascript_alerts");
			WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
			prompt.click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			a.sendKeys("yes");
			
			
}}
