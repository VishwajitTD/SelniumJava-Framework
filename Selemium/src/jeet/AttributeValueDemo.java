package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValueDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.masterclass.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[.='At Work']"));
	String att=ele.getAttribute("href");
	System.out.println(att);
	driver.close();
	}

}
