package generic_Script;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_Constant {
    protected static WebDriver driver;

    @BeforeMethod
    public void openApp() {
        System.setProperty(chrome_key, chrome_value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }

    @AfterMethod
    public void closeApp(ITestResult res) {
    	if (ITestResult.FAILURE==res.getStatus()) {
    		TakeScreenShot.getPhoto(driver);
			
		}
    
            driver.close();
        
    }
}
