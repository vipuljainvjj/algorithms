package com.vipul.sorting;

import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		int [] x = {10,5,6,8,1,2,9,3};
		System.out.println("Actual Array");
		System.out.println(Arrays.toString(x));
		System.out.println("----------------");
		for(int i = 1; i < x.length; i++)
		{
			int key = x[i];
			for(int j = i - 1 ; j >= 0 ;j -- )
			{
				if(x[j] > key)
				{
					x[j + 1] = x[j];
					x[j] = key;
				}
			System.out.println(Arrays.toString(x));
			}
			System.out.println("----------------");
		}	

		System.out.println(Arrays.toString(x));
		
	}
	
	
}
