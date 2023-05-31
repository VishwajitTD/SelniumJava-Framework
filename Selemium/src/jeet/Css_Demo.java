package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Thread.sleep(2000);
		//driver.findElements(By.tagName("a")).click
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vishwajitdongle@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Jeet_160891");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}


}
