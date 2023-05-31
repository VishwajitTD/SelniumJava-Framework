package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="file:///C:/Users/vishw/OneDrive/Desktop/Selenium/Demo1.html";
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("a"));
		boolean b=ele.isDisplayed();
		if (b) {
			System.out.println("Its Displayed");
			
		}
		else {
			System.out.println("Its Not Dispalyed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
