package com.android;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickSortTest {

	private static int[] arr1 = {30, 50, 5, 30, 51, 10, 20, 99, 18, 30, 100, 33};
	private static int[] arr2 = {30, 18, 5, 30, 51, 10, 20, 99, 50, 30, 100, 33};
	private static int[] arr3 = {30, 18, 5, 30, 20, 10, 51, 99, 50, 30, 100, 33};
	private static int[] arr4 = {10, 18, 5, 30, 20, 30, 51, 99, 50, 30, 100, 33};
	private static int[] arr5 = {5, 10, 18, 20, 30, 30, 30, 33, 50, 51, 99, 100};
	
	@Test
	public static void recurtionSortTest() {
		int[] newArr = Arrays.copyOf(arr1, arr1.length);
		QuickSort.recurtionSort(newArr, 0, newArr.length -1);
		Assert.assertEquals(newArr, arr5);
	}
	
	@Test
	public static void partitionSortTest() {
		int[] newArr = Arrays.copyOf(arr1, arr1.length);
		Assert.assertEquals(QuickSort.partitionSort(newArr, 0, arr1.length -1), 5);
		Assert.assertEquals(newArr, arr4);
	}
	
	@Test
	public static void searchBiggerValue() {
		Assert.assertEquals(QuickSort.searchBiggerValuePos(arr1, 0, arr1.length -1), 1);
		Assert.assertEquals(QuickSort.searchBiggerValuePos(arr2, 0, arr1.length -1), 4);
		Assert.assertEquals(QuickSort.searchBiggerValuePos(arr3, 0, arr1.length -1), 6);
	}
	
	@Test
	public static void searchSmallestValueTest() {
		Assert.assertEquals(QuickSort.searchSmallestValuePos(arr1, 0, arr1.length -1), 8);
		Assert.assertEquals(QuickSort.searchSmallestValuePos(arr2, 0, arr1.length -1), 6);
		Assert.assertEquals(QuickSort.searchSmallestValuePos(arr3, 0, arr1.length -1), 5);
	}
	
	@Test
	public static void swapTest() {
		int[] newArr = Arrays.copyOf(arr1, arr1.length);
		QuickSort.swap(newArr, 1, 8);
		Assert.assertEquals(newArr, arr2);
	}
}
