package com.vipul.problemsolving;

public class SortedArraysElementComparison {

    public static void main(String[] args) {
        int[] arr1 = {13, 27, 35, 40, 49, 55, 60};
        int[] arr2 = {17, 35, 39, 40, 55, 58, 60};

        // take element of arr1 and search in arr2
        int arr1Index = 0;
        int arr2Index = 0;

        for (; arr1Index < arr1.length; ) {
            if (arr1[arr1Index] == arr2[arr2Index]) {
                System.out.println(arr1[arr1Index]);
                arr1Index ++;
                arr2Index ++;
            } else if (arr1[arr1Index] < arr2[arr2Index]) {
                arr1Index ++;
            } else if (arr1[arr1Index] > arr2[arr2Index]) {
                arr2Index ++;
            }
        }

    }

}