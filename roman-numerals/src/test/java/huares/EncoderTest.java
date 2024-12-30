package huares;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EncoderTest {

		int[] minDateArr = {0, 0, 0, 1};
		int[] middleDateArr = {2, 0, 0, 0};
		int[] maxDateArr = {3, 9, 9, 9};
		int[] captureKiev = {1, 2, 4, 0};
		String minMessage = "A minimum date fail";
		String middleMessage = "A middle date fail";
		String maxMessage = "A maximum date fail";
		String kievMessage = "Mongols' capture of Kyiv was fail";
	
		
	@Test
	public void fillNumericArrayTest() {
		int minDate = 1;
		int middleDate = 2000;
		int maxDate = 3999;
		Assert.assertEquals(Encoder.fillNumericArray(minDate), minDateArr, minMessage);
		Assert.assertEquals(Encoder.fillNumericArray(middleDate), middleDateArr, middleMessage);
		Assert.assertEquals(Encoder.fillNumericArray(maxDate), maxDateArr, maxMessage);
	}
	
	@Test
	public void romeMillenniumTest() {
		Assert.assertEquals(Encoder.romeMillennium(minDateArr), "", minMessage);
		Assert.assertEquals(Encoder.romeMillennium(middleDateArr), "MM", middleMessage);
		Assert.assertEquals(Encoder.romeMillennium(maxDateArr), "MMM", maxMessage);
	}
	
	@Test
	public void encodingTest() {
		Assert.assertEquals(Encoder.encoding(1990), "MCMXC");
		Assert.assertEquals(Encoder.encoding(2008), "MMVIII");
		Assert.assertEquals(Encoder.encoding(1666), "MDCLXVI");
	}
}
