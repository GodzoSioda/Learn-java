package myNewProject;

public class BinarySearchTree {

	private TreeNode root;
	private String tree = "";

	public void add(int value) {
		TreeNode node = new TreeNode(value);
		if (root == null) {
			root = node;
		} else {
			TreeNode current = root;
			while (true) {
				if (value <= current.getValue()) {
					if (current.getLeftChild() == null) {
						current.setLeftChild(node);
						node.setParentsNode(current);
						node.setLeft(true);
						return;
					} else {
						current = current.getLeftChild();
					}
				} else {
					if (current.getRightChild() == null) {
						current.setRightChild(node);
						node.setParentsNode(current);
						return;
					} else {
						current = current.getRightChild();
					}
				}
			}
		}
	}

	public String prettyPrint() {
		if (root.getLeftChild() != null) {
			traverseSubtreeInDepth(root.getLeftChild(), root);
		}
		if (root != null) {
			fillTree(root);
		}
		if (root.getRightChild() != null) {
			traverseSubtreeInDepth(root.getRightChild(), root);
		}
		return tree;
	}
	
	private void fillTree(TreeNode node) {
		StringBuilder builder = new StringBuilder();
		builder.append(node.getValue());
		if (node.getLeftChild() != null && node.getRightChild() != null) {
			char ch = (char) 9515;
			builder.append(ch);
		} else if (node.getLeftChild() != null && node.getRightChild() == null) {
			char ch = (char) 9499;
			builder.append(ch);
		} else if (node.getRightChild() != null && node.getLeftChild() == null) {
			char ch = (char) 9491;
			builder.append(ch);
		}
		if (node.getParentsNode() != null && node.isLeft()) {
			char ch = (char) 9495;
			builder.insert(0, ch);
		} else if (node.getParentsNode() != null) {
			char ch = (char) 9487;
			builder.insert(0, ch);
		}
		TreeNode current = node.getParentsNode();
		while (current != null) {
			String gap = "" + current.getValue();
			builder.insert(0, " ".repeat(gap.length()));
			if (current == root) {
				
			} else if (node.getValue() > current.getValue() && node.getValue() < current.getParentsNode().getValue()
					|| node.getValue() < current.getValue() && node.getValue() > current.getParentsNode().getValue()) {
				char ch = (char) 9475;
				builder.insert(0, ch);
			} else {
				builder.insert(0, " ");
			}
			current = current.getParentsNode();
		}
		if (!tree.isEmpty()) {
			builder.insert(0, "\n");
		}
		tree = tree.concat(builder.toString());
	}
	
	private void traverseSubtreeInDepth(TreeNode startNode, TreeNode stopNode) {
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
	
	private TreeNode searchMinNodeInSubtree(TreeNode current) {
		while (current.getLeftChild() != null) {
			current = current.getLeftChild();
		}
		return current;
	}
}
