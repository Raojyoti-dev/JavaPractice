package day9;

public class ReverseAString {

	public static void main(String[] args) {
		
	/*	String s="welcome";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		/*String s="welcome";
		
		String rev="";
		
		char arr[]=s.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i];
		}
		
		System.out.println(rev);*/
		
		
		/*StringBuffer str=new StringBuffer("welcome");
		System.out.println(str.reverse());
		
		StringBuilder str2=new StringBuilder("jyoti");
		System.out.println(str2.reverse());*/
		
		String s="welcome";
		s.concat("to java");
		System.out.println(s);
		
		StringBuffer str=new StringBuffer("welcome");
		str.append("to java");
		System.out.println(str);
		
		StringBuilder str2=new StringBuilder("Welcome");
		str2.append("to cypress");
		System.out.println(str2);
		
		
	}

}
