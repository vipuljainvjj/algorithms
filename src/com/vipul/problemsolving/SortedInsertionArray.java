package com.vipul.problemsolving;

import java.util.*;

public class SortedInsertionArray {

    /**
     * Inserting the data inside array in an sorted mannner
     * range method is finding the new element location
     * and then inserted into the array and rest of the elements larger than it
     * moved to the right
     */
    public static void main(String[] args) {
        String insertStr = "seartchingalgo";
        List<String> keys = new ArrayList<>();

        for (int i = 0; i < insertStr.length(); i ++) {
            put(keys, String.valueOf(insertStr.charAt(i)));
        }

        System.out.println(keys);
    }

    static String get(List<String> keys, List<Integer> values, String search) {
        int key = rangeZeroIndex(keys, search);

        if (search.compareTo(keys.get(key)) == 0) {
            return keys.get(key);
        }
        return null;
    }

    static void put(List<String> keys, String search) {
        // fetch right location to insert value
        int key = rangeZeroIndex(keys, search);
        if (keys.size() > key && keys.get(key) != null && search.compareTo(keys.get(key)) == 0) {
            keys.set(key, search);
        } else {
            keys.add(search);
            String replacingValue = "";
            String replacedValue = "";
            if (keys.size() > key && keys.get(key) != null) {
                replacingValue = keys.get(key);
                keys.set(key, search);
            }
            // right shift the values
            for (int i = key; i < keys.size() - 1; i ++) {
                replacedValue = keys.get(i + 1);
                keys.set(i+1, replacingValue);
                replacingValue = replacedValue;

            }
        }
    }

    /**
     *
     * low is taken from zero and high is considered size - 1
     * when the element is not found returning mid index or low index based on the condition executed
     */
    static int rangeZeroIndex(List<String> keys, String search) {
        int lo = 0;
        int hi = keys.size() - 1;
        int mid = (lo + hi)/2;

        while (hi >= lo) {
            mid = (lo + hi)/2;
            if (search.compareTo(keys.get(mid)) == 0) {
                return mid;
            } else if (search.compareTo(keys.get(mid)) < 0) {
                hi = mid - 1;
            } else if (search.compareTo(keys.get(mid)) > 0) {
                lo = mid + 1;
                mid = lo; // if the element is not found, and element is greater than mid element then take the next index as the replacing key.
            }
        }
        return mid;
    }

}