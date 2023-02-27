package class2;

import java.util.Scanner;

public class hokangsu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int T = 1; T <= t; T++) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			StringBuilder sb = new StringBuilder();

			int H = 0;
			if (n % h == 0) {
				
				H = h;
				
				if (n / h < 10) {
					sb.append(H).append(0).append(n / h);

				} else {
					sb.append(H).append(n / h);
				}
			} else {
				H = n % h;
				if (n / h + 1 < 10) {
					sb.append(H).append(0).append(n / h + 1);

				} else {
					sb.append(H).append(n / h + 1);
				}
			}

			System.out.println(sb);
		}

	}

}
