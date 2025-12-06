package com.vipul;

public class BruteForcePermutationApproach {

    static int counter = 0;
    public static void main(String[] args) {

        String str = "abcde";

        for (int i = 0; i < str.length(); i ++) {
            permutation(str, i, "");
        }
        System.out.println(counter ++);

    }

    static void permutation(String str, int index, String temp) {
        if (index == str.length()) {
            return;
        }
        //index++;
        temp += String.valueOf(str.charAt(index));
        for (int i = index + 1; i < str.length(); i++) {
            permutation(str, i, temp);
            System.out.print(temp + " ");
            counter ++;
        }
    }


}
