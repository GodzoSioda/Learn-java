package myNewProject;

public class BinarySearch {
	
	public static void main(String[] args) {
		int p = 51;
		int[] ar = {10, 21, 31, 40, 51, 63, 77, 87, 98, 101};
		System.out.print(search(ar, p));
	  }
	
	public static int search(int[] array, int number) {
		    int min = 0;
		    int max = array.length;
		for(int i = max /2; i != 0; i /= 2) {
			   i += min;
			if(array[i] == number) {
				return i;
			} else if (array[i] < number) {
				min = i;
			} else if (array[i] > number) {
				max = i;
			}
			  i = max - min;
		}
		return -1;
	}

}
