package com.hkit.bbg.oop;

public class Numbers {
	public final int NO_COUNT;
	//final 사용 이유는 다른 클래스에서 변경되지 않기 위해서
	//public 있기 때문에 자식 클래스에서 사용가능
	private int[] array;
	
	public Numbers(int no_count) {
		NO_COUNT = no_count;
		array = new int[no_count];
	}
	
	public int[] getArray() {
		return array;
	}
	
	//true 중복값이 없음, false 중복값이 있음
	public boolean insertValue(int number) {
		boolean result = true;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				array[i] = number;
				break;
			} else if(array[i] == number) {
				result = false;
				break;
			}
		}	
		return result;
	}
	
}
