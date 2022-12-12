package testclass;

public class MyMessagePrinter {
private String message;
	
	public MyMessagePrinter(String message)
	{
		this.message = message;
	}
	
	public String printMsg()
	{
		System.out.println("In printMsg "+message);
		return message;
	}
	
}
