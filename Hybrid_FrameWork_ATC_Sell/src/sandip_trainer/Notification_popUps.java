package sandip_trainer;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popUps {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		//TO Block Notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		//authentication PopUps
		driver.get("htttps://admin:admin@https://the-internet.herokuapp.com/");
	
		driver.findElement(By.xpath("//a[.='Basic Auth']")).click();
		
		*/
		//Auto IT
		driver.get("https://www.ilovepdf.com/pdf_to_powerpoint");
		driver.findElement(By.xpath("//span[.='Select PDF file']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\vishw\\OneDrive\\Desktop\\Selenium\\GitUp_Token.exe");
		
		
	}

}
