package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingAttibute {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.xpath("//input[@id='email' and @type='text']"));
        inputField.sendKeys("9650933717");
        Thread.sleep(6000);
        WebElement inputField1 = driver.findElement(By.xpath("//input[@type='password' and @id='pass']"));
        inputField1.sendKeys("password");
        Thread.sleep(6000);
        WebElement inputField2 = driver.findElement(By.xpath(" //button[@ name='login' and @ type='submit']"));
        inputField2.click();
        Thread.sleep(6000);
     
     
        driver.quit();
    }
}
