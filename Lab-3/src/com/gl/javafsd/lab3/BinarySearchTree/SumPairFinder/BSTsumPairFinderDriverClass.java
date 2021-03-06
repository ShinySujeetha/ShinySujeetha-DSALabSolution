package com.gl.javafsd.lab3.BinarySearchTree.SumPairFinder;


public class BSTsumPairFinderDriverClass {

	public static void main(String[] args) {
		
		test(100);			
		test(120);
		test(130);
		test(70);
		test(510);
		test(45);
	}

	private static void test(int sum) {
		
		BinarySearchTree tree = bst();
		
		BinarySearchTreePairFinder finder 
			= new BinarySearchTreePairFinder(tree);
		
		finder.findPair(sum);
		
	}
	
	private static BinarySearchTree bst() {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(60);
		tree.insert(70);
		tree.insert(50);
		
	
		return tree;
	}
}