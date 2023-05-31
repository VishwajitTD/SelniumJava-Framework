package jeet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginAndPurchase {

   public static void main(String[] args) throws InterruptedException {
      // Set the webdriver.chrome.driver property to the location of the chromedriver executable
      System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");

      // Create a new ChromeDriver instance
      WebDriver driver = new ChromeDriver();

      // Navigate to FlipKart
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      // Close the login popUp if it's displayed
      try {
          WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
          closeButton.click();
      } catch (Exception e) {
          System.out.println("Login popup not found, continuing...");
      }

      // Enter login credentials and submit the form
      WebElement loginButton = driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
      loginButton.click();

      WebElement usernameField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
      WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
      WebElement submitButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

      usernameField.sendKeys("9650933717");
      passwordField.sendKeys("123546798");
      submitButton.click();

      // Search for mobile phones
      WebElement searchBox = driver.findElement(By.name("q"));
      searchBox.sendKeys("Apple mobile");
      searchBox.submit();

      // Select the first search result and add it to the cart
      WebElement firstResult = driver.findElement(By.xpath("//div[@class='_2kHMtA']//a[@class='_1fQZEK']"));
      firstResult.click();

      // Switch to the new window that opens after clicking on the first result
      for(String windowHandle : driver.getWindowHandles()) {
          driver.switchTo().window(windowHandle);
      }

      WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
      addToCartButton.click();

      // Proceed to checkout
      WebElement cartIcon = driver.findElement(By.xpath("//a[@class='_3ko_Ud']"));
      cartIcon.click();

      WebElement checkoutButton = driver.findElement(By.xpath("//button[text()='Place Order']"));
      checkoutButton.click();

      // Wait for the payment page to load
      Thread.sleep(5000);

      // Close the browser
      driver.quit();
   }
}
