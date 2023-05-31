package jeet;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spacex.com/");
		Point p=new Point(400,800);
		Thread.sleep(3000);
		driver.manage().window().setPosition(p);
		driver.close();
		

	}

}
