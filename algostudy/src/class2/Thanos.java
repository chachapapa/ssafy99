package class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Thanos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//무한 for 문 돌려서 일단 라인 받기
		for (int line = 0;; line++) {
			String x = sc.nextLine();
			
			// . 하나만 입력되면 for문 종료
			if (x.equals(".")) {
				break;
			}
			
			// 받은 스트링 다 쪼개기
			String[] arr = x.split("");
			List<String> list = new ArrayList<>();
			
			//쪼개서 소괄호 대괄호 그리고 . 만 리스트에 넣어주기 크기가 변할거기때문에 리스트 사용
			// . 은 안넣을랬는데 인덱스 조회할때 아웃오브바운드 에러 떠서 넣어줌 일부러
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("(") || arr[i].equals(")") || arr[i].equals("[") || arr[i].equals("]")
						|| arr[i].equals(".")) {
					list.add(arr[i]);
				}
			}
			
			
			//이제 짝 찾아서 삭제시켜주기 그림맞추기처럼
			// "[()]" --> "[]" --> " "
			//삭제할때마다 조회 인덱스 0으로 초기화
			//없다면 조회 인덱스 ++로 
			//끝까지 조회시 for문 탈출
			for (int i = 0; i < list.size();) {

				if ((list.get(i).equals("(") && list.get(i + 1).equals(")"))
						|| (list.get(i).equals("[") && list.get(i + 1).equals("]"))) {

					list.remove(i + 1);
					list.remove(i);
					i = 0;
				} else {
					i++;
				}
			}
			
			//짝이 맞는 문장이었다면, 리스트 안에는 . 하나만남아있을테니까
			//yes출력, 이외의 경우에는 no 출력.
			if (list.size() == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}

	}

}
