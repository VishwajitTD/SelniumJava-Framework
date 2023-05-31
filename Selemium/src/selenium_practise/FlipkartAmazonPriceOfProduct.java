package selenium_practise;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAmazonPriceOfProduct {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[.='✕']")).click();
        Thread.sleep(2000);
        // Search for iPhone 13 on Flipkart
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("iPhone 13");
        searchField.submit();
        Thread.sleep(2000);
        // Get the price for iPhone 13 on Flipkart
        WebElement priceElement = driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Starlight, 128 GB)']/../../div[2]/div[1]/div[1]/div[.='₹57,999']"));
        String price = priceElement.getText();
        String actualPrice1=price.replaceAll("₹", "");
        String actualPrice=actualPrice1.replaceAll(",", "");
        System.out.println("Flipkart - iPhone 13 price: " + actualPrice);

        
        // Open Amazon in a new tab and switch WebDriver's focus to the new tab
        String flipkartTab = driver.getWindowHandle();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.amazon.in/','_blank');");
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        tabs.remove(flipkartTab);
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(0));
        
        // Search for iPhone 14 on Amazon
        searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("iPhone 14");
        searchField.submit();
        
        // Get the price for iPhone 14 on Amazon
        priceElement = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        String price4 = priceElement.getText();
        String actualPrice5=price4.replaceAll("₹", "");
        String actualPrice6=actualPrice5.replaceAll(",", "");
        System.out.println("Flipkart - iPhone 13 price: " + actualPrice6);
        Thread.sleep(2000);
        // Close the browser
        
    }
}
