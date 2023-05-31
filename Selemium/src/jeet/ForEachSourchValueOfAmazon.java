package jeet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachSourchValueOfAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> links=driver.findElements(By.xpath("//img"));
		for(WebElement we: links) {
			String t=we.getAttribute("src");
			System.out.println(t);
		}

		driver.close();// TODO Auto-generated method stub

	}

}
