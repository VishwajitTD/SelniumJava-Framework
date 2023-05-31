package selenium_practise;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class YouTubeTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the YouTube homepage
        driver.get("https://www.youtube.com/");

        // Find the search field and enter a search query
        WebElement searchField = driver.findElement(By.xpath("//input[@id='search']"));
        searchField.sendKeys("THE EQUALIZER 3 - Official Red Band Trailer (HD)");

        // Find the search button and click it
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        searchButton.click();

        // Wait for the search results to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']")));

        // Find the first video in the search results and click it
        WebElement videoLink = driver.findElement(By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']/a"));
        videoLink.click();

        // Wait for the video to start playing
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Pause (k)']")));

        // Click the "like" button
        WebElement likeButton = driver.findElement(By.xpath("//ytd-menu-renderer[@class='style-scope ytd-menu-popup-renderer']//yt-icon-button[@id='button']"));
        likeButton.click();

        // Close the browser
        driver.quit();
    }
}
