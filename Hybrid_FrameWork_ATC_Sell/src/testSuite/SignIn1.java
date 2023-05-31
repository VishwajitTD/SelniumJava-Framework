package testSuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Script.Base_Test;
import pom_Script.POM1;

public class SignIn1 extends Base_Test {
@Test (dataProvider = "testdata")
public static void signIn(String email, String password) {
	POM1 p= new POM1(driver);
	try {
		p.signInAcc();
		Thread.sleep(2000);
		p.enterEmailForSignIn(email);
		Thread.sleep(2000);
		p.enterPasswordForSignIn(password);
		Thread.sleep(2000);
		p.submitSignInAcc();
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
}

	
@DataProvider(name="testdata")
	public Object[][] createData1(){
		return new Object[][] {
			{
				"vishalawadhoot@gmail.com" ,"Vishal@12345"}
		};
	}
}

