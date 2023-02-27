package algostudy;

import java.util.Arrays;
import java.util.Scanner;

public class input {
	public static void main(String[] ㄴㅇㄹ호) {
		
		
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[4][4];
		
		
		//tochararray 쓰면 더쉽넹
		
		
		for(int i = 0 ; i<4 ; i++) {
			String a = sc.nextLine();
			for(int j = 0 ; j<4 ; j++) {
				arr[i][j] = a.charAt(j);
			}
		}
		for(int i = 0 ; i<4 ; i++) {
		System.out.println(Arrays.toString(arr[i]));
		}
	}
}
