package thisKeyword;

public class ThisKeyword {
	
	private int x; 
	private int y;
	
	//constructor
	/*ThisKeyword(int x, int y){
		this.x=x;
		this.y=y;
		
	}*/
	
	//Method
	void setData(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		
		th.setData(100,200);
		th.display();
		
		
	}

}
