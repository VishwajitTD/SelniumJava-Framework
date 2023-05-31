package jeet;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension	d = new Dimension(2000, 4000);
		driver.get("https://www.spacex.com/");
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
