package huares;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseDigitTest {

	int[] test_1 = {1, 2, 10, 8};
	int[] test_11 = {8, 10};
	int[] test_2 = {1, 5, 87, 45, 8, 8};
	int[] test_21 = {45, 87};
	int[] test_3 = {1, 3, 10, 0};
	int[] test_31 = {3, 10};
	int[] nonRevAr = {3, 5, 2, 3, 1};
	int[] revAr = {1, 3, 2, 5, 3};
	
	@Test
	public void findArrTest() {
		Assert.assertEquals(ReverseDigit.findArr(35231), revAr);
	}
	
	@Test
	public void findDivisorTest() {
		Assert.assertEquals(ReverseDigit.findDivisor(5), 10000);
	}
	
	@Test
	public void reverseArrTest() {
	   Assert.assertEquals(ReverseDigit.reverseArr(nonRevAr), revAr);	
	}
	
	@Test
	public void countDigitsNumberTest() {
		Assert.assertEquals(ReverseDigit.countDigitsNumber(12345), 5);
	}
	
	@Test
	public void fillArrTest() {
		Assert.assertEquals(ReverseDigit.fillArr(13253), revAr);
	}
}
