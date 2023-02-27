package class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		str = str.toUpperCase();
		char[] arr = str.toCharArray();

		System.out.println(Arrays.toString(arr));

		int[] arr2 = new int[123];

		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]]++;

		}
		System.out.println(Arrays.toString(arr2));
		int tmp = 0;
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if ( tmp < arr2[i]) {
				tmp = arr2[i];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] == tmp) {
				list.add((char)i);
			}
		}
		
		if(list.size() == 1 ) {
			System.out.println(list.get(0));
		}else {
			System.out.println("?");
		}
	}
}
