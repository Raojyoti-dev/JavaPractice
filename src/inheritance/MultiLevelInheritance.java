package inheritance;

class MN{
	
	int a;
	
	void display() {
		System.out.println(a);
	}
}

class XZ extends MN{
	
	int b;
	
	void show() {
		System.out.println(b);
	}
}

class C extends XZ{
	
	int c;
	
	void print() {
		System.out.println(c);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C cobj=new C();
		
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		cobj.display();
		cobj.show();
		cobj.print();

	}

}
  