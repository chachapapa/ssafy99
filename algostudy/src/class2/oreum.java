package class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class oreum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i = 0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int x : arr) {
		System.out.println(x);
		}
	}

}
