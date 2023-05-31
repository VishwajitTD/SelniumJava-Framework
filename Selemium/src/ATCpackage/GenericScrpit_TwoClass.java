package ATCpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenericScrpit_TwoClass extends Generic_1 {
	
		@Test
		public void fetchTitle() {
		driver.findElement(By.id("bx-close-inside-2181210")).click();
		 WebElement ele = driver.findElement(By.xpath("(//div[.='Free Swatches'])[1]"));
		ele .click();
		 System.out.println(driver.getTitle());

	}
		@Test
		public void fetchTitle2() {
		driver.findElement(By.id("bx-close-inside-2181210")).click();
		 WebElement ele = driver.findElement(By.xpath("(//div[.='Showrooms'])[1]"));
				ele .click();
		 System.out.println(driver.getTitle());
		 
		

	}
	

}
