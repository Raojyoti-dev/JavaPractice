package day7;

public class SearchInAnArray {

	public static void main(String[] args) {
		
		int x=100;
		
		int arr[]= {200,235,100,466};
		
		boolean status=false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==x) {
				System.out.println(x);
				status=true;
				break;
			}
			
		}
		if(status!=true) {
			
			System.out.println("not present");
		}
		

	}

}
