package day7;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInputFromUserForArray {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter a num:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
