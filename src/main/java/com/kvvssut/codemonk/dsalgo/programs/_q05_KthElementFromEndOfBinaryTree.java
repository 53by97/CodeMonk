package com.kvvssut.codemonk.dsalgo.programs;

public class _q05_KthElementFromEndOfBinaryTree {

	public static void main(String[] args) {
		BinaryTree root = createNode(10);
		addLeftChildNode(root, 5);
		addLeftChildNode(root.getLeft(), 1);
		addRightChildNode(root.getLeft(), 6);
		addRightChildNode(root, 19);
		addLeftChildNode(root.getRight(), 17);
		addLeftChildNode(root.getRight().getLeft(), 15);

		System.out.println(getKthElementFromEndOfBinaryTree(root, 4));
	}

	private static int getKthElementFromEndOfBinaryTree(BinaryTree node, int k) {
		
		if (node.getRight() != null) {
			getKthElementFromEndOfBinaryTree(node.getRight(), k--);
		}
		
		if (k == 0) {
			return node.getData();
		}
		
		if (node.getLeft() != null) {
			getKthElementFromEndOfBinaryTree(node.getLeft(), k--);
		}
		
		return -1;
	}

	static class BinaryTree {
		private int data;
		private BinaryTree left, right;

		public BinaryTree(int data, BinaryTree left, BinaryTree right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public BinaryTree getLeft() {
			return left;
		}

		public void setLeft(BinaryTree left) {
			this.left = left;
		}

		public BinaryTree getRight() {
			return right;
		}

		public void setRight(BinaryTree right) {
			this.right = right;
		}
	}

	public static BinaryTree createNode(int data) {
		return new BinaryTree(data, null, null);
	}

	public static void addLeftChildNode(BinaryTree node, int data) {
		BinaryTree newNode = createNode(data);
		node.setLeft(newNode);
	}

	public static void addRightChildNode(BinaryTree node, int data) {
		BinaryTree newNode = createNode(data);
		node.setRight(newNode);
	}

}
