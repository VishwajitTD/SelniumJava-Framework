package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value= "./sw/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xhamster20.desi/");
		driver.findElement(By.xpath("//span[@class='button__body' and text()=\"I'm 18 or older — enter xHamster\"]")).click();
		
		driver.close();
	

	}

}
