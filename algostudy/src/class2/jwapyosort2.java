package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class jwapyosort2 {

	public static void main(String[] args) throws IOException {
		//이번엔 버퍼로 받았따
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		
		//똑같이 sort재정의 해서 풀기.
		//순서만 바꿔주면 댐.
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1])
					return Integer.compare(o1[0], o2[0]);
				else
					return Integer.compare(o1[1], o2[1]);
			}
		});

		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " ").append(arr[i][1]).append("\n");

		}

		System.out.println(sb);
	}

}
