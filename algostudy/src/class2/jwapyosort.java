package class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class jwapyosort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		//2중배열로 정렬할 배열 받기
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//sort 재정의를 통해서 정렬하기
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])
					return Integer.compare(o1[1], o2[1]);
				else
					return Integer.compare(o1[0], o2[0]);
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " ").append(arr[i][1]).append("\n");

		}

		System.out.println(sb);
	}

}