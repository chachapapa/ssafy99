package class2;

import java.util.Scanner;

public class pitagoras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//무한 반복 000나올때까지
		for (int i = 0;; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if (x == 0 && y == 0 && z == 0) {
				break;
			}
			
			
			//xyz가 어디 변을 뜻하는지 모르므로 
			//각각의 경우를 다 if로 잡아서
			//피타고라스 조지자
			if(x<z && y<z) {
			if (x * x + y * y == z * z) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			}else if(x<y && z<y) {
				if (x * x + z * z == y * y) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}else if(y<x && z<x) {
				if (y * y + z * z == x * x) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
		}

	}

}
