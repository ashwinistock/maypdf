package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {
     public static void main(String[] args) throws InterruptedException {
     WebDriver driver = browser.OpenBrowser("https://www.facebook.com/");
 
     WebElement email = driver.findElement(By.id("email"));// locator by id (done)
     email.sendKeys("ashwini");
     
   // WebElement page = driver.findElement(By.tagName("button"));// locator by tagname (done)
    //page.click();
    
  // WebElement pass =driver.findElement(By.name("pass")); // locator by name (done)
  // pass.sendKeys("123");
   
  // WebElement forget = driver.findElement(By.linkText("Forgotten password?")); // locator by text (done)
  // forget.click();
     
   WebElement frgt = driver.findElement(By.partialLinkText("Forgotten password")); // locator by partial text (Done) 
   frgt.click();
   
   WebElement newadd = driver.findElement(By.cssSelector("input[placeholder=\"Email address or mobile number\"]"));
   newadd.sendKeys("90997786");  // locator by css (cascading style sheets) (Done)
   
}}
