package com.vipul;

import java.util.ArrayList;
import java.util.List;

public class BruteForceCombinationApproach {
    static int counter = 0;
    public static void main(String[] args) {
        int N = 5;
        List<String> list = new ArrayList<>();

        // set the staring index
        for (int i = 1; i <= N; i ++) {
            list.add(String.valueOf(i));

            // for the index fetch all the combination
            combinationBruteForceApproach(list, N, i, String.valueOf(i));
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(counter++);
    }

    private static void combinationBruteForceApproach(List<String> list, int N, int index, String str) {
        if (index == N) {
            return;
        }
        String temp = str;

        // from (i + 1)th place call recursively to the Nth place
        // each call recursively fetch next index from the starting index
        // and while continue the loop for starting index in that method call goes to the Nth value
        // and build all the possible combination.
        for (int j = index + 1; j <= N; j++) {
            str += String.valueOf(j);
            list.add(str);
            combinationBruteForceApproach(list, N, j, str);
            str = temp;
            counter ++;
        }
    }
}