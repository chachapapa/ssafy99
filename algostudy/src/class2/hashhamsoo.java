package class2;

import java.util.Arrays;
import java.util.Scanner;

public class hashhamsoo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char[] arr = new char[n];
			
			arr = sc.next().toCharArray();	
		
		System.out.println(Arrays.toString(arr));
		long sum = 0;
		long pow = 1;
		for(int i = 0 ; i< n ; i++) {
			long x = (int)(arr[i]-'`');
			sum += x*pow;
			pow = (pow*31)%1234567891;
		}
			System.out.print(sum);
	}

}
