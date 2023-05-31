package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCopyPastKeyBoard {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="file:///C:/Users/vishw/OneDrive/Desktop/Selenium/Demo1.html";
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.id("a"));
		ele1.sendKeys(Keys.CONTROL+"AX");
		Thread.sleep(2000);
		WebElement ele3= driver.findElement(By.id("c"));
		ele3.sendKeys(Keys.CONTROL+"AV");
		Thread.sleep(2000);
		WebElement ele2= driver.findElement(By.id("b"));
		ele2.sendKeys(Keys.CONTROL+"AX");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"AV");
		Thread.sleep(2000);
		ele3.sendKeys(Keys.CONTROL+"AX");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"AV");
		Thread.sleep(2000);
		driver.close();
		
		}
}
