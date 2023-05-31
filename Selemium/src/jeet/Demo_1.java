package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		//driver.findElements(By.tagName("a")).click
		driver.findElement(By.name("email")).sendKeys("vishwajitdongle@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Jeet_160891");
		driver.findElement(By.name("login")).click();

	}

}
