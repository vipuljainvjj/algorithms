package com.vipul.sorting;

import java.util.Arrays;

public class InsertionSortNew {

    public static void main(String[] args) {
        int[] arr = {32, 10, 8, 12, 6, 44, 1, 5};

        for (int i = 0; i < (arr.length - 1); i ++) {
            if (arr[i] > arr[i + 1]) {

                // swap elements
                int element = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = element;

                for (int j = i; j > 0; j -- ) {

                    if (arr[j] < arr[j-1]) {
                        // swap elements
                        int value = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = value;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

}
