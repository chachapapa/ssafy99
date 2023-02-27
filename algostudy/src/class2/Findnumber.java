package class2;

import java.util.Arrays;
import java.util.Scanner;

public class Findnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int num = 0; num < n; num++) {

			arr[num] = sc.nextInt();

		}

		int m = sc.nextInt();
		int[] ansarr = new int[m];
		for (int num = 0; num < m; num++) {

			ansarr[num] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int x = 0; x < ansarr.length; x++) {
			int start = 0;
			int end = n - 1;
			int mid = (start + end) / 2;
			while (start <= end) {
				mid = (start + end) / 2;
				if (ansarr[x] > arr[mid]) {
					start = mid + 1;	
				} else if (ansarr[x] < arr[mid]) {
					end = mid - 1;
				} else{
					System.out.println(1);
					break;
				}
				
				
			}
			if(ansarr[x] != arr[mid]) {
			System.out.println(0);
			}

		}

	}

}
