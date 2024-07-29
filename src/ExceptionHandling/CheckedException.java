package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		//handling using try catch block
		/*System.out.println("Program has been started.");
		System.out.println("Program is in progress.");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program has been finished.");
		System.out.println("Program has been existed.");

	}*/
		
		//hnadling using throws keyword, we can throw multiple exceptions using throws keyword
		System.out.println("Program has been started.");
		System.out.println("Program is in progress.");
		
		//InterruptedException
		Thread.sleep(5000);
		
		
		System.out.println("Program has been finished.");
		
		System.out.println("Program has been existed.");
		
		//FilenotFound Exception
		FileInputStream file=new FileInputStream("C:\\text.txt");
	}

}

