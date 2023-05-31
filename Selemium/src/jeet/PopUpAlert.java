package jeet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        driver.findElement(By.name("cusid")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
        Thread.sleep(2000);
        String t=a.getText();
        System.out.println(t);
        Thread.sleep(2000);
        a.dismiss();
        a.accept();
        driver.close();
        
	}

}
