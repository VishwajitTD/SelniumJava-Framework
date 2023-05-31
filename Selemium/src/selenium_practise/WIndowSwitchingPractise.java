package selenium_practise;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WIndowSwitchingPractise {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        
        // Open Amazon in a new tab using Google search
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("amazon");
        searchField.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        
        // Open Flipkart in a new tab using Google search
        searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("flipkart");
        searchField.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(2000);
        
        // Close Flipkart
        driver.close();
        Thread.sleep(2000);
        
        // Close Amazon
        driver.switchTo().window(tabs.get(1));
        driver.close();
        Thread.sleep(2000);
        
        // Close Google
        driver.switchTo().window(tabs.get(0));
        driver.close();
        Thread.sleep(2000);
        
        // Quit the browser
        driver.quit();
    }
}
