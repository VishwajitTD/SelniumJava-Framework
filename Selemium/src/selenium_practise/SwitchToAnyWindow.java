package selenium_practise;

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

public class SwitchToAnyWindow {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
        WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
        WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
        WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
        WebElement ele5 = driver.findElement(By.xpath("//span[.='Blog']"));
        ArrayList<WebElement> l1 = new ArrayList<WebElement>();
        { 
            l1.add(ele1);
            l1.add(ele2);
            l1.add(ele3);
            l1.add(ele4);
            l1.add(ele5);
        }
        Actions act=new Actions(driver);
        for (WebElement ele : l1) {
        	
        	act.contextClick(ele).perform();
        	Robot r=new Robot();
        	r.keyPress(KeyEvent.VK_T);
        	r.keyRelease(KeyEvent.VK_T);	
            Thread.sleep(1000); // wait for the new window/tab to open
		}
        // get all window handles
        Set<String> allWindows = driver.getWindowHandles();
       ArrayList<String> windoList = new ArrayList<String>(allWindows);
       String last = windoList.get(1);
       driver.switchTo().window(last);
        
        /* Set<String> allWindows = driver.getWindowHandles();
        ArrayList<String> l2 = new ArrayList<String>(allWindows);
       
       String first = l2.get(1);
        driver.switchTo().window(first);
        String pageTitle1 = driver.getTitle();
        System.out.println(pageTitle1+": first"); //Blog | Selenium: first
        String second = l2.get(2);
        driver.switchTo().window(second);
        String pageTitle2 = driver.getTitle();
        System.out.println(pageTitle2+": second"); //Projects | Selenium
        String third = l2.get(3);
        driver.switchTo().window(third);
        String pageTitle3 = driver.getTitle();
        System.out.println(pageTitle3+": third"); //The Selenium Browser Automation Project
        String fourth = l2.get(4);
        driver.switchTo().window(fourth);
        String pageTitle4 = driver.getTitle();
        System.out.println(pageTitle4+": fourth"); //Support | Selenium
        String fifth = l2.get(5);
        driver.switchTo().window(fifth);
        String pageTitle5 = driver.getTitle(); 
        System.out.println(pageTitle5+": fifth"); //Downloads | Selenium
        */
        

    }
}
