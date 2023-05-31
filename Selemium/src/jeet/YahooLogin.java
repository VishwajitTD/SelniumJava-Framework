package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {
    
    public static void main(String[] args) throws InterruptedException {
        
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the Yahoo login page
        driver.get("https://login.yahoo.com");
        
        // Find the email input field and enter the email address
        //WebElement emailInput = driver.findElement(By.id("login-username"));
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username'][1]"));
        usernameInput.sendKeys("vishwajitdongle@gmail.com");
        
        // Click the "Next" button to go to the password page
        WebElement nextButton = driver.findElement(By.id("login-signin"));
        nextButton.click();
        
        // Wait for the password input field to appear
        Thread.sleep(2000);
        
        // Find the password input field and enter the password
        //WebElement passwordInput = driver.findElement(By.id("login-passwd"));
        
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='login-passwd']"));

        passwordInput.sendKeys("Jeet@662847");
        
        // Click the "Sign In" button to login
        WebElement loginButton = driver.findElement(By.id("login-signin"));
        loginButton.click();
        
        // Wait for the account page to load
        Thread.sleep(5000);
        
        // Close the browser
        driver.quit();
    }
}
