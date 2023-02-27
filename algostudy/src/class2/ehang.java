package class2;

import java.util.Scanner;

public class ehang {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		//5 2 면 5C2랑 같은거라더라
		// 5*4 /  2*1 이니까
		int boonja = 1;
		int boonmo = 1;
		for(int i = 0 ; i<k ; i++) {
			boonja *= n-i;
		}
		
		for(int i = 1 ; i<=k ; i++) {
			boonmo*= i;
		}
		System.out.println(boonja/boonmo);
		
		
		
	}
}
