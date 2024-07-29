package day12;

public class AdderMainClass {

	public static void main(String[] args) {
		
		Adder add=new Adder();
		add.sum();
		add.sum(2,3);
		add.sum(10.5,1);
		add.sum(1,10.5);
		add.sum(2,3,5);
		//add.sum(2.5,1.5,3);
		
	}

}
