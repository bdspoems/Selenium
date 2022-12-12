package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	/**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
	   * and calling all their Configuration methods.
	   */
	  public void onStart(ITestContext context) {
		  System.out.println(context.getName()+" Test started ");
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
	   * and all their Configuration methods have been called.
	   */
	  public void onFinish(ITestContext context) {
		  System.out.println(context.getName()+" Test done at "+context.getEndDate());

	  }
	  public void onTestSuccess(ITestResult result)
	  {
		  System.out.println(result.getName()+" passed successfully");
	  }
	  public void onTestFailure(ITestResult result)
	  {
		  System.out.println(result.getName()+" failed");
	  }
	  public void onTestSkipped(ITestResult result)
	  {
		  System.out.println(result.getName()+" has been skipped");
	  }
	  
	 
	
}
