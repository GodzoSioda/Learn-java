package com.android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	private static List <int[]> list = new ArrayList<int[]>();
	
	public static List<int[]> getList() {
		return list;
	}
	
	public static void recurtionSort(int[] ar, int pivot, int finishPos) {
		if(finishPos - pivot < 1) {
			return;
		} else {
			int ignoreValue = partitionSort(ar, pivot, finishPos);
			recurtionSort(ar, pivot, ignoreValue -1);
			recurtionSort(ar, ignoreValue +1, finishPos);
		}
	}
	
	public static int partitionSort(int[] arr, int pivot, int finishPos) {
		int startPos = pivot +1;
		for(;;) {
			for( ;startPos < finishPos && arr[startPos] < arr[pivot]; ) {
				startPos += 1;
			}
			for( ;arr[finishPos] > arr[pivot]; ) {
				finishPos -= 1;
			}
			if(startPos >= finishPos) {
				break;
			}
			swap(arr, startPos++, finishPos--);
		}
		swap(arr, pivot, finishPos);
		return finishPos;
	}
	
	public static void swap(int[] ar, int biggerValuePos, int smallestValuePos) {
		int temp = ar[biggerValuePos];
		ar[biggerValuePos] = ar[smallestValuePos];
		ar[smallestValuePos] = temp;
		list.add(Arrays.copyOf(ar, ar.length));
	}
}
