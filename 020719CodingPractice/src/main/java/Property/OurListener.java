package Property;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class OurListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("my test start");
	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("my test successful" +result.getStatus());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("my test failed "+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("my test skipped"+ result.getTestName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("my test Test Failed But Within Success Percentage"result.getTestName());
	}

	public void onStart(ITestContext context) {
		System.out.println("my test started");
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("my test finished");
	}

}
