package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class minecraft {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int maxblock = Integer.parseInt(st.nextToken());
		//땅 높이 넣어줄 맵 생성
		Map<Integer, Integer> land = new HashMap<>();
		
		//2중배열해서 맵 그대로 만들어줄 필요가 없다 생각해서
		//각 높이들을 키로 잡고, 해당 높이를 가지는 땅갯수만큼 ++ 해줌
		for (int x = 0; x < n; x++) {
			String str2 = br.readLine();
			StringTokenizer st2 = new StringTokenizer(str2);
			for (int i = 0; i < m; i++) {
				int loading = Integer.parseInt(st2.nextToken());
				if (land.get(loading) == null) {
					land.put(loading, 1);
				} else {
					land.put(loading, land.get(loading) + 1);
				}
			}
		}
		
		//답이 될 수 있는 높이 후보 리스트.
		List<Integer> height = new ArrayList<>();
		int min = 1000000000;
		
		//평준화 할 수 있는 높이 중 최소시간이 걸리는 높이는 땅 중에 최솟값이랑 최댓값 사이가 될 것.
		for (int goal = Collections.min(land.keySet()); goal <= Collections.max(land.keySet()); goal++) {
			// System.out.println(minmax.get(0) + "부터 " + Collections.max(minmax) + "까지");
			
			//초기 블록값을 설정해줌.
			int block = maxblock;
			int time = 0;
			// System.out.println("현재 goal은" + goal);
			
			//각 높이들을 목표 높이에 맞출 때 파는 경우와 쌓는 경우를 나눠서 설정해줌.
			for (int other : land.keySet()) {

				if (other > goal) {
					time += 2 * (other - goal) * land.get(other);
					block += (other - goal) * land.get(other);
					;

				} else if (other < goal) {
					time -= (other - goal) * land.get(other);
					// System.out.println(other + "높이인" + where[other] + "개");
					block += (other - goal) * land.get(other);
					// System.out.println("남은 블럭 갯수" + block);

				}
			}
			// System.out.println("목표높이 : "+goal+"||||| 남은블럭 : " + block + "|||||| 총 걸린 시간은"
			// + time);
			
			//위에서 도출한 걸리는 시간의 최솟값 구하기.
			//해당높이를  쌓을때 남은 여분 블록이 0보다같거나커야함.
			if (block >= 0) {
				if (time < min) {
					min = time;
					height.clear();
					height.add(goal);
				} else if (time == min) {
					height.add(goal);
				}
			}

		}
		
		//이후 정답 후보목록에서 최대높이를 출력한다.
		System.out.println(min + " " + Collections.max(height));

	}

}
