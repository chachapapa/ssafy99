package practice;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int N = 1 ; N<=n ; N++) {
		
			int[] arr = new int[10];
			
			for(int x = 0 ; x<10 ; x++) {
				arr[x] = sc.nextInt();
			}
			
			int min = 10000;
			int max = 0;
			for(int x = 0 ; x<10 ; x++) {
				if(arr[x] < min) {
					min = arr[x];
				}
				
				if(arr[x] > max) {
					max = arr[x];
				}
			}
			
			int sum = 0;
			for(int x = 0 ; x<10 ; x++) {
				if(arr[x] != min && arr[x] != max) {
					sum += arr[x];
				}
			}
			if(sum%8 >= 4) {
			System.out.println("#"+N+" "+(sum/8+1));
			}else {
				System.out.println("#"+N+" "+(sum/8));
			}
		}
		
		
		
		
		
		
		
	}

}
