package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String s=null;
		try {
			System.out.println(s.length());
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("You entered finally block");
		}
		
		
	}

}
