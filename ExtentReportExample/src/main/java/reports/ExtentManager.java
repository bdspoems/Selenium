package reports;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager<ExtentSparkReports> {
	static ExtentReports report;
	
	@Test
	public static ExtentReports getReportObject()
	{
		if(report == null)
		{
			report = new ExtentReports();
			String path = System.getProperty("user.dir")+"//dailyreports";
			Date d = new Date();
			
			String reportFolderPath = path+"//"+d.toString().replaceAll(":","-");
			String screenshotPath =reportFolderPath+"//screenshot";
			File f = new File(screenshotPath);
			f.mkdirs();
		    ExtentSparkReporter reporter =new ExtentSparkReporter(reportFolderPath);
		    reporter.config().setReportName("Automation Report");
		    reporter.config().setTheme(Theme.DARK);
		    reporter.config().setDocumentTitle("Test Details");
		    reporter.config().setEncoding("utf-8");
		    report.attachReporter(reporter);
		}//if
		return report;
	}

}
