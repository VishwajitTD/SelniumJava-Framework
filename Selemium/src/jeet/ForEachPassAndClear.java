package jeet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachPassAndClear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/vishw/OneDrive/Desktop/Selenium/text5.html");
		List<WebElement> text= driver.findElements(By.xpath("//input"));
		for (WebElement we: text) {
			we.sendKeys("sendKeys");
		}
		for(int i=text.size()-1;i>=0;i--) {
			WebElement t1=text.get(i);
			t1.clear();
			
		}
		driver.close();
		

	}

}
