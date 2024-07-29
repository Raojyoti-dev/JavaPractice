package day7;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {
		
	/*	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		System.out.println(num);*/
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a double number:");
		
		double num=sc.nextDouble();
		
		System.out.println(num);*/
		
		/*Scanner sc=new Scanner(System.in); 
		
		System.out.println("enter your name: ");
		
		String name=sc.next();
		
		System.out.println("the name is :"+name);*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter you name:");
		
		String name=sc.next();
		
		System.out.println("What is you age:");
		
		int age=sc.nextInt();
		
		System.out.println("the name is:"+name+"and the age is: "+age);
		
		System.out.println("Enter unknown value:");
		
		Object val=sc.next();
		
		System.out.println(val);
		
		
		
		
	}

}
