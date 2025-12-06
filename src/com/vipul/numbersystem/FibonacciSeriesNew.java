package com.vipul.numbersystem;

public class FibonacciSeriesNew {

    public static void main(String[] args) {

//        System.out.println(getFibonacciSeries(0));
//        System.out.println(getFibonacciSeries(1));
//        System.out.println(getFibonacciSeries(2));
//        System.out.println(getFibonacciSeries(3));
//        System.out.println(getFibonacciSeries(4));
        System.out.println(getFibonacciSeries(5));
        getFibonacciSeries1(5-2, 0, 1);

        //getFibonacciSeries(5 ) = getFibonacciSeries(4) + getFibonacciSeries(3) + getFibonacciSeries(2) + getFibonacciSeries(1) + getFibonacciSeries(0);
    }

    static int getFibonacciSeries(int N) {

        if (N == 0) {
            return 0;
        }

        if (N == 1) {
            return 1;
        }

        return getFibonacciSeries(--N) + getFibonacciSeries(--N);

    }

    static void getFibonacciSeries1(int N, int x, int y) {

        if (N == 0) {
            return;
        }
        int sum  = x + y;
        System.out.println(sum);
        getFibonacciSeries1(--N, y, sum);

    }

}