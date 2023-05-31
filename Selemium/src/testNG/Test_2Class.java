package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_2Class extends GenericScrpit_TwoClass {
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
	 Assert.fail();
	

}
	

}
