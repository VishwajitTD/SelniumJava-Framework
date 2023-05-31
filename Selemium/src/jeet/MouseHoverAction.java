package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[.='✕']")).click();
Thread.sleep(2000);
WebElement ele =driver.findElement(By.xpath("(//div[.='Fashion'])[4]"));//////div[.='Fashion' and @ class='xtXmba']
Thread.sleep(2000);
Actions act=new Actions(driver);
Thread.sleep(2000);
act.moveToElement(ele).perform();
Thread.sleep(2000);
driver.close();


	}

}
