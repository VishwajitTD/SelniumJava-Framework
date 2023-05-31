package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopuoHiddenDIvision {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.redbus.com/");
        driver.findElement(By.xpath("//input[id='r-date']")).click();
        driver.findElement(By.xpath("(//span[.='3'])[1]")).click();
        driver.close();
        
        

	}

}
