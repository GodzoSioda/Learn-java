package huares;

public class ReverseDigit {
	
	public static int[] findArr(int digit) {
		return reverseArr(fillArr(digit));
	}
	
	public static int[] fillArr(int digit) {
		int arrLength = countDigitsNumber(digit);
		int divisor = findDivisor(arrLength);
		int[] arr = new int[arrLength];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = digit / divisor;
			digit -= arr[i] * divisor;
			divisor /= 10;
		}
		return arr;
	}
	
	public static int findDivisor(int counter) {
		int divisor = 1;
		for(int i = 0; i < counter - 1; i++) {
			divisor *= 10;
		}
		return divisor;
	}
	
	public static int countDigitsNumber(int digit) {
		int counter = 0;
		while(digit > 0) {
			digit /= 10;
			counter++;
		}
		return counter;
	}
	
	public static int[] reverseArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		int counter = 0;
		for(int i = oldArr.length - 1; i >= 0; i--) {
			newArr[counter] = oldArr[i];
			counter += 1;
		}
		return newArr;
	}
}
