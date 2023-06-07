package listeners_Demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot  {
	public static void getPhoto(WebDriver driver) {
		String path="C:\\Users\\vishw\\OneDrive\\Desktop\\Selenium\\photo\\";
		Date d =new Date();
		String d1=d.toString();
		String d2 = d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(path+d2+".png");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
