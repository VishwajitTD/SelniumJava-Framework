package jeet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLinlAmazon {

	public static void main(String[] args) {

		{
			System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			List<WebElement> links=driver.findElements(By.xpath("//a"));
			int n=links.size();
			for (int i = 0; i <n; i++) {
				
				WebElement link=links.get(i);
				String linkURL=link.getText();
				System.out.println(linkURL);
			}
			
			driver.close();
			
			

		}

	}

}
