package com.vipul.crackingthecodinginterview;

import java.util.function.BinaryOperator;

public class UniqueChar {
	
	public static void main(String[] args) {
		
		int checker = 0;
		String str = "aaaa";
		for (int i = 0; i < str.length(); i++) {
			int val1 = str.charAt(i);
			int val2 = 'a';
			int finalVal = val1 - val2;
			
			System.out.println(val1 + "," + val2 + "," + finalVal + "," + (1 << finalVal) + "," + (checker & (1 << finalVal))) ;
			
			if( (checker & (1 << finalVal)) > 0 ) {
				System.out.println("Rock");
				break;
			}
			checker |= (1 << finalVal);
		}
		System.out.println(Integer.toBinaryString(2097152));
		
		
	}

}
