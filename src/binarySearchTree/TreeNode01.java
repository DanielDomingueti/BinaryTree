package binarySearchTree;

public class TreeNode01 {

	private int data;
	private TreeNode01 leftChild;
	private TreeNode01 rightChild;

	public TreeNode01(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value == data)
			return;

		if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode01(value);
			} else {
				leftChild.insert(value);
			}
		} else {
			if (rightChild == null) {
				rightChild = new TreeNode01(value);
			} else {
				rightChild.insert(value);
			}
		}
	}

	public TreeNode01 get(int value) {
		if (value == data) {
			return this;
		}

		if (value < data) {
			if (leftChild != null) {
				return leftChild.get(value);
			}
		} else {
			if (rightChild != null) {
				return rightChild.get(value);
			}
		}
		return null;
	}
	
	public int min() {
		if (leftChild == null) {
			return data;
		}
		else {
			return leftChild.min();
		}
	}

	public int max() {
		if (rightChild == null) {
			return data;
		} else {
			return rightChild.max();
		}
	}
	
	public void traverseInOrder() {
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}

		System.out.print(data + ", ");
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode01 getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode01 leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode01 getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode01 rightChild) {
		this.rightChild = rightChild;
	}

	public String toString() {
		return "Data = " + data;
	}
}
