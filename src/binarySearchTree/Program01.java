package binarySearchTree;

public class Program01 {

	public static void main(String[] args) {

		Tree01 intTree = new Tree01();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		
		intTree.traverseInOrder();
		System.out.println();
		intTree.traversePreOrder();

//		System.out.println();
//		System.out.println(intTree.get(27));
//		System.out.println(intTree.get(17));
//		System.out.println(intTree.get(2777));
//		System.out.println();
//		
//		System.out.println(intTree.min());
//		System.out.println(intTree.max());
		System.out.println();
		intTree.delete(15);
		intTree.delete(27);
		intTree.delete(25);
		intTree.traverseInOrder();
		System.out.println();
	}
}