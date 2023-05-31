package jeet;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFIrfox {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value= "./sw/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("gmail.com");
		driver.close();
	

	}

}
