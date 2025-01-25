package com.code.wars;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JosephusSurvivorTest {

	private static int[] startArray = {1,2,3,4,5,6,7};
	private static int[] finishArray = {3,6,2,7,5,1,4};
	private static int[] emptyArray = {0,0,0,0,0};
	private static int[] notEmptyArray = {0,1,5,0};
	private static int[] ar1 = {1,4,5};
	private static int[] ar2 = {1,4};
	private static int[] ar3 = {4};
	
	@Test
	public static void findOutSequenceTest() {
		Assert.assertEquals(JosephusSurvivor.findOutSequence(7, 3), finishArray);
	}
	
	@Test
	public static void findOutPosTest() {
		Assert.assertEquals(JosephusSurvivor.findOutPos(startArray, 3, 0, 0), 2);
		Assert.assertEquals(JosephusSurvivor.findOutPos(startArray, 3, 3, 0), 5);
		Assert.assertEquals(JosephusSurvivor.findOutPos(notEmptyArray, 3, 0, 0), 1);
		Assert.assertEquals(JosephusSurvivor.findOutPos(ar1, 3, 3, 0), 2, "ar1");
		Assert.assertEquals(JosephusSurvivor.findOutPos(ar2, 3, 2, 0), 0, "ar2");
		Assert.assertEquals(JosephusSurvivor.findOutPos(ar3, 3, 1, 0), 0, "ar3");
	}
	
	@Test
	public static void getArrayTest() {
		Assert.assertEquals(JosephusSurvivor.getArray(7), startArray);
	}
	
	@Test
	public static void arrayIsNotEmptyTest() {
		Assert.assertTrue(JosephusSurvivor.arrayIsNotEmpty(startArray));
		Assert.assertTrue(JosephusSurvivor.arrayIsNotEmpty(finishArray));
		Assert.assertTrue(JosephusSurvivor.arrayIsNotEmpty(notEmptyArray));
		Assert.assertFalse(JosephusSurvivor.arrayIsNotEmpty(emptyArray));
	}
}
