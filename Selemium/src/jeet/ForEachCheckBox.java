package jeet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachCheckBox {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/vishw/OneDrive/Desktop/Selenium/Demo1212.html");
		List<WebElement> ch= driver.findElements(By.xpath("//input"));
		int n=ch.size();
	for(WebElement ch1: ch) {
			
			ch1.click();
			
			
		}
	for(int i = n-1; i>=0;i--) {
			
			WebElement ch2=ch.get(i);
			ch2.click();
			
		}
	driver.close();
	}

}
