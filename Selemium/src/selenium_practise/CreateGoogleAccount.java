package selenium_practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGoogleAccount {
    public static void main(String[] args) {

        // Set the path for the ChromeDriver executable file
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Navigate to the Google account creation page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        // Enter the first name
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Vishwajit");

        // Enter the last name
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("TD");

        // Enter the username
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("JeetQA23");

        // Enter the password
        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys("Jeet@748266");

        // Confirm the password
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
        confirmPassword.sendKeys("Jeet@662847");

        // Click on the Next button
        WebElement nextButton = driver.findElement(By.id("accountDetailsNext"));
        nextButton.click();

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));

        // Enter the phone number
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='tel']"));
        phoneNumber.sendKeys("9650933717");

        // Click on the Next button
        WebElement nextButton2 = driver.findElement(By.xpath("//span[.='Next']"));
        nextButton2.click();

        // Wait for the page to load
        WebElement verifyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("code")));

        // Enter the verification code (sent to the phone number)
        WebElement verificationCode = driver.findElement(By.name("code"));
        verificationCode.sendKeys("123456");

        // Click on the Verify button
        WebElement verifyButton = driver.findElement(By.xpath("//span[.='Next']"));
        verifyButton.click();

        // Close the browser
        driver.quit();
    }
}
