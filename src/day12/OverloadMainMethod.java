package day12;

public class OverloadMainMethod {
	
	void main(int x) {
		System.out.println(x);
	}
	
	void main(String name) {
		System.out.println(name);
	}
	
	void main(String name1,String name2) {
		System.out.println(name1+" "+name2);
	}
	
	
	public static void main(String[] args) {
		
		OverloadMainMethod ov=new OverloadMainMethod();
		ov.main(5);
		ov.main("jyoti");
		ov.main("Jyoti","Shiva");
		
	}

}
