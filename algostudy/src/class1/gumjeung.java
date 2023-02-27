package class1;

import java.util.Scanner;

public class gumjeung {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0 ; i<5 ; i++) {
			arr[i] =sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0 ; i<5 ; i++) {
			sum += Math.pow(arr[i], 2);
		}
		
		System.out.println(sum%10);
	}

}
