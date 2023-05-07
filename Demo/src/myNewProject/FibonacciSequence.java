package myNewProject;

public class FibonacciSequence {
	
	private final long first = 0;
	private final long second = 1;
	
	public long sequenceArray(int number) {
		long[] array = new long[number+1];
		array [0] = first;
		array [1] = second;
		if (number < 0){
			return -1L;
		} else {
			for (int i=2; i<array.length; i++) {
				array [i] = array [i-1] + array [i-2];
			}
		}
		return array [number];
	}
	
	public long sequence(int number) {
		long firstLocal = first;
		long secondLocal = second; 
		long third = 1L;
		if (number < 0) {
			return -1L;
		} else if (number == 0) {
			return first;
		} else if (number == 1) {
			return second;
		} else {
			for (int i=2; i<=number; i++) {
				secondLocal = firstLocal;
				firstLocal = third;
				third = firstLocal + secondLocal;
			}
			return third;
		}
	}

}
