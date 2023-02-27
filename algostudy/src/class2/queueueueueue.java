package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueueueueue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] order = new String[n];

		sc.nextLine();

		for (int i = 0; i < n; i++) {

			order[i] = sc.nextLine();
		}

		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		
		
		for (int i = 0; i < order.length; i++) {
			//푸시는 nextline으로 받은 스트링을 스플릿으로 나눠서 1의 위치에 있는 정수를 변환하여 추가.
			if (order[i].contains("push")) {
				q.add(Integer.parseInt(order[i].split(" ")[1]));

			} else if (order[i].equals("pop")) {
				if (!q.isEmpty()) {
					sb.append(q.poll() + "\n");
				} else {
					sb.append(-1 + "\n");
				}
			} else if (order[i].equals("size")) {
				sb.append(q.size() + "\n");
			} else if (order[i].equals("empty")) {
				if (q.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else if (order[i].equals("front")) {
				if (!q.isEmpty()) {
					sb.append(q.peek() + "\n");
				} else {
					sb.append(-1 + "\n");
				}
				//q에서 맨 뒷 값을 찾는 함수는 없으므로
				//앞의 값들을 모두 poll해준뒤 출력하고 다시
				//원래의 상태로 배열을 되돌림.
			} else if (order[i].equals("back")) {
				if (q.size() > 0) {
					for(int x = 0; x<q.size()-1 ; x++) {
						q.add(q.poll());
					}
					int x = q.poll();
					sb.append(x + "\n");
					q.add(x);
				} else {
					sb.append(-1 + "\n");
				}
			}

		}
		System.out.println(sb);

	}

}
