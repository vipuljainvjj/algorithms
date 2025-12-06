package com.vipul.pattern;

public class Diamond {

    /**
     * @param args
     *
     * find the length of the diamond
     * find the mid of the diamond
     * Print * for (mid - i) and (mid + i) where i start at 0 and end at mid
     *
     */

    public static void main(String[] args) {
        int diamondSize = 9;
        int mid = diamondSize/2;

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < diamondSize; j ++) {
                if (j == (mid + i) || j == (mid - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = mid-1; i >= 0; i--) {
            for (int j = 0; j < diamondSize; j ++) {
                if (j == (mid + i) || j == (mid - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }

}
