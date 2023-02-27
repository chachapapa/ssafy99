package class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class gaetsoo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		word = word.toUpperCase();
		String[] arr = word.split("");
		
		
		
		
		List<String> ans = new ArrayList<>();
		int max = 0;
		for(int x = 0 ; x<arr.length ;) {
			int sum = 0;
			for(int y  = x+1 ; y<arr.length ; y++) {
			
				if(arr[x] == arr[y]) {
					sum++;
				}else {
					x = y;
					break;
				}
				
			}
			if (max < sum) {
				ans.removeAll(ans);
				ans.add(arr[x]);
			}else if(max == sum) {
				ans.add(arr[x]);
			}
 
		}
		
		if(ans.size() != 1) {
			System.out.println("?");
		}else {
			System.out.println(ans.get(0));
		}
		
	}

}
