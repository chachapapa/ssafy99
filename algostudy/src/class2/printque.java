package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int test = 1; test <= t; test++) {

			int n = sc.nextInt(); 
			int idx = sc.nextInt(); 
			Queue<Integer> q = new LinkedList<>();

			for (int i = 0; i < n; i++) {
				q.offer(sc.nextInt());
			} 

			int res = 0;

			while (!q.isEmpty()) {
				int num = q.poll();
				int max = num;
				for (int x : q) {
					if (x > num)
						max = x;
				}

				boolean print = true;


				if (max != num) {
					q.offer(num);
					print = false;

				} else
					res++;


				if (idx != 0)
					idx--;

				else {
					if (print == true) {
						System.out.println(res);
						break;
					} else {
						idx = q.size() - 1;
					}
				}
			}
		}

	}
}
