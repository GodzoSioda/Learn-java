package myNewProject;

public class BinarySearchTree {

	private TreeNode root;
	private int amountNodes;
	private int maxIndex;
	private String[] strings;
	private String tree = "";

	public int getAmountNodes() {
		return amountNodes;
	}

	public boolean addNode(int value) {
		TreeNode node = new TreeNode(value);
		if (root == null) {
			root = node;
			amountNodes += 1;
			node.setIndex(0);
			node.setLevel(0);
			return true;
		} else {
			TreeNode current = root;
			while (true) {
				if (value <= current.getValue()) {
					if (current.getLeftChild() == null) {
						current.setLeftChild(node);
						node.setParentsNode(current);
						amountNodes += 1;
						node.setIsLeft(true);
						node.setIndex((current.getIndex() * 2) + 1);
						node.setLevel(current.getLevel() + 1);
						tree = "";
						if (maxIndex < node.getIndex()) {
							maxIndex = node.getIndex();
						}
						return true;
					} else {
						current = current.getLeftChild();
					}
				} else {
					if (current.getRightChild() == null) {
						current.setRightChild(node);
						node.setParentsNode(current);
						amountNodes += 1;
						node.setIndex((current.getIndex() * 2) + 2);
						node.setLevel(current.getLevel() + 1);
						tree = "";
						if (maxIndex < node.getIndex()) {
							maxIndex = node.getIndex();
						}
						return true;
					} else {
						current = current.getRightChild();
					}
				}
			}
		}
	}

	public TreeNode findNode(int value) {
		TreeNode current = root;
		while (current != null) {
			if (current.getValue() == value) {
				return current;
			} else if (value <= current.getValue()) {
				current = current.getLeftChild();
			} else {
				current = current.getRightChild();
			}
		}
		return current;
	}

	public String prettyPrint() {
		if (!tree.isEmpty()) {
			return tree;
		} else {
			traverseInDepth();
			return tree;
		}
	}

	private void fillTree(TreeNode node) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(node.getValue());
		if (node.getLeftChild() != null || node.getRightChild() != null) {
			builder.append("|");
		}
		if (node.getParentsNode() != null) {
			builder.insert(0, "|");
		}
		TreeNode current = node.getParentsNode();
		while (current != null) {
			String gap = "" + current.getValue();
			builder.insert(0, " ".repeat(gap.length()));
			if (node.getValue() <= root.getValue() && node.getValue() >= current.getValue()) {
				builder.insert(0, "|");
			} else if (node.getValue() > root.getValue() && node.getValue() < current.getValue()) {
				builder.insert(0, "|");
			} else if (current.getParentsNode() != null) {
				builder.insert(0, " ");
			}
			current = current.getParentsNode();
		}
		if (!tree.isEmpty()) {
			builder.insert(0, "\n\n");
		}
		tree = tree.concat(builder.toString());
	}

	public void traverseInDepth() {
		if (root == null) {
			System.out.println("Tree is empty!");
			return;
		}
		if (root.getLeftChild() != null) {
			traverseSubtreeInDepth(root.getLeftChild(), root);
		}
		if (root != null) {
			fillTree(root);
		}
		if (root.getRightChild() != null) {
			traverseSubtreeInDepth(root.getRightChild(), root);
		}
	}

	public void traverseSubtreeInDepth(TreeNode startNode, TreeNode stopNode) {
		TreeNode currentMinNode = searchMinNodeInSubtree(startNode);
		while (currentMinNode != stopNode) {
			fillTree(currentMinNode);
			if (currentMinNode.getRightChild() == null) {
				currentMinNode = currentMinNode.getParentsNode();
			} else {
				traverseSubtreeInDepth(currentMinNode.getRightChild(), currentMinNode);
				currentMinNode = currentMinNode.getParentsNode();
			}
		}
	}

	public void traverseInBreadth(TreeNode node) {
		feelArray(node);
		if (node.getLeftChild() != null) {
			traverseInBreadth(node.getLeftChild());
		}
		if (node.getRightChild() != null) {
			traverseInBreadth(node.getRightChild());
		}
	}

	public void feelArray(TreeNode node) {
		String str = String.valueOf(node.getValue());
		strings[node.getIndex()] = str;
	}

	public void printTree() {
		if (root == null) {
			System.out.println("Tree is empty!");
		} else {
			strings = new String[maxIndex + 1];
			traverseInBreadth(root);
			for (int i = 0; i < strings.length; i++) {
				if (strings[i] != null) {
					System.out.println(strings[i] + "  index = " + i);
					System.out.println();
				}
			}
		}
	}

	public TreeNode searchMinNodeInSubtree(TreeNode current) {
		while (current.getLeftChild() != null) {
			current = current.getLeftChild();
		}
		return current;
	}

	public void printString(TreeNode node) {
		String result = "";
		String adds = "     ";
		for (int i = 1; i <= node.getLevel(); i++) {
			result = result.concat(adds);
		}
		System.out.println(result + node.getValue());
		System.out.println();
	}
}
