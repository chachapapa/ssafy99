package class3;

import java.util.Scanner;
import java.util.Stack;

public class hoowee2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String hoowee = sc.next();
		double[] score = new double[n];
		for(int num = 0 ; num<n ; num++ ) {
			score[num] = sc.nextDouble();
			
		}
		
		Stack<Double> resbox = new Stack<>();

		for (int i = 0; i < hoowee.length(); i++) {
			if (hoowee.charAt(i) != '+' && hoowee.charAt(i) != '*' && hoowee.charAt(i) != '-' && hoowee.charAt(i) != '/') {
				resbox.push(score[(int)hoowee.charAt(i) - 65]);

			} else {

				Double y = resbox.pop();

				Double x = resbox.pop();

				Double z = 0.00;

				switch (hoowee.charAt(i)) {
				case '+':
					z = x + y;
					break;
				case '*':
					z = x * y;
					break;
				case '/':
					z = x / y;
					break;
				case '-':
					z = x - y;
				}

				resbox.push(z);
			}

		}
		System.out.printf("%.2f",resbox.pop());

	}

}
