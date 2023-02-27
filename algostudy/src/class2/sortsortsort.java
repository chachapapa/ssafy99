package class2;


import java.util.Scanner;

public class sortsortsort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		//스트링빌더의 응용
		//스트링빌더로 배열을 만들어서
		//나이가 200살 이하라고 했으니까
		//인덱스를 나이로 잡고
		//해당 인덱스 내부에 스트링빌더를 생성해서
		//age name 붙이기
		StringBuilder[] sb = new StringBuilder[201];
		for (int i = 0; i < sb.length; i++) {
			sb[i] = new StringBuilder();
		}
		for (int i = 0; i < N; i++) {

			int age = sc.nextInt();

			String name = sc.next();
			sb[age].append(age).append(' ').append(name).append('\n');
		}
		
		//배열이 널값이 아닐시 출력.
		for (int i = 0; i < 201; i++) {
			if (sb[i] != null) {

				System.out.print(sb[i]);
			}
		}

	}

}
