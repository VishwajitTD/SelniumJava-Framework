package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc passed");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("tc passed");
	}
	

}
