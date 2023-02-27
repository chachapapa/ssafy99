package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class yosepoose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(!q.isEmpty()) {
			 
			// k-1번 앞에 있는 원소를 뒤로 보냄.
			for(int i = 0; i < k - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}
			
			// k-1 번째 수는 뽑아서 sb에 붙이기.
			sb.append(q.poll());
			if(q.size() != 0) {
				sb.append(", ");
			}

			
		}
		sb.append(">");
		System.out.println(sb);
	}

}
