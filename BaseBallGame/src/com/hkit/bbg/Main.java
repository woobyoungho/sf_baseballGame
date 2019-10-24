package com.hkit.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];

		// random 값이 0 ~ 0.999999999
		// 따라서 randomValue값은 0 ~ 9까지의 정수

		// 랜덤값 중복 x
		for (int i = 0; i < randomNoArray.length; i++) {
			int randomValue = (int) (Math.random() * 9) + 1;

			for (int j = 0; j < randomNoArray.length; j++) {
				if (randomNoArray[j] == randomValue) {
					i--;
					break;
				} else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
			}
		}

		// 콘솔에서 값을 입력받기 위한 객체
		int[] userNoArray = new int[NO_COUNT];

		Scanner sc = new Scanner(System.in);
		// import 생성 단축키 Ctrl + Shift + 'o'

		/*
		 * int value1 = sc.nextInt(); System.out.println("value1 : " + value1);
		 * 
		 * int value2 = sc.nextInt(); System.out.println("value2 : " + value2);
		 */

		for (int i = 0; i < userNoArray.length; i++) {
			System.out.print((i + 1) + "번째 값을 입력해 주세요 : ");
			userNoArray[i] = sc.nextInt();
		}
		sc.close();

		for (int item : userNoArray) {
			System.out.println("userNoArray result : " + item);
		}
		System.out.print("The End");
		

	}
}
