package jeet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value= "./sw/chromedriver.exe";
		String key1="webdriver.gecko.driver";
		String value1= "./sw/geckodriver.exe";
		System.setProperty(key, value);
		System.setProperty(key1, value1);
		
		ChromeDriver driver= new ChromeDriver();
		FirefoxDriver driver1= new FirefoxDriver();
		driver1.get("google.com");
		driver.close();

	}

}
