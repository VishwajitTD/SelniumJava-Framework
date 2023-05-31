package selenium_practise;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraExplic {

	public static void main(String[] args){
System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        driver.findElement(By.xpath("//a[.='Women']")).click();
        WebDriverWait wait= new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Women"));
        driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/w_89,c_limit,fl_progressive,dpr_2.0/assets/images/2023/5/5/8c388bd0-4a79-4823-ac36-b74a996938551683271841448-Best_of_Western_Wear_from_Vero_Moda-_M-S_-_more_-50-80.png']")).click();
      
        WebDriverWait wait1= new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.titleContains("West"));
        driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/19259884/2022/7/26/c093f927-3cc6-4347-90b4-85b8089fd3a31658839615457Jeans1.jpg']")).click();
       
       Set<String> windows = driver.getWindowHandles();
       ArrayList<String> allWIndows = new ArrayList<String>(windows);
       
       for (String wh : allWIndows) {
    	   
    	 
    	  String t= driver.getTitle();
    	   System.out.println(t);
    	   String pagT="Western Wear For Women - Buy Westernwear For Ladies Online - Myntra";
           
           if(pagT.contains(t))
        	   
           {driver.switchTo().window(wh);}
    	   
	} 
       
       driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
      
        driver.findElement(By.xpath("//div[@class='size-buttons-size-buttons-error size-buttons-size-buttons']/div[1]/div[1]")).click();
       
       
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();

	}

}
