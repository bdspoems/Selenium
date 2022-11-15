
public class PassbyValueOrReference {
	int x=100;//global vars
	int y=100;
	public static void main(String[] args) {
		PassbyValueOrReference p = new PassbyValueOrReference();
		System.out.println(p.x+"--"+p.y);
		p.increment(p.x,p.y,100);
		System.out.println(p.x+"--"+p.y);
		p.incrementbyvalue(p.x,p.y,100);
		System.out.println(p.x+"--"+p.y);
		p.increment(p,100);
		System.out.println(p.x+"--"+p.y);
		
	}
     public void increment(int a,int b,int inc)
     {
    	 x=a+inc;//this increments value of the global vars
    	 y=b+inc;
    	 
     }
     public void incrementbyvalue(int a,int b,int inc)
     {
    	 a=a+inc;//this increments value of the local vars
    	 b=b+inc;//even if the passed value is the objects ref
    	 //becoz p.incrementbyvalue(p.x,p.y,100);will pass value of x and y 
    	 //into a and b and then value of a n b will be incremented
    	 //if we change this.x = a+inc then it will update the global ref var's value
     }
     public void increment(PassbyValueOrReference point,int inc)
     {
    	 point.x= point.x +inc;//this increments value of the global vars of this ref object
    	 point.y= point.y +inc;
    	 
     }
}
