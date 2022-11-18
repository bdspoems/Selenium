package reflectionDemo;

import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) throws Exception{
		
			String operation= "add";//this is the method name that he wants to call
			int x= 100;
			int y= 20; //vars to feed arguments to the method call
			
			operations op = new operations();
		    Method m = op.getClass().getMethod(operation,int.class,int.class);//we could have n number of args
			m.invoke(op,x,y); //invoke the method from this class op with x,y as arguments
			}//main


	}//class


