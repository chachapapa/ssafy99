package class2;


import java.util.Scanner;

public class bigguy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//키 몸무게 그리고 빈칸 하나 총 3칸의 이중배열
		int[][] arr = new int[n][3];
		
		//각각 키 몸무게의 원소를 가진 n명의 이중배열 생성
		//마지막 칸에는 자신보다 덩치가 큰 사람의 수인 loss횟수를 넣어줄 예정
		for(int x = 0; x<n ; x++) {
			for(int y = 0; y<2 ; y++) {
				arr[x][y] = sc.nextInt(); 	
			}
		}
		
		//각각의 행들과 각각 비교. 자기자신과는 어차피 무승부라 예외처리 안해줌
		//키, 몸무게 둘다 패배시 loss 추가.
		//패배 횟수 +1 하면 중첩 등수도 표현 가능.
		for(int x = 0; x<n ; x++) {
			int loss = 0;
			for(int battle = 0; battle<n ; battle++) {
				if(arr[x][0] < arr[battle][0] && arr[x][1] < arr[battle][1]) {
					loss++;
				}
			}
			arr[x][2] = loss+1;
		}
		
		for(int x = 0; x<n ; x++) {
		System.out.print(arr[x][2] + " ");
		}
		
		
	}

}
