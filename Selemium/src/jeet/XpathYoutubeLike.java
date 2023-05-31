package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathYoutubeLike {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchInput.sendKeys("ra ra rakkamma");
        searchInput.submit();
        Thread.sleep(5000);
        WebElement firstVideo = driver.findElement(By.xpath("//ytd-video-renderer//*[@id='video-title']"));
        firstVideo.click();
        Thread.sleep(10000);
        WebElement likeButton = driver.findElement(By.xpath("//ytd-menu-renderer[@id='top-level-buttons']/ytd-toggle-button-renderer[1]"));
        likeButton.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
