package jeet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericPhoto {

	public static void getPhoto(WebDriver driver) throws IOException {
		String photo="./photo/";
		java.util.Date d= new java.util.Date();
		String d1=d.toString();
		String d2 =d1.replaceAll(":", "-");
		System.out.println(d2);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst);
		driver.close();

}}
