package jeet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleOpenNewTab {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https:www.google.com/");
        Thread.sleep(1000);
        WebElement ele = driver.findElement(By.linkText("मराठी"));
        Actions act = new Actions(driver);
        act.contextClick(ele).perform();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        Set<String> allwh = driver.getWindowHandles();
        ArrayList<String> l=new ArrayList<String>();
       for (String wh : allwh) {
    	   l.add(wh);
    	   }
       String wh1 = l.get(1);
       driver.switchTo().window(wh1);
       Thread.sleep(2000);
       driver.close();
       
       
       
       
        
        /* String p_id = driver.getWindowHandle();
        
        for (String wh : allwh) {
        	
        	if (!wh.equals(p_id)) {
        		
        		driver.switchTo().window(wh);
			}
			*/
        	
			
		}
        

	}


