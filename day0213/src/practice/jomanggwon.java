package practice;

import java.util.Arrays;
import java.util.Scanner;

public class jomanggwon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {

			int n = sc.nextInt();

			boolean[][] arr = new boolean[255][n];

			for (int y = 0; y < n; y++) {
				int num = sc.nextInt();
				for (int x = 0; x < 255; x++) {
					if (x < num) {
						arr[x][y] = true;
					}

				}
			}
			/*
			 * for(int x = 0 ; x<255 ; x++) { System.out.println(Arrays.toString(arr[x])); }
			 */

			int sum = 0;
			for (int x = 0; x < 255; x++) {
				for (int y = 0; y < n; y++) {
					if (arr[x][y] == true && arr[x][y - 1] == false && arr[x][y - 2] == false && arr[x][y + 1] == false
							&& arr[x][y + 2] == false) {
						sum++;
					}
				}
			}

			System.out.println("#" + t + " " + sum);

		}
	}

}
