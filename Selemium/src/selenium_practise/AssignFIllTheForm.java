package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFIllTheForm {

    public static void main(String[] args) throws InterruptedException {

       
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("http://www.uitestpractice.com/Students/Form");

        WebElement firstNameField = driver.findElement(By.id("firstname"));
        firstNameField.sendKeys("Jeet");

        WebElement lastNameField = driver.findElement(By.id("lastname"));
        lastNameField.sendKeys("D");
        Thread.sleep(1000);
        WebElement MartialStatus = driver.findElement(By.xpath("//label[.='Martial Status:']/../label[3]/input[@name='optradio']"));
        MartialStatus.click();
        Thread.sleep(1000);
        WebElement Hobby = driver.findElement(By.xpath("//label[.='Hobby :']/../label[3]/input[@type='checkbox']"));
        Hobby.click();
        Thread.sleep(1000);
      
        WebElement Country = driver.findElement(By.xpath("//option[.='India']"));
        Country.click();
        
        Thread.sleep(1000);
        WebElement DateOfBirth = driver.findElement(By.xpath("//input[@placeholder='Enter Date of birth']"));
        DateOfBirth.sendKeys("08/16/1991");
        Thread.sleep(1000);
        WebElement phoneField = driver.findElement(By.xpath("//input[@id='phonenumber']"));
        phoneField.sendKeys("9650933717");
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']"));
        emailField.sendKeys("jeetd@gmail.com");
        Thread.sleep(1000);
      
        WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Enter UserName']"));
        UserName.sendKeys("Jeet_TD");
        Thread.sleep(1000);
        
        WebElement aboutYourself = driver.findElement(By.xpath("//textarea[@data-original-title='Plz write about your self...!']"));
        aboutYourself.sendKeys("I am an Automation Enginner");

        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Jeet@123");
        Thread.sleep(1000);
        WebElement submitButton = driver.findElement(By.xpath("//button[.='Submit']"));
        submitButton.click();

        Thread.sleep(5000);
        
        driver.close();
    }
}
