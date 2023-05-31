package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException 
	{
	
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/vishw/OneDrive/Desktop/Selenium/frame/Frame.html");
        WebElement ele=driver.findElement(By.id("a1"));
        Thread.sleep(2000);
        ele.sendKeys("ABC");
        Thread.sleep(2000);
        driver.switchTo().frame(0).switchTo().frame(0);
        WebElement ele1=driver.findElement(By.id("c1"));
        ele1.sendKeys("321123");
        driver.switchTo().defaultContent();
        ele.clear();
        Thread.sleep(2000);
       
        ele.clear();
        Thread.sleep(2000);
        driver.close();
        
		}
}


