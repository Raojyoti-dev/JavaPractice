package SuperKeyword;

class test5{
	
	String color="white";
	
	void eat() {
		System.out.println("eat something..");
	}
	
}

class test6 extends test5{
	
	 String color="black";
	 
	 void displayColor() {
		 System.out.println(super.color);
	 }
	 
	 void eat() {
		
		// System.out.println("eat banana");
		 super.eat();
	 }
	
}

public class SuperKeyword_variable {
		
				
}
