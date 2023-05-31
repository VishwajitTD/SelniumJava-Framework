package jeet;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;//Step1-typrCaste
		File src = ts.getScreenshotAs(OutputType.FILE);//captureUsingMethod getScreenShotAs()
		File dst=new File("C:\\Users\\vishw\\OneDrive\\Desktop\\Selenium\\FailedTestCase\\name.jpeg");
		org.openqa.selenium.io.FileHandler.copy(src, dst);
		driver.close();
		
		

	}

}
