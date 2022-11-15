
public class FacebookPage {

	
	String name;
	int views;
	static String owner;
	
	public static void printOwner()
	{
		System.out.println("Owner of Fb is "+owner);
	}
	public void printViews()
	{
		System.out.println("This "+name+" has "+views+" views");
	}
}
