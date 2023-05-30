package testSuite;

import org.testng.annotations.Test;
import generic_Script.Base_Test;
import generic_Script.GetData;
import pom_Script.POM1;

public class SignupTest extends Base_Test {
    @Test
    public void signUpTestCase() {
        // Create an instance of the POM_SignuUP class
    	POM1 signUpPage = new POM1(driver);

        // Retrieve test data from Excel using the GetData class
        String firstName = GetData.getData("Sheet1", 1, 0);
        String lastName = GetData.getData("Sheet1", 1, 1);
        String email = GetData.getData("Sheet1", 1, 2);
        String password = GetData.getData("Sheet1", 1, 3);
        String cnfPassword = GetData.getData("Sheet1", 1, 4);

        // Perform actions on the signup page using the POM methods
       try {
    	   signUpPage.createAccCLick();
           Thread.sleep(2000);
           signUpPage.enterFirstName(firstName);
           Thread.sleep(2000);
           signUpPage.enterLastName(lastName);
           Thread.sleep(2000);
           signUpPage.enterEmailId(email);
           Thread.sleep(2000);
           signUpPage.enterPassword(password);
           Thread.sleep(2000);
           signUpPage.confirmPassword(cnfPassword);
           Thread.sleep(2000);
           signUpPage.submitCreateAcc();
           Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}

       // getPhoto();
    }
}
