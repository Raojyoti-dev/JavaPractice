package day11;

public class GreetingsMainClass {

	public static void main(String[] args) {
		
		Greetings g1=new Greetings();
		
		g1.method1();
		String str=g1.method2();
		System.out.println(str);
		g1.method3("jyoti");
		int str2=g1.method4(25);
		System.out.println(str2);
		

	}

}
