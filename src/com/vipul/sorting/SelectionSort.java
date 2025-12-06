package com.vipul.sorting;
//Selection Sort
import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Actual Array");
		int [] x = {2,5,8,1,9};
		System.out.println(Arrays.toString(x));
		System.out.println("Array after each Recursion");
		sort(x,0);
		
	}
	static void sort(int [] x,int i)
	{
	//We are not changing array that we are passing
	//By changing it index we can manipulate array passed to the next Recursion
		if(i < x.length - 1)
		{
			int index = i; 
			int min = x[i];
			for (int j = i; j < x.length; j++)//j value is started from i, b/c before i value array is already sorted
			{
				if(x[j] < min)
				{
					min = x[j];
					index = j;
				}
			}
			int temp = x[i];
			x[i] = min;
			x[index] = temp;
			
			System.out.println(Arrays.toString(x));
			sort(x,++i);
		}
		
	}
}
