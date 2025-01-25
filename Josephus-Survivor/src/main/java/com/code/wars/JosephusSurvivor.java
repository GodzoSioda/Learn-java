package com.code.wars;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

	public static int findOutSequence(int n, int k) {
		int[] array = getArray(n);
		List<Integer> list = new ArrayList<>(n);
		int startPos = 0;
		while(arrayIsNotEmpty(array)) {
			int outPos = findOutPos(array, k, startPos, 0);
			list.add(array[outPos]);
			array[outPos] = 0;
			startPos = outPos +1;
					}
		int[] resultArray = list.stream().mapToInt(Integer::intValue).toArray();
		return resultArray[resultArray.length -1];
	}
	
	public static int findOutPos(int[] array, int k, int startPos, int posCounter) {
		for(int i = startPos; i < array.length; i++) {
			if(array[i] != 0) {
				posCounter += 1;
			}
			if(posCounter == k) {
				return i;
			}
		}
		return findOutPos(array, k, 0, posCounter);
	}
	
	public static int[] getArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = i +1;
		}
		return array;
	}
	
	public static boolean arrayIsNotEmpty(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				return true;
			}
		}
		return false;
	}
}
