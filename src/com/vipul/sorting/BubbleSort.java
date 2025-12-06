package com.vipul.sorting;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a = {5,4,8,1,10,7};
		int n = a.length;

		for (int i = 0; i < n-1; i++) {

			for (int j = 0; j < n-i-1; j++) {

				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1] =temp;
				}
				System.out.println(Arrays.toString(a));
			}
			System.out.println("---------------------------");
		}
		System.out.println(Arrays.toString(a));
			
	}
}

// Here compare Adjacent Elements and move the bigger element to the right
