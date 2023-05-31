package selenium_practise;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowToNewTabSwitching {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[.='✕']")).click();
        Thread.sleep(2000);
        
        // Open Amazon in a new tab using control+t shortcut
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
        // Search for cars on Amazon
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("cars");
        searchField.submit();
        Thread.sleep(2000);
        
        Actions action1 = new Actions(driver);
        action1.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(0));
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        
        // Search for cars on Amazon
        WebElement searchField1 = driver.findElement(By.id("APjFqb"));
        searchField1.sendKeys("cars");
        searchField1.submit();
        Thread.sleep(2000);
        
        // Close the browser
        driver.quit();
    }
}
