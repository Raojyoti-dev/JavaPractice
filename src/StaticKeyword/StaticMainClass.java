package StaticKeyword;

public class StaticMainClass {

	public static void main(String[] args) {
		
		System.out.println(StaticKeyword.a);
		StaticKeyword.m1();
		
		StaticKeyword st=new StaticKeyword();
		System.out.println(st.b);
		st.m2();
		
		StaticKeyword st2=new StaticKeyword();
		st2.m();
		
		
	

	}
}