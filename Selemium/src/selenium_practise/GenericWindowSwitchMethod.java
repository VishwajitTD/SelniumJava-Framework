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

public class GenericWindowSwitchMethod {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath(" //button[.='✕']")).click();
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("iPhone 13");
        searchField.submit();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Starlight, 128 GB)']"));
        Actions act = new Actions(driver);
        act.contextClick(ele).perform();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        Thread.sleep(2000);

        // Switch to the new window
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(currentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        WebElement ele1 = driver.findElement(By.xpath("//span[.='APPLE iPhone 13 (Starlight, 128 GB)']"));
        String t = ele1.getText();
        System.out.println(t);
        Thread.sleep(2000);
        // Close the current window
        driver.close();
        Thread.sleep(2000);
        // Switch back to the original window
        driver.switchTo().window(currentWindow);
        Thread.sleep(2000);
        // Close the browser
        driver.close();
    }
}
