package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyMessage {
String mesg="Hello!";
MyMessagePrinter msgclass = new MyMessagePrinter("Hello!");

@Test
public void printt()
{
	System.out.println(mesg);
	System.out.println(msgclass.printMsg());
}
	
    @Test
	public void validate()
	{
		Assert.assertEquals(msgclass.printMsg(), mesg);
	}
}
