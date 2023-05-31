package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledDemo {

	public static void main(String[] args) throws InterruptedException {
		String url="file:///C:/Users/vishw/OneDrive/Desktop/Selenium/Demo2.html";
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("a"));
		boolean b=ele.isDisplayed();
		if (b) {
			System.out.println("Its Disabled");
			
		}
		else {
			System.out.println("Its Enabled");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
