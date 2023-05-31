package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeXpath {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Baby Doll ");//input[id='search']
        Thread.sleep(3000);
        driver.findElement(By.xpath("button[id='search-icon-legacy']")).click();
        //button[id='search-icon-legacy']
        Thread.sleep(3000);
        driver.findElement(By.xpath("//yt-formatted-string[contains(@class, 'style-scope ytd-video-rendered')]")).click();
        Thread.sleep(6000);
	}

}
