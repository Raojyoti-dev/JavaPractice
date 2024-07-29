package Overriding;

class Bank{
	
      double roi() {
    	  return 5.0;
      }
}

class HDFC extends Bank{
	
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank{
	 
	double roi() {
		return 11.5;
	}
}


public class Overrding {

	public static void main(String[] args) {
		
		HDFC hd=new HDFC();
		System.out.println(hd.roi());
		
		SBI sb=new SBI();
		System.out.println(sb.roi());
	}

}
