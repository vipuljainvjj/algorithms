package com.vipul.problemsolving;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {
        String str = "abcd";
        // Right Rotation
        rotationUsingVariables(str);
        rotationUsingDoublingString(str);
    }

    private static void rotationUsingVariables(String str) {
        char[] array = str.toCharArray();
        char replacingValue = array[0];
        char replacedValue = array[0];

        for (int i = 0; i < array.length - 1; i ++) {
            replacedValue = array[i + 1];
            array[i + 1] = replacingValue;
            replacingValue = replacedValue;

        }
        array[0] = replacingValue;
        System.out.println(Arrays.toString(array));
    }

    private static void rotationUsingDoublingString(String str) {
        String temp = str + str;
        System.out.println(temp.substring(str.length() -1, temp.length() - 1));
    }

}