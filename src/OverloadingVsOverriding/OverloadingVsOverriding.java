package OverloadingVsOverriding;

//Overriding only possible in inheritance but overloading can possible in inheritance 
//as well as with out inheritance in single class as well

class ABC{
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b*b);
	}
}

class XYZ extends ABC{
	
	//overriding
	void m1(int a) {
		System.out.println(a*a);
	}
	
	//overloading
	void m2(int a, int b) {
		System.out.println(a+b);
	}
	
}
public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		XYZ xyzobj=new XYZ();
		xyzobj.m1(2);
		xyzobj.m2(10);
		xyzobj.m2(2, 3);
		
	}

}
