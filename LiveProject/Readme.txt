Made ExtentManager class in main/java
one way was to make ExtentManager class and have all call its method by importing the class and each test have their own before and after methods but each test had to write code for doing the same thing. 
So I will make a TestBase class in the src/test/java dir  testbase package
this class will have the common functions of BeforeMethod and aftermethod in it from each test and have 
the test extend the testbase class to have access to its before and after method. 

all classes will extend this TestBase class so the report object can be made for each test from that before and after method.
In the BeforeMethod, if we pass an argument of ITestResult, it can be used to retrieve the calling method name.
we will make Extentreport and ExentTest objects public so they can be used by all the inheriting classes. 
result.getMethod().getMethodName() will give the name of @Test.
so when we create test, we can create it with this method name.
we can also create a public void log method which will print on console as well as in the reports the message that is passed as argument. 
to make testng files, make it in the project base first n then move all into src/test/resources


DataProvider addition
make a class as DataProvider class with a static method that reads n returns data from a file or just provides the data to the @Test method
the method takes an argument Method m)
In the @Test make the argument declaration for each of column parameters.
public void test(String usernm,String pswd){}
 As an argument to @Test provide the name of the 
@Test(dataProviderClass=dataprovider.class ,dataProvider="methodname returning data")
testng.xml--> Run as TestngSuite

The outcome is two sets of data report for each test as we run dataprovider for two rows of data[][], 
with each row it outputs report.
so total 8 test results for 4 test classes. each time the test runs for each set of row, it calls the 
BeforeMethod and AfterMethod and a new report object is created each time. 


Listener
Make a listener package in test/java
<listeners>
	   <listener class-name="listener.MyTestngListener"/>
</listeners>
Add in testng.xml after suite tag
run testng from pom.xml(no quotes for the file name)
<suiteXmlFiles>
			<suiteXmlFile>src/test/resources/testng.xml</suiteXmlFile>
</suiteXmlFiles>

