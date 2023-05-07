package myNewProject;

public class ShellsortClass {

	public static void main(String[] args) {
		int[] array = {23, 2, 10, 14, 9};
		int length = array.length;
		
		for (int gap=length/2; gap>0; gap/=2){
			for (int i=gap; i<length; i++){
				int temp=array[i];
				int j;
            for (j=i; j>=gap && array[j-gap]>temp; j-=gap){
                array[j]=array[j-gap];
                }
                array[j]=temp;
            }
        }
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
