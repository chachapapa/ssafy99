package class2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class card2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 상근이 카드 갯수
		int n = sc.nextInt();

		// 카드 숫자들
		int[] cards = new int[n];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = sc.nextInt();
		}
		// 찾아야하는 카드숫자 갯수
		int m = sc.nextInt();
		
		//찾는 카드 숫자들을 배열에 먼저 넣어줌.
		//중복값을 찾기 위해서.
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		
		//맵을 생성해서 해당 맵에 키값으로 찾는 값을 넣고 밸류값은 카운트로 사용하기위해 0을 넣어둠.
		Map<Integer, Integer> find = new LinkedHashMap<>();
		for (int i = 0; i < m; i++) {
			find.put(arr[i], 0);
		}
		
		//상근이가 가지고있는 카드들을 find에서 찾아서 해당 키값을 가지는 위치의 밸류를 +1해줌.
		for (int i = 0; i < cards.length; i++) {
			if (find.containsKey(cards[i])) {
				find.replace(cards[i], find.get(cards[i]) + 1);
			}
		}
		
		//키를 for문으로 모두 불러와서 밸류값을 스트링빌더로 붙임.
		//이때 map이 아닌 배열로불러오는 이유는 찾는 값이 중복일때
		//맵에는 하나만 저장되어서 오답이 됨.
		StringBuilder sb = new StringBuilder();
		for (int key : arr) {
			sb.append(find.get(key)).append(" ");
		}

		System.out.println(sb.toString().trim());

	}

}
