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
		int biggerValuePos = searchBiggerValuePos(arr, pivot, finishPos);
		int smallestValuePos = searchSmallestValuePos(arr, pivot, finishPos);
		while(biggerValuePos <= smallestValuePos) {
			swap(arr, biggerValuePos, smallestValuePos);
			biggerValuePos = searchBiggerValuePos(arr, pivot, finishPos);
			smallestValuePos = searchSmallestValuePos(arr, pivot, finishPos);
			}
		swap(arr, pivot, smallestValuePos);
		return smallestValuePos;
	}
	
	public static int searchBiggerValuePos(int[] arr, int pivot, int finishPos) {
		int position = pivot;
		for(int i = pivot +1; i <= finishPos; i++) {
			if(arr[i] > arr[pivot]) {
				position = i;
				break;
			}
		}
		return position;
	}
	
	public static int searchSmallestValuePos(int[] arr, int pivot, int reverseStartPos) {
		int position = pivot;
		for(int j = reverseStartPos; j > pivot; j--) {
			if(arr[j] < arr[pivot]) {
				position = j;
				break;
			}
		}
		return position;
	}
	
	public static void swap(int[] ar, int biggerValuePos, int smallestValuePos) {
		int temp = ar[biggerValuePos];
		ar[biggerValuePos] = ar[smallestValuePos];
		ar[smallestValuePos] = temp;
		if(biggerValuePos != smallestValuePos) {
		list.add(Arrays.copyOf(ar, ar.length));
		}
	}
}
