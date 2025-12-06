package com.vipul.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistance {

    public static void main(String[] args) {
        //int a = 10, b = 5, c = 1, d = 6;
        int distanceCovered = 0;
        int element = 0;

        List<Integer> starting = initialize();
        List<Integer> ending = new ArrayList<>();

        if (!isEligible(starting)) {
            return;
        }

        element = Math.max(starting.get(0), starting.get(1));
        distanceCovered += element;
        ending.add(starting.get(0));
        ending.add(starting.get(1));
        starting.remove(0);
        starting.remove(0);

        while(starting.size() != 0) {
            distanceCovered += returnTravelling(starting, ending);
            distanceCovered += destinationTravelling(starting, ending);
        }

        System.out.println(starting);
        System.out.println(ending);
        System.out.println(distanceCovered);
    }

    private static List<Integer> initialize() {
        List<Integer> starting = new ArrayList<>();
        starting.add(Integer.valueOf(10));
        starting.add(Integer.valueOf(7));
        starting.add(Integer.valueOf(3));
        starting.add(Integer.valueOf(1));
        //starting.add(Integer.valueOf(8));
        starting.sort(Integer::compareTo);
        return starting;
    }

    static boolean isEligible(List<Integer> starting) {
        return starting.size() > 1;
    }

    static int destinationTravelling(List<Integer> starting, List<Integer> ending) {
        starting.sort(Integer::compareTo);
        int lastElement = starting.get(starting.size() - 1);
        int secondLastElement = starting.get(starting.size() - 2);
        final int reference = secondLastElement;

        if (!ending.stream().filter(endingElement -> endingElement < reference).findFirst().isPresent()) {
            if (starting.stream().filter(startingElement -> startingElement < reference).findFirst().isPresent()) {
                secondLastElement = starting.stream().filter(startingElement -> startingElement < reference).findFirst().get();
            }
        }

        int element = Math.max(lastElement, secondLastElement);
        ending.add(Integer.valueOf(lastElement));
        ending.add(Integer.valueOf(secondLastElement));
        starting.remove(Integer.valueOf(lastElement));
        starting.remove(Integer.valueOf(secondLastElement));
        return element;
    }

    static int returnTravelling(List<Integer> starting, List<Integer> ending) {
        ending.sort(Integer::compareTo);
        int fasterWalker = ending.get(0);
        ending.remove(Integer.valueOf(fasterWalker));
        starting.add(fasterWalker);
        return fasterWalker;
    }

}