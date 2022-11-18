interface Age{
	int x=10;;
	public void getAge();
}
public class ConstructorForInitialising {
	//constructor usage for initialising variables
	//Inner class initialising demo
	
  public class Bank{
	  String name;
	  int amount;
	  String acType;
	  public Bank(String nm,int amt,String ac) {
		  name=nm;
		  amount = amt;
		  acType= ac;
		  
	  }
	  
  }
  static class Client{
	  
	  String name;
	  int acNum;
	  public Client(String name,int acNum)
	  {
		  this.name = name;
		  this.acNum=acNum;
	  }
  }
	public static void main(String[] args) {
		ConstructorForInitialising c = new ConstructorForInitialising();
		ConstructorForInitialising.Bank bank = c.new Bank("Federal",1000,"savings");
		ConstructorForInitialising.Client cl = new ConstructorForInitialising.Client("Mr.Atule",21482345);
		System.out.println(bank.name+".."+bank.amount+".."+bank.acType);
		System.out.println("The Client record is: "+cl.name+"--"+cl.acNum);
		// Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {
           
            @Override public void getAge()
            {
                // printing  age
                System.out.print("Age is " + x);
            }
        };
       
        oj1.getAge();
	}

}

//note: if you press cmd n mousepad, the word will become a link 
//n take u to the implementation or declaration
// when you double click in front of a code line, it puts a breakpoint 
//and you can run your code by holding down fn + clicking F6 to go to the 
//next line and see each lines execution in the perspective window


