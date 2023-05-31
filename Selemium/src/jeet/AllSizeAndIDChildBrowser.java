package jeet;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSizeAndIDChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(4000);
        Set<String> allwh = driver.getWindowHandles();
        int count=allwh.size();
        System.out.println(count);
        for (String wh : allwh) {
        	System.out.println(wh);
			
		}
        driver.close();

	}

}
