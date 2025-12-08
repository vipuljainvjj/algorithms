package com.vipul;

public class Palindrone {

    public static void main(String[] args) {
//      for a string to be palindrone
//      first Element and last element of a string should be equal
//      second Element and second last element of a string should be equal
//      and so on.....

//      String str = "Never Odd or Even";
        String str = "Madam";

        // Replace inner space
        // case-insensitive
        str = str.replaceAll("\\s+", "").toLowerCase();

        // create an array for easy comparison
        char[] arr = str.toCharArray();

        // get the middle element to control the loop
        int midElement = (str.length() - 1)/2;
        boolean isPalindrone = true;

        for (int i = 0; i <= midElement; i ++) {

            if (arr[i] != arr[arr.length - i - 1]) {
                isPalindrone = false;
                break;
            }

        }
        if (isPalindrone) {
            System.out.println("String is Palindrone");
        } else {
            System.out.println("String is not Palindrone");
        }
    }
}
