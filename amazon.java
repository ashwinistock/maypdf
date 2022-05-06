package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.OpenBrowser("https://www.amazon.com/");
		try {
		WebElement sighin = driver.findElement(By.xpath("//span[text()='Hello , Sign in']"));
		sighin.click();}
		catch(Exception e) {
			System.out.println("get exception");
		}
		
//		Thread.sleep(2000);
		WebElement creat = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		creat.click();
	
//		
		
//		Thread.sleep(3000);
//		WebElement name = driver.findElement(By.xpath("//input[@name='customerName']"));
//		name.sendKeys("Lawnya pawar");
//		
//		Thread.sleep(3000);
//		WebElement number = driver.findElement(By.xpath("//input[@id='ap_email']"));
//		number.sendKeys("9403771057");
//		
//		Thread.sleep(3000);
//		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
//		pass.sendKeys("ashwini95");
//		
//		Thread.sleep(3000);
//		WebElement repass = driver.findElement(By.xpath("//input[@id='ap_password_check']"));
//		repass.sendKeys("ashwini95");
//		
//		Thread.sleep(3000);
//		WebElement verify = driver.findElement(By.xpath("//input[@id='continue']"));
//		verify.click();
//		
//		Thread.sleep(3000);
//		WebElement puzzle = driver.findElement(By.xpath("/html/body/div/div/div[1]/button"));
//		puzzle.click();
	}
	public void forGit() {
		System.out.println("add method for git");
	}
}
