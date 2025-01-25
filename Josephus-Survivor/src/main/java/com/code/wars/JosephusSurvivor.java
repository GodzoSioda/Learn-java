package com.code.wars;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

	public static int[] findOutSequence(int amount, int step) {
		int[] array = getArray(amount);
		List<Integer> list = new ArrayList<>(amount);
		int startPos = 0;
		while(arrayIsNotEmpty(array)) {
			int outPos = findOutPos(array, step, startPos, 0);
			list.add(array[outPos]);
			array[outPos] = 0;
			startPos = outPos +1;
					}
		int[] resultArray = list.stream().mapToInt(Integer::intValue).toArray();
		return resultArray;
	}
	
	public static int findOutPos(int[] array, int step, int startPos, int posCounter) {
		for(int i = startPos; i < array.length; i++) {
			if(array[i] != 0) {
				posCounter += 1;
			}
			if(posCounter == step) {
				return i;
			}
		}
		return findOutPos(array, step, 0, posCounter);
	}
	
	public static int[] getArray(int amount) {
		int[] array = new int[amount];
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
