package practice;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int N = 1; N<=n ; N++) {
			
			int[] arr = new int[10];
			
			for(int x = 0 ; x<10 ; x++) {
				arr[x] = sc.nextInt();
			}
			
			int max = 0;
			for(int x = 0 ; x<10 ; x++) {
				if(max < arr[x]) {
					max = arr[x];
				}
			}
			
			System.out.println("#"+N+" "+max);
			
			
			
			
			
			
		}
		
		
		
		
		
	}
}
