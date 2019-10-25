package com.hkit.bbg.oop;

public class Result {
	public final int NO_COUNT;
	private int strike;
	private int ball;
	private int out;
	private int count = 1;
	
	public Result(int no_count) {
		//NO_COUNT 가 값이 정해지지 않아서 오류가 남
		//그래서 생성자를 선언하면 오류를 없앨 수 있음
		NO_COUNT = no_count;
	}
	
	public void setValues(int strike, int ball) {
		this.strike = strike;
		this.ball = ball;
		this.out = NO_COUNT - (this.strike + this.ball);
	}
	
	public void showResult() {
		System.out.printf("S : %d, B : %d, O : %d\n", strike, ball, out);
	}
	
	public void countResult() {
		//하나의 메소드는 하나의 일만 하는 것이 좋다.
		if(this.strike < NO_COUNT) {
			count++;
		} else if(this.strike == NO_COUNT) {
			System.out.printf("%d번 시도했습니다.\n", count);
			System.out.println("게임을 종료합니다.");
		}
	}

}
