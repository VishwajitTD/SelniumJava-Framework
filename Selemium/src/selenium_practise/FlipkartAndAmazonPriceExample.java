package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAndAmazonPriceExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

      driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
     
        driver.findElement(By.xpath(" //button[.='✕']")).click();
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("iPhone 13");
        searchField.submit();

    
        WebElement priceElement = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
        String price = priceElement.getText();
        System.out.println("Flipkart - iPhone 13 price: " + price);

        // Navigate to Amazon and search for iPhone 14
        driver.get("https://www.amazon.com/");
        searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("iPhone 14");
        searchField.submit();

        // Get the price for iPhone 14 on Amazon
        priceElement = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        price = priceElement.getText();
        System.out.println("Amazon - iPhone 14 price: " + price);

        // Close the browser
        driver.quit();
    }
}
