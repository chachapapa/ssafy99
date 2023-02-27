package class2;

import java.util.Scanner;

public class eraChe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();


		boolean[] arr = new boolean[N+1];

		arr[0]  = true;
		arr[1] = true;

		for (int i = 2; i * i <= N; i++) { 
			if (!arr[i]) { 
				for (int j = 2; i * j <= N; j++) {
					arr[i * j] = true;
				}
			}
		}

		for (int i = M; i <= N; i++) {
			if (!arr[i]) {
				System.out.println(i);
			}
		}

	}

}
