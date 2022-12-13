package reportclass;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentReports reports;
	//ExtentSparkReporter reporter;
	

		
		public static ExtentReports makeReport(){
			if(reports == null)
			{
				reports = new ExtentReports();
				Date d = new Date();
				String path = System.getProperty("user.dir")+"/reports/"+d.toString().replaceAll(":", "-");
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				reporter.config().setReportName("Extent Report for ExtentReportProject");
				reporter.config().setDocumentTitle("Test Result");
				reporter.config().setTheme(Theme.STANDARD);
				reporter.config().setEncoding("utf-8");
				
				reports.attachReporter(reporter);
			}
			return reports;
			//test= reports.createTest("LoginTest");
		}
		
		
}
