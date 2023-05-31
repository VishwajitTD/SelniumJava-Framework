package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtWidthElemet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		WebElement ele= driver.findElement(By.xpath("//span[@class='autonym' and @title='Italian (it:)']"));
		Thread.sleep(2000);
		int h=ele.getSize().getHeight();
		int w=ele.getSize().getWidth();
		System.out.println(h);
		System.out.println(w);
		driver.close();
		

	}

}
