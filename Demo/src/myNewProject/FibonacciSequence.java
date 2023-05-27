package myNewProject;

public class FibonacciSequence {
	
	public long sequence(int number) {
		long first = 0;
		long second = 1; 
		long third = 1L;
		if (number < 0) {
			return -1L;
		} else if (number == 0) {
			return first;
		} else if (number == 1) {
			return second;
		} else {
			for (int i=2; i<=number; i++) {
				second = first;
				first = third;
				third = first + second;
			}
			return third;
		}
	}

}
