package huares;

public class Encoder {

	public static String encoding(int n) {
		int[] dateArr = fillNumericArray(n);
		return romeMillennium(dateArr) + romanNumerals(dateArr[1], "C", "D", "M") +
				romanNumerals(dateArr[2], "X", "L", "C") + romanNumerals(dateArr[3], "I", "V", "X");
	}
	
	public static int[] fillNumericArray(int date) {
		int[] arr = new int[4];
		int divisor = 1000;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = date / divisor;
			date -= arr[i] * divisor;
			divisor /= 10;
		}
		return arr;
	}
	
	private static String romanNumerals(int number, String min, String middle, String max) {
		String result = "";
		if(number == 4) result = min + middle;
		if(number == 9) result = min + max;
		if(number < 4) {
			for(int i = number; i > 0; i--) {
				result += min;
			}
		} else if(number > 4 && number < 9) {
			result = middle;
			for(int i = number - 5; i > 0; i--) {
				result += min;
			}
		}
		return result;
	}
	
	public static String romeMillennium(int[] arr) {
		String result = "";
		for(int i = arr[0]; i > 0; i--) {
			result += "M";
		}
		return result;
	}
	
}
