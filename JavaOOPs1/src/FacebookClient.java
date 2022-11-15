
public class FacebookClient {
	//static vars are owned by the class and not by the object which is created using new 
	//static can be called in non static functions but non static cant be called in static func
	//there is a single copy of the static vars and funcs and stored not with the created object but somewhere else in memory
	//obj reference vars are just pointers and they can be changed to point any other object. then the one which lost the reference will be garbage collected
	//main func:
	    // so we can access the class directly withouteven creating the object and once we access the class static funcs 
	        //we can create the object in that func and access all non static things
        //
	public static void main(String[] args) {
		FacebookPage fb1= new FacebookPage();
		fb1.name = "Homepage";
		fb1.views= 1000;
		
		FacebookPage.owner = "Mark";
		System.out.println(fb1.name+"===="+FacebookPage.owner);
		fb1.printViews();
		FacebookPage fb2= new FacebookPage();
		fb2.name = "Settingspage";
		fb2.views= 2000;
		System.out.println("fb2:  "+fb2.name+FacebookPage.owner);
		fb2.printViews();
		fb1=fb2;//now fb1 points to fb2 object
		System.out.println("fb1:  "+fb1.name+"===="+fb1.views+"----"+FacebookPage.owner);
		FacebookPage.printOwner();		
	}

}
