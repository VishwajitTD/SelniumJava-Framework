package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstatXpath {
    
    public static void main(String[] args) throws InterruptedException {
        
        
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        
     
        WebDriver driver = new ChromeDriver();
        
       
        driver.get("https://www.instagram.com/accounts/login/");
        
      
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='username']"));
        emailInput.sendKeys("9650993717");
        
        Thread.sleep(2000);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("Jeet@662847");
        
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        
    
        Thread.sleep(5000);
        
     
        driver.quit();
    }
}
