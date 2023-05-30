package testSuite;

import org.testng.annotations.Test;

import generic_Script.Base_Test;
import generic_Script.GetData;
import pom_Script.POM1;

public class SignIn extends Base_Test {
@Test (priority = 0)
public static void signIn() {
	POM1 p= new POM1(driver);
	try {
		p.signInAcc();
		Thread.sleep(2000);
		p.enterEmailForSignIn(GetData.getData("Sheet1", 1, 2));
		Thread.sleep(2000);
		p.enterPasswordForSignIn(GetData.getData("Sheet1", 1, 3));
		Thread.sleep(2000);
		p.submitSignInAcc();
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
}


}
