package day11;

public class Student {
	
	public String name;
	public int sId;
	
	Student( String Name,int id){
		name=Name;
		sId=id;
	}
	
	
	public void display(){
		System.out.println(name);
		System.out.println(sId);
	}
	
	public void assignData(String Name, int id) {
		name=Name;
		sId=id;
	}
	
	

}
