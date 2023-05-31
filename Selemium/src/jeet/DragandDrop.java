package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src=driver.findElement
		(By.xpath("//div[@id='box6']"));
		WebElement dst=driver.findElement
		(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		WebElement src1=driver.findElement
				(By.xpath("//div[@id='box3']"));
		WebElement dst1=driver.findElement
				(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(src1, dst1).perform();
		WebElement src2=driver.findElement
				(By.xpath("//div[@id='box1']"));
		WebElement dst2=driver.findElement
				(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(src1, dst1).perform();
		WebElement src3=driver.findElement
				(By.xpath("//div[@id='box2']"));
		WebElement dst3=driver.findElement
				(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(src1, dst1).perform();
		WebElement src4=driver.findElement
				(By.xpath("//div[@id='box4']"));
		WebElement dst4=driver.findElement
				(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(src1, dst1).perform();
		WebElement src5=driver.findElement
				(By.xpath("//div[@id='box5']"));
		WebElement dst5=driver.findElement
				(By.xpath("//div[@id='box105']"));
		WebElement src6=driver.findElement
				(By.xpath("//div[@id='box7']"));
		WebElement dst6=driver.findElement
				(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(src2, dst2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, dst3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, dst4).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src5, dst5).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src6, dst6).perform();
		Thread.sleep(2000);
		driver.close();
		

	}

}
