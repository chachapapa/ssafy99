package class2;

import java.util.Arrays;
import java.util.Scanner;

public class Jangyouyouseo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 회원수
		int n = sc.nextInt();

		
		String[][] client = new String[n][2];
		for (int num = 0; num < n; num++) {

			client[num][0] = sc.next();
			client[num][1] = sc.next();

		}
		
		
		int[] count = new int[201];
		
		for(int i = 0 ; i<n ; i++) {
			char[] arr = client[i][0].toCharArray();
			int age = 0;
			for(int ctoi = 0; ctoi<arr.length ; ctoi++) {
				age += (arr[ctoi]-'0')*Math.pow(10, arr.length-1-ctoi);
			}
			 
			count[age] ++; 
		}
		
		for(int x = 1; x<count.length ; x++) {
			count[x] = count[x]+count[x-1];
		}
		System.out.println(Arrays.toString(count));
	}

}
