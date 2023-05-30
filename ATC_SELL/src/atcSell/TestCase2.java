package atcSell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends Generic123 {

	@Test
	public void createAcc() {// Click on the "Continue with Google" button
        WebElement continueWithGoogleBtn = driver.findElement(By.xpath("//span[.='Log in with Google']"));
        continueWithGoogleBtn.click();
        
       

}
	@Test
	public void fetchTitle() {
		WebElement continueWithGoogleBtn = driver.findElement(By.xpath("//span[.='Log in with Google']"));
        continueWithGoogleBtn.click();
	 System.out.println(driver.getTitle());
	 Assert.fail();
	 //need to revise
	 //sdfsdfsdf
	

}
	


}
