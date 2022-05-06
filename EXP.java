package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EXP {

//	public void test (int a, int b) {	
//	try
//	{
//	  System.out.println(a/b);
//   }
//	catch (ArithmeticException e) 
//	{
//	   System.out.println("wrong I/P");
//   }
//	}
//     public static void main(String[] args) {
//	  EXP obj = new EXP ();
//	  obj.test(5, 0);
	
     public static void main(String[] args) {
	WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
	
	WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	hide.click();
	
	try {
		WebElement text = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        text.sendKeys("ashu");
       }catch(Exception e) {
    	   System.out.println(e);
    	   System.out.println("text not available");
       }
}}
