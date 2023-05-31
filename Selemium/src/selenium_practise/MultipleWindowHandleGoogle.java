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

public class MultipleWindowHandleGoogle {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement ele1 = driver.findElement(By.xpath("//a[.='Gmail']"));
        WebElement ele2 = driver.findElement(By.xpath("//a[text()='हिन्दी']"));
        WebElement ele3 = driver.findElement(By.xpath("//a[.='मराठी']"));
        WebElement ele4 = driver.findElement(By.xpath("//a[.='Images']"));
        ArrayList<WebElement> l = new ArrayList<WebElement>();
        { 
            l.add(ele1);
            l.add(ele2);
            l.add(ele3);
            l.add(ele4);
        }
        Actions act=new Actions(driver);
        for (WebElement ele : l) {
        	
        	act.contextClick(ele).perform();
        	Robot r=new Robot();
        	r.keyPress(KeyEvent.VK_T);
        	r.keyRelease(KeyEvent.VK_T);	
            Thread.sleep(1000); // wait for the new window/tab to open
		}
        // get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        ArrayList<String> windowList = new ArrayList<String>(allWindows);
        
        // switch to the last window with a specific page title
        String pageTitle = "Google Images";
        for (String windowHandle : windowList) {
            driver.switchTo().window(windowHandle);
            String lastWindow = driver.getTitle();
            System.out.println(lastWindow);
            if (lastWindow.equals(pageTitle)) {
            	System.out.println("It's Matching");
                break;
            }
        }

    }
}
