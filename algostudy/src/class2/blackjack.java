package class2;

import java.util.Scanner;

public class blackjack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i<n ; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int res = 0;
		
		for(int i = 0; i<n ; i++) {
			for(int j = i+1; j<n ; j++) {
				if(arr[i] + arr[j] < max) {
					for(int k = j+1 ; k<n ; k++) {
						if(arr[i]+arr[j]+arr[k] <= max && arr[i]+arr[j]+arr[k]>res) {
							res = arr[i]+arr[j]+arr[k];
						}
					}
				}
				 	
			}
			
		}
		System.out.println(res);
		
		
	}
}
