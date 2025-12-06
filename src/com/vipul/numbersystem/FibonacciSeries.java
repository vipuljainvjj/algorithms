package com.vipul.numbersystem;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int value1 = 0;
		int value2 = 0;
		for (int i = 0; i < 6; i++) {
			
			int sum = value1 + value2;
			if (i <= 1) {
				System.out.println(i);
				value2 = i;
			} else {
				value1 = value2;
				value2 = sum;
				System.out.println(sum);
			}
		}
	}

}
