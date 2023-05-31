package jeet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachTextLinkofAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		for(WebElement we: links) {
			String t=we.getText();
			System.out.println(t);
		}
for(int i = links.size()-1; i>=0;i--) {
			
			WebElement ch2=links.get(i);
			ch2.click();
			
		}
		driver.close();

	}

}
