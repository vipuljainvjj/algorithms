package com.vipul.crackingthecodinginterview;

import java.util.Arrays;

public class URLify {
	
	public static void main(String[] args) {
		
		String str = "Mr Johnny Smith    ";
		int trueLength = 15;
		replaceSpaces(str.trim().toCharArray(), trueLength);
		
	}
	
	private static void replaceSpaces(char[] str, int trueLength) {
		
		int spaceCount = 0, index = 0, i = 0;
		
		for (i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		
		for (i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				str[index -1] = '0';
				str[index -2] = '2';
				str[index -3] = '%';
				index -= 3;
			} else {
				str[index -1] = str[i];
				index--;
			}
		}
		
		
		
		System.out.println(Arrays.toString(str));
	}

}
