package binarySearchTree;

public class Tree01 {
	private TreeNode01 root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode01(value);
		} else {
			root.insert(value);
		}
	}

	public TreeNode01 get(int value) {
		if (root != null) {
			return root.get(value);
		}
		return null;
	}
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode01 delete(TreeNode01 subtreeRoot, int value) {
		if (subtreeRoot == null) {
			return subtreeRoot;
		}
		if (value < subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		} else if (value > subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		} else {
			//case 1 and 2
			if (subtreeRoot.getLeftChild() == null) {
				return subtreeRoot.getRightChild();
			} else if (subtreeRoot.getRightChild() == null) {
				return subtreeRoot.getLeftChild();
			}
			
			//case 3: node to delete has 2 children
			//replace the value in the subtreeRoot node with the smallest value
			//from the right subtree
			subtreeRoot.setData(subtreeRoot.getRightChild().min());
		
			//delete the node that has the smallest value in the right subtree.
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
			
		}
		return subtreeRoot;
	}
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			return root.max();
		}
	}
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	public void traversePreOrder() {
		if (root != null) {
			root.traversePreOrder();
		}
	}

	@Override
	public String toString() {
		return "Tree01 [root=" + root + "]";
	}
	
	
}
