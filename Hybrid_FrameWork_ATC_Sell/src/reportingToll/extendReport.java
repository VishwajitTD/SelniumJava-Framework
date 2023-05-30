package reportingToll;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extendReport {
	@Test
	public void test1() {
		ExtentReports reports= new ExtentReports("./REP/r1.html");
		ExtentTest test=reports.startTest("tc1");
		test.log(LogStatus.PASS,"PASS");
		test.log(LogStatus.FAIL,"fail");
		test.log(LogStatus.SKIP,"skip");
		reports.endTest(test);
		reports.flush();
	}

}
