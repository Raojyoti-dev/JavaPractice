package day11;

public class Constructor {
	
	int id;
	String name;
	
	//default constriuctor as value is intialized here only
	Constructor(){
		id=100;
		name="jyoti";
	}
	
	//Parameterized constructor as value is initialized during obj creation
	Constructor(int ID, String Name){
		id=ID;
		name=Name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		Constructor cs=new Constructor();
		cs.display();
		
		Constructor cs2=new Constructor(110,"Shiva");
		cs2.display();
		
		
	
	}
	
}
