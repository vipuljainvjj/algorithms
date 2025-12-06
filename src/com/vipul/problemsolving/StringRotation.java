package com.vipul.problemsolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringRotation {

    public static List<String> getRotations(String str, int startRotatingIndex) {
        List<String> rotations = new ArrayList<>();
        LinkedList<String> queue = new LinkedList<>();
        String prefix = str.substring(0, startRotatingIndex);

        // populate the queue with String
        for (int i = startRotatingIndex; i < str.length(); i ++) {
            queue.add(String.valueOf(str.charAt(i)));
        }

        // start the rotation at mentioned Index
        for (int i = startRotatingIndex; i < str.length(); i ++) {
            rotations.add(prefix + String.join("", queue));
            queue.add(queue.poll());
        }
//        System.out.println(rotation);
        return rotations;
    }
}
