package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		WebElement ele= driver.findElement(By.xpath("//span[@class='autonym' and @title='Italian (it:)']"));
		Thread.sleep(2000);
		Point lc= ele.getLocation();
		System.out.println(lc);
		int x=lc.getX();
		int y=lc.getY();
		System.out.println(x);
		System.out.println(y);
		driver.close();

	}

}
