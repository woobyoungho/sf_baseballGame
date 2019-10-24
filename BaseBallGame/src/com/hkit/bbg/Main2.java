package com.hkit.bbg;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		final int NO_COUNT = 4;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		// random 값이 0 ~ 0.999999999
		// 따라서 randomValue값은 0 ~ 9까지의 정수

		setRandomArray(randomNoArray);

		setUserNoArray(randomNoArray, userNoArray);
	}

	public static void setRandomArray(int[] randomNoArray) {
		// 랜덤값 중복 x
		for (int i = 0; i < randomNoArray.length; i++) {
			int randomValue1 = (int) (Math.random() * 9) + 1;

			for (int j = 0; j < randomNoArray.length; j++) {
				if (randomNoArray[j] == randomValue1) {
					i--;
					break;
				} else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue1;
					break;
				}
			}
		}

		System.out.println("Game start!");
		for (int item : randomNoArray) {
			System.out.print("< " + item + " >   ");
		}
		System.out.println("\n");
	}

	public static void setUserNoArray(int[] randomNoArray, int[] userNoArray) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < userNoArray.length; i++) {
				System.out.print((i+1) + "번째 값 입력 : ");
				int value = sc.nextInt();
				userNoArray[i] = value;
			}

			int s = 0, b = 0;

			for (int i = 0; i < randomNoArray.length; i++) {
				for (int j = 0; j < randomNoArray.length; j++) {
					if (randomNoArray[i] == userNoArray[j]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.printf("\n<S : %d>  <B : %d>  <O : %d>\n\n", s, b, randomNoArray.length - (s + b));

			if (s == randomNoArray.length) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		sc.close();
	}

}
