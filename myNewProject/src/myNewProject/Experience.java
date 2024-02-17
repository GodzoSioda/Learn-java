package myNewProject;

public class Experience {

	public static void main(String[] args) {

		int[] arr1 = {123, 11, 200, 1, 100, 150, 2000};
		int[] arr2 = {931, 39, 196, 385, 388, 207, 185, 955, 957, 542, 904, 498, 394};
		int[] arr3 = {5, 4, 2};
		BinarySearchTree tree = new BinarySearchTree();
		
		for(int digit : arr1) {
		tree.addNode(digit);
		}
		//System.out.println(tree.getAmountNodes());
		tree.traverseInDepth();
		//tree.printTree();
		/*System.out.println(tree.getAmountNodes());
		TreeNode result = tree.findNode(39);
		if (result != null) {
		System.out.println(result.toString());
		} else {
			System.out.println("result is null");
		}
		tree.printString(result);
		int value = 957;
		String str1 = "\n"; 
		String str2 = "" + value;
		StringBuilder builder = new StringBuilder(str1);
		builder.insert(0 , value);
		builder.append(str2);
		System.out.println(builder);
		//System.out.println(str1);*/
		
	}

	
}
