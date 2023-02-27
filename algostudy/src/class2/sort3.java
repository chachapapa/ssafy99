package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class sort3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		int[] arr = new int[10000001];
		
		//정수를 받아서 해당 정수를 인덱스로가지는 위치에 ++
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		//스트링빌더로 0이아닌 정수들을 모두 받아서 합침.
		//중복값은 while을 통해서 여러개 받아주기
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000001; i++) {
			
			if (arr[i] != 0) {
				while(arr[i]>0) {
				sb.append(i+"\n");
				arr[i]--;
				}
			}
		}
		

		System.out.println(sb);
	}

}
