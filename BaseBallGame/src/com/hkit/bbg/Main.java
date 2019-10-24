package com.hkit.bbg;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		// random 값이 0 ~ 0.999999999
		// 따라서 randomValue값은 0 ~ 9까지의 정수

		for (int i = 0; i < randomNoArray.length; i++) {
			int randomValue = (int) (Math.random() * 9) + 1;

			for (int j = 0; j < randomNoArray.length; j++) {
				if (randomNoArray[j] == randomValue) {
					i--;
					break;
				}
				else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
			}
		}
		for (int i = 0; i < randomNoArray.length; i++) {
			System.out.println("randomNoArray : " + randomNoArray[i]);
		}
	}
}
