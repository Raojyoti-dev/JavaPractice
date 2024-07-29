package ExceptionHandling;

import java.util.Scanner;

public class MultipleTryCatchBlock {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String s=null;
		
		try {
			
			System.out.println(s.length());
		}
		/*catch(NullPointerException e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}*/
		catch(Exception e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		
				
	}

}
