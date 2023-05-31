package jeet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowWithoutCloseMethod {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        WebDriver driver = new ChromeDriver();
       
        driver.get("https:www.google.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_F4);
        r.keyRelease(KeyEvent.VK_F4);
        r.keyRelease(KeyEvent.VK_WINDOWS);

	}

}
