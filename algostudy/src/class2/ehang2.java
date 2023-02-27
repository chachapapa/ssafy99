package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ehang2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for (int x = 0; x < n; x++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for (int y = 0; y < 2; y++) {

				arr[x][y] = Integer.parseInt(st.nextToken());
			}

		}
		for (int i = 0; i < n; i++) {
			//System.out.println(Arrays.toString(arr[i]));
		}

		for (int i = 0; i < n - 1; i++) {
			//System.out.println(i);
			//System.out.println("넣을 위치" + Arrays.toString(arr[i]));
			int[] min = arr[i];
			int idx = 0;
			for (int x = i + 1; x < n; x++) {
				//System.out.println("비교값" + Arrays.toString(arr[x]));
				if (min[0] > arr[x][0]) {
					min = arr[x];
					idx = x;
					// System.out.println("최소 인덱스" + idx + "최소값" + Arrays.toString(min));
				}

			}
			if (idx != 0) {
				arr[idx] = arr[i];
				arr[i] = min;
				for (int j = 0; j < n; j++) {
					//	System.out.println(Arrays.toString(arr[j]));
				}
			}
		}
		//System.out.println("--------------");
		for (int i = 0; i < n - 1; i++) {
			int[] min = arr[i];
			int idx = 0;
			for (int x = i + 1; x < n; x++) {
				if (min[0] == arr[x][0] && min[1] > arr[x][1]) {
					min = arr[x];
					idx = x;
				}

			}
			if (idx != 0) {
				arr[idx] = arr[i];
				arr[i] = min;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < 2; y++) {
				sb.append(arr[x][y] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
