package com.hkit.bbg.oop;

import java.util.Scanner;

public class UserNumbers extends Numbers {
	private Scanner sc = new Scanner(System.in);
	
	public UserNumbers(int no_count) {
		super(no_count);
	}
	
	public void setUserNumbers() {
		for(int i = 0; i < NO_COUNT; i++) {
			System.out.printf("%d번째 값 입력 : ", i+1);
			int value = sc.nextInt();
			if(!insertValue(value)) {
				System.out.println("중복된 값이 있습니다.");
				i--;
			}
		}
	}
}
