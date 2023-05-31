package jeet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Match_Contains {

	public static void main(String[] args) throws InterruptedException 
	{
		String actual_url="https://www.gmail.com/";
		String actual_title="Gmail";
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(actual_url);
		Thread.sleep(2000);
		String expected_title=driver.getTitle();
		String expected_url=driver.getCurrentUrl();
		if (actual_url.contains(expected_url)) {
			System.out.println("Matching");
		}
		else if (actual_title.contains(expected_title)){
			System.out.println("Its Not Matching");
		}
		else{
			System.out.println("Matching");
		}
		
		
		

	}

}
