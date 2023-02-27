package practice;

import java.util.Arrays;
import java.util.Scanner;

public class gravity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean[][] arr = new boolean[n][n];

		for (int x = 0; x < n; x++) {
			int num = sc.nextInt();
			for (int y = 0; y < n; y++) {
				if (y < num) {
					arr[x][y] = true;
				}
			}
		}

		int max = 0;
		int stack = n;
		for(int y = 0; y<n ; y++) {
			
			stack = n;
			for(int x = 0; x<n; x++) {
				if(arr[x][y] == true) {
					stack--;
				}
			}
			if(stack>max && stack != n) {
				max = stack;
			}
		}
		
		System.out.println(max);
		
		
		
		
		
	}

}
