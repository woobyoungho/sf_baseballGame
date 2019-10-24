package com.hkit.bbg.oop;

public class Result {
	public final int NO_COUNT;
	private int strike;
	private int ball;
	private int out;
	
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
		if(this.strike == NO_COUNT) {
			System.out.println("게임이 끝났습니다.");
		}
	}
	
}
