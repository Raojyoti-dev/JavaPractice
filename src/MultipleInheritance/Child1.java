package MultipleInheritance;

//this is also hybrid inheritance(Hirarchial+Multiple) as along with interfaces class is extending another class. If class ONLY IMPLEMENTS interfaces then it is multiple inheritance
public class Child1 extends Child implements Interface1,Interface2{
	
	public void m1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Child1 ch=new Child1();
		ch.m1();
		ch.m2();
		ch.m3();
		
		Interface1 ch1=new Child1();
		ch1.m1();
		//ch1.m2();//result into error as this method is not defined here
		
		
	}

}
