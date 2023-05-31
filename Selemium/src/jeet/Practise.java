package jeet; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("youtube");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("search_query")).sendKeys("Srivalli by Sid Sriram");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
