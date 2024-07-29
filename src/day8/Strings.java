package day8;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		
		/*String s="Hello World";
		System.out.println(s.length());
		
		String name="Jyoti";
		System.out.println("Jyoti".length());*/
		
		
		/*String s1="Hello ";
		String s2=" Welcome ";
		String s3=" to Java";
		
//		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2+s3);*/
		
		/*String a="  abc  ";
		System.out.println(a);
		System.out.println(a.trim());*/
		
		/*String str="Welcome";
		String str2="elce";
		
		System.out.println(str.contains(str2));*/
		
		/*String s1="Welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));*/
		
		/*String s="welcome to selenium";
//		System.out.println(s.replace('l','m' ));
		System.out.println(s.replace("selenium","cypress"));*/
		
		/*String s="welcome";
		System.out.println(s.substring(1,3));*/
		
		/*String s="jyoti";
		System.out.println(s.toUpperCase());
		String s2="SHIVA";
		System.out.println(s2.toLowerCase());*/
		
		/*String name="jyoti@gmail.com";
		String arr[]=name.split("@");
		System.out.println(arr[0]);
		System.out.println(arr[1]);*/
		
		/*String amount="$15,20,55";
		System.out.println(amount.replace("$","").replace(",",""));*/
		
		String s="abc,123@xyz";
		
		String arr[]=s.split(",");
		System.out.println(Arrays.toString(arr));
		String arr1[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		
		
		
		
		
		 
	}

}
