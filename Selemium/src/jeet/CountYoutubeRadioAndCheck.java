package jeet;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountYoutubeRadioAndCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
		
		//driver.findElements(By.tagName("a")).click
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vishwajitdongle@gmail.com");
		
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Jeet_160891");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(10000);
		
		

	}

}
