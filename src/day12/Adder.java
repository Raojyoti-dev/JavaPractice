package day12;

public class Adder {
	
	int x=10;
	int y=20;
	
	//Method overloading
	
	public void sum() {
		System.out.println(x+y);
	}
	
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(double a,int b) {
		System.out.println(a+b);
	}
	
	void sum(int b,double a) {
		System.out.println(a+b);
	}
	
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	

}
