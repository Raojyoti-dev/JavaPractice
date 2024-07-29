package day7;

public class FindNoOfRepetitions {

	public static void main(String[] args) {
		
		int x=134;
		
		int arr[]= {100,134,566,765,134,134};
		
		int count=0;
		
		for (int y:arr) {
			if(y==x) {
				count+=1;
			}
		}
		
		System.out.println(count);
	}

}
