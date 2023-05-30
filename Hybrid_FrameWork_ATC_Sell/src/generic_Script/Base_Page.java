package generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
	
	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
