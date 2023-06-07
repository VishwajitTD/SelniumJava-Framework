package listeners_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic_Script.Framework_Constant;
import generic_Script.GetData;
import pom_Script.POM1;

public class Listener_BeforMethod implements Framework_Constant {
	public WebDriver driver;
	@BeforeMethod
	public void openApp(){
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void signIn() {
		POM1 p= new POM1(driver);
		try {
			p.signInAcc();
			Thread.sleep(2000);
			p.enterEmailForSignIn(GetData.getData("Sheet1", 1, 2));
			Thread.sleep(2000);
			p.enterPasswordForSignIn(GetData.getData("Sheet1", 1, 3));
			Thread.sleep(2000);
			p.submitSignInAcc();
			Assert.fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			TakeScreenshot.getPhoto(driver);
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			TakeScreenshot.getPhoto(driver);
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			TakeScreenshot.getPhoto(driver);
		}
		driver.close();
		
	}


	

}
