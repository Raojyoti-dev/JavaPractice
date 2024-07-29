package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
//		int arr[][]=new int[2][3];
//		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		int arr[][]= {{1,2},{4,3},{4,5},{8,9,7}};
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			 System.out.println();
		}*/
		
		for(int arr1[]:arr) {
			for(int j:arr1) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
