package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouseact_fb {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = browser.OpenBrowser("https://demoqa.com/text-box");
//		
//		Actions act = new Actions(driver);
//		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
//		name.sendKeys("Ashwini");
//		
//		act.sendKeys(Keys.TAB);
//		act.perform();
//		act.sendKeys("pawar");
//		act.perform();
//		
//		act.sendKeys(Keys.TAB);
//		act.perform();
//		act.sendKeys("shirpur");
//		act.perform();
//		
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("a");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
//		
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("c");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
//		
//		act.sendKeys(Keys.TAB);
//		act.perform();
//		
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("v");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
		
		
		
//		WebDriver driver = browser.OpenBrowser("https://www.facebook.com/");
//		
//		Actions a = new Actions(driver);
//		WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
//		name.sendKeys("Ashwini");
//		
//		a.sendKeys(Keys.TAB);
//		a.perform();
//		a.sendKeys("pawar");
//		a.perform();
		
		
		WebDriver driver = browser.OpenBrowser("https://www.facebook.com/");
		
		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		signup.click();
		
		Thread.sleep(6000);
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("ashwini");
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB);
		act.perform();
		act.sendKeys("pawar");
		act.perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB);
		act.perform();
		act.sendKeys("9403771057");
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		act.sendKeys("Khkl23@");
		act.perform();
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		day.click();
		
		Select obj = new Select(day);
		obj.selectByIndex(5);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	   Select obj1 = new Select (month);
		obj1.selectByValue("2");
	
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj3 = new Select (year);
		obj3.selectByVisibleText("1945");
		
		WebElement gen = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gen.click();
		
	   WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		
		
	}
}
