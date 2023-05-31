package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Play_Song_Youtube {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("youtube");
        searchBox.submit();
        List<WebElement> results = driver.findElements(By.cssSelector("div.g"));
        results.get(0).findElement(By.cssSelector("a")).click();
        Thread.sleep(2000);
        WebElement searchInput = driver.findElement(By.name("search_query"));
        searchInput.sendKeys("ra ra rakkamma");
        searchInput.submit();
        Thread.sleep(5000);
        WebElement firstVideo = driver.findElement(By.cssSelector("ytd-video-renderer #video-title"));
        firstVideo.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
