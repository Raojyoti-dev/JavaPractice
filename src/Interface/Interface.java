package Interface;

interface Shape{
	
	int length=10;
	int width=20;
	
	//in interface access modifier is by default public
	//Abstarct method
	void rectangle();
	
	//default method
	default void circle() {
		System.out.println("this is a circle method");
	}
	
	//static method
	static void square() {
		System.out.println("this is square method");
	}
	
}


public class Interface implements Shape{
	
	//Implementing Abstract method
	//in class access modifier is by default, default hence making method as public explicitely cause higher access modifier(public) cant be reduced to lower i. e default
	public void rectangle(){
		System.out.println("this is a implemented method of Abstract method");
	}
	
	//user defined method of class itself not derived from interface
	void triangle() {
		System.out.println("this is a triangle");
	}

	public static void main(String[] args) {
		
		//Scenario 1
		Interface obj=new Interface(); //Class variable and class object
		obj.circle();
		obj.rectangle();
		Shape.square();  //As square method is static so no obj is needed but as it is derived from interface so interface name is required.
		obj.triangle();
		
		//Scenario 2 
		Shape obj2=new Interface(); //reference variable of interface and class object
		obj2.circle();
		obj2.rectangle();
		
		Shape.square();
		//obj2.triangle();// this user defined method of class cant be accessed by shape reference obj as , method is not defined in interface
		
		
		//accessing static varibales  directly using Interface(Shapename)
		System.out.println(Shape.length*Shape.width);
	}

}
