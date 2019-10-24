package com.hkit.bbg.oop;

public class Game {
	public void startGame(int no_cnt) {
		RandomNumbers rnb = new RandomNumbers(no_cnt);
		Result result = new Result(no_cnt);
		
		for(int item : rnb.getArray()) {
			System.out.print(item + "  ");
		}
		System.out.println();
		//정식으로 게임을 시작하려면 위의 for문을 주석처리하면 된다.
		
		while(true) {
			UserNumbers unb = new UserNumbers(no_cnt);
			unb.setUserNumbers();
			
			if(Check.check(result, rnb, unb)) {
				break;
			}
		}
		
	}
}
