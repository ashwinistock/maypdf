package selenium2;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class multi_frames {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = browser.OpenBrowser("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
        multi.click();
        
		WebElement firstframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(firstframe);
		
		WebElement secondframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(secondframe);
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Ashwini");

//		Thread.sleep(3000);
//		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination = new File("D:\\Screenshot by selenium\\auto.jpg");
//		FileHandler.copy(sourse, destination);
//		
		Dimension k = new Dimension(300,700);
		driver.manage().window().setSize(k);
		
//		Point j = new Point (200, 300);
//		driver.manage().window().setPosition(j);
//		
	}}