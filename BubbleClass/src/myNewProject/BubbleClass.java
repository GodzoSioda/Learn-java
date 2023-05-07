package myNewProject;

public class BubbleClass {

	public static void main(String[] args) {
		
		int[] array = {0, 10, 15, 20};
		int length = array.length;
	    int count1 = 0;
	    int	count2 = 0;
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length-1; i ++) {
			if (array[i] > array[i+1]) {
				int k = array[i+1];
				array[i+1] = array[i];
				array[i] = k;
				count1++;
				}
			count2++;
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
			}
		    System.out.println();
		    System.out.println(count1);
		    System.out.print(count2);
	}

}
