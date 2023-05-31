package jeet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateYahooAccount {
    
    public static void main(String[] args) throws InterruptedException {
        
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the Yahoo registration page
        driver.get("https://login.yahoo.com/account/create");
        
        // Fill in the registration form with your details
        WebElement firstNameInput = driver.findElement(By.id("usernamereg-firstName"));
        firstNameInput.sendKeys("Vishwajit");
        
        WebElement lastNameInput = driver.findElement(By.id("usernamereg-lastName"));
        lastNameInput.sendKeys("TD");
        
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='usernamereg-userId'])"));
        emailInput.sendKeys("vishwajitdongle");
        
        WebElement passwordInput = driver.findElement(By.id("usernamereg-password"));
        passwordInput.sendKeys("Jeet@662847");
        
        WebElement phoneInput = driver.findElement(By.id("usernamereg-phone"));
        phoneInput.sendKeys("9650933717");
        
        
        
        // Click the "Continue" button to submit the form
        WebElement continueButton = driver.findElement(By.id("reg-submit-button"));
        continueButton.click();
        
        // Wait for the confirmation page to load
        Thread.sleep(5000);
        
        // Close the browser
        driver.quit();
    }
}
