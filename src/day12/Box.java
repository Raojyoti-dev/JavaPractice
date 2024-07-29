package day12;

public class Box {
	
	
	
	int length, width, height;
	
	//Constructor Overloading
//default constructor
	Box(){
		length=width=height=0;
	}
	
	//Parameterized constructor
	Box(int len,int wid,int ht){
		length=len;
		width=wid;
		height=ht;
		
	}
	
	//Parameterized constructor
	Box(int len){
		length=height=width=len;
	}
	
	public void volume(){
		
	System.out.println(length*width*height);
	
	}

}
