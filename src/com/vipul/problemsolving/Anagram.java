package com.vipul.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abba"));
    }

    static int sherlockAndAnagrams(String s) {
        List<String> subElements = new ArrayList<>();
        int anagramPresent = 0;

        for (int j = 1; j < s.length(); j ++) {
            int position = j;
            subElements = new ArrayList<>();
            for (int k = 0; k < s.length(); k ++, position ++) {
                if (position <= s.length()) {
                    subElements.add(s.substring(k,position));
                }
            }
            anagramPresent += checkListAnagrams(subElements);
        }
        return anagramPresent;
    }

    private static int checkListAnagrams(List<String> subElements) {
        int anagramPresent = 0;
        for (int i = 0; i < subElements.size(); i ++) {

            for (int j = (i + 1); j < subElements.size(); j++) {
                if (checkAnagram(subElements.get(i), subElements.get(j))) {
                    anagramPresent ++;
                }
            }
        }
        return anagramPresent;
    }

    private static boolean checkAnagram(String str1, String str2) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        boolean anagram = true;

        for (int  i = 0; i < str1.length() ; i ++) {

            if (str2.indexOf(str1.charAt(i)) > -1) {
                if (charIndexMap.containsKey(str1.charAt(i))) {
                    int index = charIndexMap.get(str1.charAt(i)) + 1;

                    if (str2.indexOf(str1.charAt(i), index) > -1) {
                        charIndexMap.put(str1.charAt(i), str2.indexOf(str1.charAt(i), index));
                    } else {
                        anagram = false;
                    }
                } else {
                    charIndexMap.put(str1.charAt(i), str2.indexOf(str1.charAt(i)));
                }
            } else {
                anagram = false;
            }
        }
        return anagram;

    }

}
