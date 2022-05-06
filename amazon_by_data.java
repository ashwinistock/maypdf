package selenium2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon_by_data {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	WebDriver driver = browser.OpenBrowser("https://www.amazon.com/");
	
	WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	signin.click();
	
	String username =paramatirization.Getop(0,1, "amazon");
	String pass = paramatirization.Getop(1,1, "amazon");

	Thread.sleep(3000);
	Thread.sleep(2000);
	WebElement name = driver.findElement(By.xpath("//input[@id='ap_email']"));
	name.sendKeys(username);
	
   WebElement process = driver.findElement(By.xpath("//input[@id='continue']"));
   process.click();
   
   WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
   password.sendKeys(pass);
   
   WebElement done = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
   done.click();
   
}
}
