package class3;

import java.util.Scanner;

public class tiling2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1; test<=t ; test++) {
		int n = sc.nextInt()/10;
		




		System.out.println("#"+test+" "+tiling(n));
		}
	}
	
	public static int tiling(int n) {
		
		if(n == 1) {
			return 1;
		}else if(n == 2){
			return 3;
		}else {
			return tiling(n-1) + 2*tiling(n-2);
		}
		
		
	}
}
