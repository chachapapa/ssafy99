package class1;

import java.util.Scanner;

public class jeokjae {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
