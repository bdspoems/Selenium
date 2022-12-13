created a class with ExtentReports, ExtentSparkReporter in a separate src.main.java folder under reportclass package.
imported the ExtentManager class in this class. made a @BeforeMethod in a class in testcases package in src.test.java , creating a report object by calling the ExtentMager's makeReport method. 
then created a @Test to log info for the reports creating test object.
In #AfterMethod, reports.flush to generate reports
a test-output dir is created when proj refreshed.it has index.html report file which is the normal testng report. 
Another report due to ExtentReport is generated in reports folder that was created by sparkreporter. It has detailed logs.
had written statements to fail the test. 
It creates reports index.html in the foldername as date stamp in reports folder hence all iterations of report are saved and not overwritten