package jeet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachFecthSC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		for(WebElement we: links) {
			String t=we.getAttribute("href");
			System.out.println(t);
		}

		driver.close();

	}

}
