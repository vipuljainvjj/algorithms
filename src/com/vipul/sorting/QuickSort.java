package com.vipul.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int [] a = {0,1,12,3,4,5,6,7,8,9};//{5,4,8,1,10,7};// {5,6,1,2,7,8,4};//{9,8,7,6,5,4,3,2,1};
		quickSort(a, 0 , a.length - 1);
		System.out.println("from main" + Arrays.toString(a));
	}

	static void quickSort(int [] a, int start,int end) {
		int partitionIndex = partition(a,start,end);
		if(start < end) {
			quickSort(a,start,partitionIndex - 1);
			quickSort(a,partitionIndex + 1, end);
		}
	}

	static int partition(int[] a ,int start, int end) {
	    int pindex = start;
	    if(start < end) {
		    int pivot = a[end];
		    int temp;
		    for (int i = start; i < end  ; i++) {
			    if(a[i] < pivot) {
					temp = a[i];
				    a[i] = a[pindex];
				    a[pindex] = temp;
				    pindex++;
				    System.out.println("before" + Arrays.toString(a));
				}
		    }
			temp = a[end];
			a[end] = a[pindex];
			a[pindex] = temp;
			System.out.println("after" + Arrays.toString(a));
		   }
		System.out.println(pindex);
		return pindex;
	}


}
