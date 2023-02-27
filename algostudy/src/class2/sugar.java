package class2;


import java.util.Scanner;

public class sugar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//정확한 n 키로를 배달
		//갯수 최대값 5000 한계(계산하기 귀찮았음)
		int n = sc.nextInt();
		int res = 5000;

		for (int x = 0;; x++) {
			
			//3키로 포대로만  n 만드는 경우 포대 최댓값.
			//종료 잡아주려고 박아둠.
			if (3 * x > n) {
				break;
			}
			
			//x가 0부터 시작하므로 5키로 포대를 최대로 가져갈수 있는 경우부터 조회될 것
			//무게 합계가 n 을 초과하면 종료.
			
			for (int y = 0;; y++) {
				if (3 * x + 5 * y == n && x + y < res) {
					res = x + y;
				} else if (3 * x + 5 * y > n) {
					break;
				}
			}
		}
		
		//res 가 초기갑인 5000인 경우 딱 떨어지지 않는 경우.
		// -1 출력.
		if (res == 5000) {
			System.out.println(-1);
		} else {
			System.out.println(res);
		}

	}

}
