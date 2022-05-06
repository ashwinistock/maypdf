package selenium2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Zeroda_para {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = browser.OpenBrowser("https://kite.zerodha.com/");
		
		String user = paramatirization.Getop(0,1,"zeroda");
		String password = paramatirization.Getop(1,1,"zeroda");
		String userpin = paramatirization.Getop(2,1,"zeroda");
		
		
		WebElement name = driver.findElement(By.xpath("//input[@id='userid']"));
		name.sendKeys(user);
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(password);
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		Thread.sleep(5000);
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(userpin);
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		Thread.sleep(3000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("D:\\Screenshot by selenium\\zeroda.jpg");
		FileHandler.copy(source, destination);
		
	}
}
