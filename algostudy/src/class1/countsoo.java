package class1;

import java.util.Scanner;

public class countsoo {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int[] arr =new int[3];
		
		int gob = 1;
		for(int i = 0 ; i<3 ; i++) {
			arr[i] = sc.nextInt();
			gob *= arr[i];
		}
		
		int[] arr2 = new int[10];
		
		while(gob>0) {
		arr2[gob%10]++;
		gob /= 10;
		}
		
		
		for(int i = 0 ; i< 10 ; i++) {
			System.out.println(arr2[i]);
		}
	}

}
