package selenium_practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChessDotComLogin {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the Chess.com login page
        driver.get("https://www.chess.com/login");

        // Click on the "Continue with Google" button
        WebElement continueWithGoogleBtn = driver.findElement(By.xpath("//span[.='Log in with Google']"));
        continueWithGoogleBtn.click();

        // Switch to the Google sign-in window
        String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        // Enter the email address and password for the Google account
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("vishwajitdongle@gmail.com");
        WebElement nextButton = driver.findElement(By.xpath("//span[.='Next']"));
        nextButton.click();
        WebElement passwordField = driver.findElement(By.xpath("input[name='password']"));
        passwordField.sendKeys("");
        WebElement passwordNextButton = driver.findElement(By.xpath("//span[.='Forgot password?']"));
        passwordNextButton.click();

        // Switch back to the Chess.com window and wait for login
        driver.switchTo().window(parentWindowHandle);
        WebElement loggedInUser = driver.findElement(By.cssSelector("div.logged-in-user span.username"));
        while (!loggedInUser.getText().equals("your_chess.com_username")) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print a success message and close the browser
        System.out.println("Logged in successfully!");
        driver.quit();
    }
}
