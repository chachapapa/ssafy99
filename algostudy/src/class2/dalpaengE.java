package class2;

import java.util.Scanner;

public class dalpaengE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int goal = sc.nextInt();
		
		int shorter = goal - a;
		int res = 0;
		
		if(shorter%(a-b) == 0 ) {
		res += shorter/(a-b); 
		}else {
			res += shorter/(a-b)+1;
		}
		
		System.out.println(res+1);
	}

}
