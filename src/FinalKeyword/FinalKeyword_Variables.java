package FinalKeyword;

class test{
	
	final int a=101;
}

public class FinalKeyword_Variables {
	
	

	public static void main(String[] args) {
		
		test t=new test();
		System.out.println(t.a);
		//t.a=110;//value can tbe changed as the variable is final

	}

}
