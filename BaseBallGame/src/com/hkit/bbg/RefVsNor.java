package com.hkit.bbg;

public class RefVsNor {
	public static void main(String[] args) {
		int nmValue = 10;
		
		Temp temp = new Temp();
		temp.refValue = 10;
		
		change(nmValue);
		change(temp);
		
		System.out.println("nmValue : " + nmValue);
		System.out.println("refValue : " + temp.refValue);
	}
	
	public static void change(int v) {
		v = 30;
	}
	
	public static void change(Temp t) {
		t.refValue = 30;
	}
	
	
}

class Temp{
	int refValue;
}
