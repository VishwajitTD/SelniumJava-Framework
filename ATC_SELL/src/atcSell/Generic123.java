package atcSell;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic123 {
public void name() {
		
	} WebDriver driver;
	@BeforeMethod
	public void openApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver33.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.chess.com/login");

         driver.close();
		 
		
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
