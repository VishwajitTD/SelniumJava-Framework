package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BurrowTest1 extends GenericScript {
	@Test
	public void fetchTitle() {
	driver.findElement(By.id("bx-close-inside-2181210")).click();
	 driver.findElement(By.xpath("(//div[.='Free Swatches'])[1]")).click();
	 System.out.println(driver.getTitle());;
	

}
	@Test
	public void fetchTitle2() {
	driver.findElement(By.id("bx-close-inside-2181210")).click();
	 driver.findElement(By.xpath("(//div[.='Showrooms'])[1]")).click();
	 System.out.println(driver.getTitle());;
	

}
}
