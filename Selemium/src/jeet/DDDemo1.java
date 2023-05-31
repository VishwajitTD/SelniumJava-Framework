package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vishw/OneDrive/Desktop/Selenium/MultiDropdown.html");
		WebElement ele=driver.findElement(By.id("KGF Hotel"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("l");
		Thread.sleep(2000);
		s.selectByVisibleText("rice");
		Thread.sleep(1000);
		s.deselectAll();
		driver.close();

	}

}
