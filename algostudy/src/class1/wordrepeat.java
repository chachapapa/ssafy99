package class1;

import java.util.Arrays;
import java.util.Scanner;

public class wordrepeat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int test = 1; test <= t; test++) {

			int n = sc.nextInt();

			String str = sc.next();

			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				

				for (int time = 1; time <= n; time++) {
					System.out.print(arr[i]);

				}

			}
			System.out.println();

		}

	}

}
