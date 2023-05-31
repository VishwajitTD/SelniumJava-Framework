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

public class OpenEveryTabSwitchToLast {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.selenium.dev/");
        Thread.sleep(1000);
        WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
        WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
        WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
        WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
        WebElement ele5 = driver.findElement(By.xpath("//span[.='Blog']"));
        ArrayList<WebElement> l =new ArrayList<WebElement>();
        { 
        l.add(ele1);
        l.add(ele2);
        l.add(ele3);
        l.add(ele4);
        l.add(ele5);
     	}
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        for (WebElement ele : l) {
        	act.contextClick(ele).perform();
        	Robot r=new Robot();
        	r.keyPress(KeyEvent.VK_T);
        	r.keyRelease(KeyEvent.VK_T);	
		}
        Set<String> allwb = driver.getWindowHandles();
        ArrayList<String> l2= new ArrayList<String>();
        for (String wb : allwb) {
        	l2.add(wb);
			
		}
        Thread.sleep(4000);
        String last=l2.get(5);
        driver.switchTo().window(last);
        Thread.sleep(3000);
        driver.quit();
        
        
	}

}
