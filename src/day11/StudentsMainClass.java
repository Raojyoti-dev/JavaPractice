package day11;

public class StudentsMainClass {

	public static void main(String[] args) {
		
		//inittializing through objects
		/*Student st=new Student();
		st.name="Jyoti";
		st.sId=100;
		st.display();*/
		
		
		//inittializing thorugh additional method
		/*Student st=new Student();
		st.assignData("shiva",28);
		st.display();*/
		
		
		//initiakizing thorugh consturctor
		Student st=new Student("Prakash",102);
		st.display();
	}

}
