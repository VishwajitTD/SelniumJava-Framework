package selenium_practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowSwitchingAmzonFlipkartAndGoogle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	      driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com/");
	     
	        driver.findElement(By.xpath(" //button[.='✕']")).click();
	        WebElement searchField = driver.findElement(By.name("q"));
	        searchField.sendKeys("iPhone 13");
	        searchField.submit();
	      Thread.sleep(2000);
	       WebElement ele= driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Starlight, 128 GB)']"));
	       Actions act=new Actions(driver);
	       act.contextClick(ele).perform();
	       Thread.sleep(2000);
	       Robot r= new Robot();
	       r.keyPress(KeyEvent.VK_T);
	       r.keyRelease(KeyEvent.VK_T);
	       driver.switchTo().window("");
	       Set<String> allWindows = driver.getWindowHandles();
	       ArrayList<String> windoList = new ArrayList<String>(allWindows);
	       String next = windoList.get(1);
	       driver.switchTo().window(next);
	        WebElement ele1 = driver.findElement(By.xpath("//span[.='APPLE iPhone 13 (Starlight, 128 GB)']"));
	        String t=ele1.getText();
	        System.out.println(t);
	        
	}

}
