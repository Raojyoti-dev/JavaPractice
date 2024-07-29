package FinalKeyword;

class test1{
	
	final void method1() {
		System.out.println("this is method1");
	}
}

class test2 extends test1{
	
	//this method1 cant be ovveriden as it is final method in parent
	/*void method1() {
		System.out.println("this is overrident method");
	}*/
}

public class FinalKeyword_Methods {

	public static void main(String[] args) {
		
		

	}

}
