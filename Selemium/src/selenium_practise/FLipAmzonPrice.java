package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLipAmzonPrice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("iPhone 13");
        searchField.submit();
        Thread.sleep(2000);

        WebElement priceElement = driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Blue, 128 GB)']/../../../div[3]/div[2]/div[1]/div[1]/div[1]"));
        Thread.sleep(2000);
        String price = priceElement.getText();
        Thread.sleep(2000);
        System.out.println("Flipkart - iPhone 13 price: " + price);
        Thread.sleep(2000);

       driver.get("https://www.amazon.in/");
        searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("iPhone 14");
        searchField.submit();

        priceElement = driver.findElement(By.xpath("//span[.='66,999']"));
        price = priceElement.getText();
        System.out.println("Amazon - iPhone 14 price: " + price);
       
        driver.close();

     
    }
}
