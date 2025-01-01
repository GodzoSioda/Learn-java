package com.good.day;

public class Finder {

	public static int findTargetDigits(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(checkArr(arr, arr[i])) {
				result = arr[i];
			}
		}
		return result;
	}


	public static boolean checkArr(int[] arr, int digit) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == digit)
				count++;
		}
		return count % 2 != 0;
	}

}
