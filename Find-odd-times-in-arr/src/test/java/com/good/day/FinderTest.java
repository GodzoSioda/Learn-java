package com.good.day;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FinderTest {

	int[] test_1 = {7};
	int[] test_2 = {0};
	int[] test_3 = {1, 1, 2};
	int[] test_4 = {0,1,0,1,0};
	int[] test_5 = {1,2,2,3,3,3,4,3,3,3,2,2,1};
	int[] test_6 = {0,1,0,1,5};
	
	@Test
	public void findTargetDigitsTest() {
		Assert.assertEquals(Finder.findTargetDigits(test_1), 7, "test 1");
		Assert.assertEquals(Finder.findTargetDigits(test_2), 0, "test 2");
		Assert.assertEquals(Finder.findTargetDigits(test_6), 5, "test 6");
		Assert.assertEquals(Finder.findTargetDigits(test_3), 2, "test 3");
		Assert.assertEquals(Finder.findTargetDigits(test_4), 0, "test 4");
		Assert.assertEquals(Finder.findTargetDigits(test_5), 4, "test 5");
	}
		
	@Test
	public void checkArrTest() {
		Assert.assertTrue(Finder.checkArr(test_1, 7));
		Assert.assertTrue(Finder.checkArr(test_2, 0));
		Assert.assertFalse(Finder.checkArr(test_4, 1));
		Assert.assertTrue(Finder.checkArr(test_5, 4));
	}
	
}
