package jeet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLnchBrserEntrUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
