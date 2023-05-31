package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpFIleUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/vishw/OneDrive/Desktop/Selenium/FIle.html");
        WebElement ele=driver.findElement(By.name("upload"));
        ele.sendKeys("C:\\Users\\vishw\\OneDrive\\Desktop\\Selenium\\FIle.html");
        Thread.sleep(2000);
        driver.close();

	}

}
