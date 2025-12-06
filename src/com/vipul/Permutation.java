package com.vipul;

import com.vipul.problemsolving.StringRotation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	static String str = "abcdef";

	public static void main(String[] args) {
//		 stringInnerRotation(str, 0);
		List<String> list = performRotation(List.of(str), 0);
		System.out.println(list.size());
		for (int  i =0; i < list.size();  i ++) {

			System.out.println(list.get(i));
		}
	}

	/**
	 * @param str
	 * @param rotationCount
	 * first find combination for given string,
	 * then with iteration fix elements of the str and find combination
	 * example for abcdef, first combination return six string.
	 * then fix first element, and rotation remaining five elements and so on.
	 * Each Rotation set will return more combination,
	 * then that each combination will become input for next rotation until
	 * we have only two element left for rotation.
	 *
	 *
	 * 			 * Input - abcd - abcd
	 * 			 * 				  dabc
	 * 			 * 				  cdab
	 * 			 * 				  bcda
	 * 			 *
	 * 			 * abcd -  a bcd - ab cd
	 * 			 *               - ab dc
	 * 			 * 		   a dbc - ad bc
	 * 			 *               - ad cd
	 * 			 * 	       a cdb - ac db
	 * 			 *                 ac bd
	 * 			 *
	 * 			 *Possible Combination = No of Rotation = No of elements
	 */
	private static void stringInnerRotation(String str, int rotationCount) {
		List<String> finalList = new ArrayList<>();
		List<String> currentList = new ArrayList<>();
		List<String> nextList = new ArrayList<>();
		
		currentList.add(str);
		
		// at least two elements are required for rotation
		while ( rotationCount <= (str.length() - 2) ) {
			nextList.clear();
			for (int i = 0; i < currentList.size(); i ++) {
				 nextList.addAll(StringRotation.getRotations(currentList.get(i), rotationCount));
			}
			 
			if (rotationCount == (str.length() - 2)) {
				finalList.addAll(nextList);
			}
			currentList.clear();
			currentList.addAll(nextList);
			rotationCount++;

		}
		
		// For Debugging
		System.out.println(finalList.size());
	 	for (int  i =0; i < currentList.size();  i ++) {
			 
			 System.out.println(currentList.get(i));
		}
	}

	// Recursion
	static List<String> performRotation(List<String> permutationList, int rotationCount) {
		List<String> newPermutationsList = new ArrayList<>();
		if (rotationCount > (str.length() - 2)) {
			return permutationList;
		}
		for (String permutation : permutationList) {
			newPermutationsList.addAll(StringRotation.getRotations(permutation, rotationCount));
		}
		return performRotation(newPermutationsList, ++ rotationCount);
	}

}
// Can Use String Rotation