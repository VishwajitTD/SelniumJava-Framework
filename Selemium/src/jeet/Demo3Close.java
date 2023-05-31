package jeet;

import org.openqa.selenium.chrome.ChromeDriver;
public class Demo3Close {

	public static void main(String[] args) throws InterruptedException {


		String key="webdriver.chrome.driver";
		String value= "./sw/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
	}

}
