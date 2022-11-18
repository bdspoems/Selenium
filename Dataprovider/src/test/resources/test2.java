
public class test2 {
	
	
	@Test(dataProvider="getData")
	public void test2(String user, String pwd)
	{
		System.out.println("Starting test 2");
		Thread.sleep(1000);
		System.out.println("Ending test 2");
		System.out.println("2. "+user +"\n"+pwd);
}
