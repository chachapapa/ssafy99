package class2;

import java.util.Scanner;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		for (int num = 0; num < n; num++) {
			int x = sc.nextInt();
			if (x != 0) {
				stack.add(x);
			} else if (x == 0) {
				stack.pop();
			}
		}
		int sum = 0;
		while (stack.size() != 0) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}
