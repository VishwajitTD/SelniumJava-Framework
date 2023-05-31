package jeet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleEveryBrowserAndCloseOneByOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(4000);
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(2000);
        Set<String> allwh = driver.getWindowHandles();
        for (String wh : allwh) {
        	driver.switchTo().window(wh);
        	String title= driver.getTitle();
        	System.out.println(title);
        	driver.close();			
		}
        

	}

}
