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

public class GotoMatchingTitle {

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
        ArrayList<WebElement> l = new ArrayList<WebElement>();
        { 
            l.add(ele1);
            l.add(ele2);
            l.add(ele3);
            l.add(ele4);
            l.add(ele5);
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

        // switch to the "Blog | Selenium" window
        String pageTitle = "Blog | Selenium";
        for (String windowHandle : windowList) {
            driver.switchTo().window(windowHandle);
            String lastWindow = driver.getTitle();
            System.out.println(lastWindow);
            if (lastWindow.equals(pageTitle)) {
            	System.out.println("It's Matching, Now Control Will be Mine");
                break;
            }

    }
}
}
