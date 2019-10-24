package com.hkit.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
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
		Scanner sc = new Scanner(System.in);
		
		for(int item : randomNoArray) {
			System.out.print(item + "  ");
		}
		System.out.println();
		
		while(true) {
			for(int i = 0;i < userNoArray.length; i++) {
				System.out.print("값을 입력해 주세요.");
				int value = sc.nextInt();
				userNoArray[i] = value;
			}
			
			int s = 0, b = 0;
			
			for(int i = 0; i < NO_COUNT; i++) {
				for(int j = 0; j < NO_COUNT; j++) {
					if(randomNoArray[i] == userNoArray[j]) {
						if(i == j){
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.printf("S : %d, B : %d, O : %d\n", s, b, NO_COUNT - (s + b));
			
			if(s == NO_COUNT) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
		sc.close();
	}
}
