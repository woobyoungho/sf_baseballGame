package com.hkit.bbg;

import java.util.Scanner;

public class Main2 {
	final static int NO_COUNT = 3;

	public static void main(String[] args) {

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		setRandomArray(randomNoArray);

		Scanner sc = new Scanner(System.in);

		System.out.println("Game start!");
		for (int item : randomNoArray) {
			System.out.print("< " + item + " >   ");
		}
		System.out.println("\n");

		while (true) {
			setUserArray(sc, userNoArray);
			int s = checkFinish(randomNoArray, userNoArray);
			
			if (s == randomNoArray.length) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		sc.close();
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
	}

	public static void setUserArray(Scanner sc, int[] userNoArray) {
		for (int i = 0; i < userNoArray.length; i++) {
			System.out.print((i + 1) + "번째 값 입력 : ");
			int value = sc.nextInt();
			userNoArray[i] = value;
		}
	}

	public static int checkFinish(int[] randomNoArray, int[] userNoArray) {
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
		return s;
	}

}
