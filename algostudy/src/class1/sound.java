package class1;

import java.util.Scanner;

public class sound {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		
		
		for(int i = 0 ; i<8 ; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			if(arr[i]== i+1) {
				
				
			}
			
		}
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			if(arr[i] == arr.length-i) {
				System.out.println("descending");
			}
			
		}
		
		for(int i = 0; i<arr.length-1 ; i++) {
			if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]) {
				System.out.println("mixed");
				break;
			}
		}
		
	}

}
