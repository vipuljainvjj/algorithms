package com.vipul.numbersystem;

import java.util.Scanner;

public class Arnstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int len = s1.length();
		int num = Integer.parseInt(s1);
		int sum = 0 ;
		int m = num; 
		while(num > 0)
		{
			int j = num % 10;
			int x = 1;
			for (int j2 = 0; j2 < len ; j2++) 
			{
				 x = x * j ;
			}
			sum = sum + x ;
			num /= 10;
		}
		if(sum == m)
		{
			System.out.println("len " + len + " sum " + sum );
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not");
		}
	}

}
