package com.vipul.sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeSortNew {
    static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        int[] arr = {32, 10, 8, 12, 6, 44, 1, 5, 8};
        divide(0, arr.length - 1, arr);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param start
     * @param end
     * @param arr
     * Division of an array happened to divide array in such a way that we get single element
     * array, then we can compare individual array and merge them.
     */
    static void divide(int start, int end, int[] arr) {
        // if only one element then return
        if (start == end) {
            return;
        }
        // find the mid element from where we have to divide array
        int midElement = getMidElement(start, end);
        // first part to be divided
        divide(start, midElement, arr);
        // second part to be divided
        divide(midElement + 1, end, arr);

        merge(start, end, arr);
    }

    static void merge(int start, int end, int[] arr) {
        int leftArrayIndex = start;
        int midElement = getMidElement(start, end);
        int rightArrayElement = midElement + 1;

        // it acts as a supporting queue to filled compared elements in sorted order
        linkedList.clear();

        for (int i = start; i <= end; i ++) {
            // check if all elements in left array are already less than right array
            if (leftArrayIndex > midElement) {
                linkedList.add(Integer.valueOf(arr[rightArrayElement]));
                rightArrayElement ++;
            } else if (rightArrayElement > end) {
                linkedList.add(Integer.valueOf(arr[leftArrayIndex]));
                leftArrayIndex ++;
            } else {
                if (arr[leftArrayIndex] < arr[rightArrayElement]) {
                    linkedList.add(Integer.valueOf(arr[leftArrayIndex]));
                    leftArrayIndex ++;
                } else {
                    linkedList.add(Integer.valueOf(arr[rightArrayElement]));
                    rightArrayElement ++;
                }
            }
        }

        // update the array from start and end index
        for (int m = start; m <= end; m ++) {
            arr[m] = linkedList.pop().intValue();
        }
    }

    private static int getMidElement(int start, int end) {
        return (start + end)/2;
    }

}