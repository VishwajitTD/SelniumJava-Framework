package testNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {
	public void name() {
		
	} WebDriver driver;
	@BeforeMethod
	public void openApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://burrow.com/");
		 Thread.sleep(2000);
		 
		
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
