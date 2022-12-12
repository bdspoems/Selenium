package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MytestngListener implements ITestListener {

	
	
	public void onStart​(ITestContext context) {
		System.out.println(context.getName()+" Test started ");
	}
	
	public void onFinish​(ITestContext context) {
		System.out.println(context.getName()+" Test done at "+context.getEndDate());
	}

	public void onTestSuccess​(ITestResult result) {
		System.out.println(result.getName()+" passed successfully");
	}
	
	
	public void onTestFailure​(ITestResult result){
		System.out.println(result.getName()+" failed");
	}
	
	public void onTestSkipped​(ITestResult result){
		System.out.println(result.getName()+" has been skipped");
	}
	
	
}
