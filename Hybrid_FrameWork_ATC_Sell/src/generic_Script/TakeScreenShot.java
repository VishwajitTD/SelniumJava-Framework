package generic_Script;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenShot extends Base_Test {
    @Test
    public static  void getPhoto(WebDriver driver) {
        String path = "./Photo";
        Date d = new Date();
        String d1 = d.toString();
        String d2 = d1.replaceAll(":", "-");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dst = new File(path + d2+".jpeg");
        try {
            FileHandler.copy(src, dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
