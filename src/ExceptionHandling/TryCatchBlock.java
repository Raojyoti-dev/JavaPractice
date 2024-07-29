package ExceptionHandling;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Program has been started..");
		System.out.println("Enter a number:");
		//try is surrounding the codes which are expected to throw error
		try {
			int num=sc.nextInt();
			System.out.println(100/num);
			
		}catch(ArithmeticException e) {
			//user defined error message and e is obj ref variable and exception name should be mentioned in the catch block
			System.out.println("Invalid data");
		}
		System.out.println("Program has been stopped...");
		
		

	}

}
