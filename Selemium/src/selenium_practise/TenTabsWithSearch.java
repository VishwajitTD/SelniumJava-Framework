package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TenTabsWithSearch {

    public static void main(String[] args) {
        // Set the system property for the Chrome driver
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open Google.com in the first tab
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        // Open 5 more tabs in Google.com
        for (int i = 1; i <= 5; i++) {
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
            driver.get("https://www.google.com/");
        }

        // Switch to the third tab
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());

        // Type "18+ images" in the search box and submit
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("18+ images");
        searchBox.submit();

        // Repeat the same process for the rest of the tabs
        for (int i = 0; i < 9; i++) {
            driver.switchTo().window(driver.getWindowHandles().toArray()[i].toString());
            searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("18+ images");
            searchBox.submit();
        }
    }
}
