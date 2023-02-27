package class2;

import java.util.Arrays;
import java.util.Scanner;

public class gwalho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//테스트케이스 받기
		int t = sc.nextInt();
		
		//문자열로받을거니까 공백한번 지워주고
		sc.nextLine();
		
		
		for(int T = 1; T<=t ; T++) {
			//각 테스트케이스 괄호들 문자열로 받아서 쪼개서 배열로 넣기
			String[] vps = sc.nextLine().split("");
			
			int sum = 0;
			
			//괄호가 성립하려면 여는 괄호 갯수랑 닫는 괄호 갯수가 맞아야함
			//마지막에 여는괄호 갯수가 더 많으면 안닫힌거
			//중간에 닫는괄호가 더 많아도 안됨.
			//여는괄호 +1 닫는괄호 -1 해서
			//중간에 음수나오면 NO
			//마지막에 양수 나와도 NO
			//마지막에 0나오는 경우만 YES
			for(int i = 0 ; i<vps.length ; i++) {
				if(vps[i].equals("(")) {
					sum++;
				}else {
					sum--;
					if(sum <0) {
						System.out.println("NO");
						break;
					}
				}
				
			}
			if(sum == 0) {
				System.out.println("YES");
			}else if(sum > 0) {
				System.out.println("NO");
			}
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
