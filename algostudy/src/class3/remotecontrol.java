package class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class remotecontrol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int channel = sc.nextInt();

		int num = sc.nextInt();

		List<Integer> button = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			button.add(i);
		}

		for (int number = 0; number < num; number++) {

			button.remove(sc.nextInt());

		}

		int push = 0;

		List<Integer> channelsplit = new ArrayList<>();
		// 현재위치 100
		while (channel > 0) {
			channelsplit.add(channel % 10);
			channel = channel / 10;

		}

		List<Integer> near = new ArrayList<>();
		int hoobo = 0;

		for (int i = 0; i < channelsplit.size(); i++) {
			int min = 10;
			for (int minus = 0; minus < button.size(); minus++) {
				if (min > (Math.abs(channelsplit.get(i) - button.get(minus)))) {
					min = button.get(minus);
				}
			}

			hoobo += min * Math.pow(10, button.size() - (i + 1));

			/*
			 * if(button.contains(channelsplit.get(i))) { push++; }else {
			 * //button.get(button.indexOf(channelsplit.get(i))-1); }
			 */
		}

		System.out.println(hoobo);
	}

}
