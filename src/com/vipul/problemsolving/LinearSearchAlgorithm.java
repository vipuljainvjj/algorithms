package com.vipul.problemsolving;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearSearchAlgorithm {

    /*
    Hackerland is a one-dimensional city with houses aligned at integral locations along a road. The Mayor wants to install radio
    transmitters on the roofs of the city's houses. Each transmitter has a fixed range meaning it can transmit a signal to all
    houses within that number of units distance away.

    Given a map of Hackerland and the transmission range, determine the minimum number of transmitters so that every house is within
    range of at least one transmitter. Each transmitter must be installed on top of an existing house.
     */

    public static void main(String[] args) {
//        List<Integer> x = Arrays.asList(9, 5, 4, 2, 6, 15, 12);
        List<Integer> x = getList();
        int transmitterRange = 80;

        // sort the given list
        List<Integer> sortedList = x.stream().distinct().sorted().collect(Collectors.toList());

        // create a list with actual house location, if house is not there then set null
        List<Integer> actualLocation = new ArrayList<>();
        int j = 0;
        for(int i = 0 ; i < sortedList.size(); i ++) {
            while (j < sortedList.get(i)) {
                actualLocation.add(null);
                j ++;
            }
            actualLocation.add(sortedList.get(i));
            j = sortedList.get(i) + 1;
        }

        int i = 1;
        int minimumTransmitter = 0;

        while (i <actualLocation.size()) {

            // Identify the house location
            if (Objects.nonNull(actualLocation.get(i))) {
                // check if the house is present at transmitter Range location which is equal to current house + transmitterRange.
                if ( (i + transmitterRange) < actualLocation.size() && Objects.nonNull(actualLocation.get(i + transmitterRange))) {
                    i = i + 2*transmitterRange + 1;
                } else {
                    // if the house at (current house + transmitterRange), then identify a house just before it.
                    int m = i + transmitterRange - 1;
                    if (m >= actualLocation.size()) {
                        minimumTransmitter ++;
                        break;
                    } else {
                        for ( ; m >= i; m --) {
                            if (Objects.nonNull(actualLocation.get(m))) {
                                i = m + transmitterRange + 1;
                                break;
                            }
                        }
                    }
                }
                minimumTransmitter ++;
            } else {
                i++;
            }
        }
        System.out.println(minimumTransmitter);
    }


    static List<Integer> getList() {
        Path path = Paths.get("LinearSearchAlgorithm.txt");
        System.out.println(Files.exists(path));
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String str = list.get(0);

        String[] array = str.split(" ");

        return Stream.of(array).map(x -> Integer.valueOf(x)).collect(Collectors.toList());
    }
}
