package com.vipul;

import java.util.ArrayList;
import java.util.List;

public class BruteForceLoopingApproach {

    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        int N = 3;
        String temp1 = "";

        for (int i = 1; i <= N; i ++) {
            String str = String.valueOf(i);
            list.add(str);
            String temp2 = str;

            for (int j = i + 1; j <= N; j ++) {
                str += String.valueOf(j);
                list.add(str);
                String temp3 = str;

                for (int k = j + 1; k <= N; k ++) {
                    str += String.valueOf(k);
                    list.add(str);
                    //reset the value
                    str = temp3;
                }
                //reset the value
                str = temp2;
            }
            //reset the value
            str = temp1;
        }
        System.out.println(list);
    }
}
