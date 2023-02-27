package class2;

import java.util.Arrays;
import java.util.Scanner;

public class cutcutcut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 나무의 수
		int n = sc.nextInt();
		// 가져가고싶은나무 길이
		int wanted = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}


		Arrays.sort(arr);


		int start = 0;
		int end = arr[n - 1];

		go : for (int t = 0; start<=end; t++) {


			long sum = 0;
			int m = (start + end) / 2;

			for (int i : arr) {
				if (i - m > 0) {
					sum += i - m;
				}
			}

			if (sum >= wanted) {
				start = m+1;
				
			} else if (sum < wanted) {
				end = m-1;
			}
			System.out.println("중간값" + m);
			System.out.println("얻고싶은 나무 길이" + wanted);
			System.out.println("중간값으로 자르면 얻는 나무 길이" + sum);
			System.out.println("#"+(t+1)+"단계  "+ "시작값이 " + start);
			System.out.println("#"+(t+1)+"단계  "+"끝값 " + end);
			System.out.println();


		}
		System.out.println("시작값이 " + start +"로");
		System.out.println("끝값 " + end+"보다 커짐");
	}

}
