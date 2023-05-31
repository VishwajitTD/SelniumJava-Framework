package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillFormExample {

    public static void main(String[] args) {

     
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver32.exe");

       
        WebDriver driver = new ChromeDriver();

       
        driver.get("http://www.uitestpractice.com/Students/Form");

        // Find the input fields and fill them with data
        WebElement firstNameField = driver.findElement(By.id("firstname"));
        firstNameField.sendKeys("Jeet");

        WebElement lastNameField = driver.findElement(By.id("lastname"));
        lastNameField.sendKeys("D");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("jeet123@example.com");

        WebElement phoneField = driver.findElement(By.id("phone"));
        phoneField.sendKeys("1234567890");

        WebElement addressField = driver.findElement(By.id("address"));
        addressField.sendKeys("123 Main St");

        WebElement cityField = driver.findElement(By.id("city"));
        cityField.sendKeys("Anytown");

        WebElement stateField = driver.findElement(By.id("state"));
        stateField.sendKeys("CA");

        WebElement zipField = driver.findElement(By.id("zip"));
        zipField.sendKeys("12345");

        // Find the submit button and click it
        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        // Close the browser
        driver.quit();
    }
}

