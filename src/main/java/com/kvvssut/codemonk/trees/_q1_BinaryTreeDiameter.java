package com.kvvssut.codemonk.trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class BinaryTree {
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

public class _q1_BinaryTreeDiameter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] inputs = line.split(" ");
		int noOfTestCases = Integer.parseInt(inputs[0]) - 1;
		BinaryTree root = createNode(Integer.parseInt(inputs[1]));

		for (int i = 0; i < noOfTestCases; i++) {
			line = br.readLine();
			char paths[] = line.toCharArray();
			int pathsLength = paths.length;
			BinaryTree currentNode = root;
			for (int j = 0; j < pathsLength; j++) {
				if (j + 1 == pathsLength) {
					if (paths[j] == 'L') {
						addLeftChildNode(currentNode, Integer.parseInt(br.readLine()));
					} else {
						addRightChildNode(currentNode, Integer.parseInt(br.readLine()));
					}
				} else {
					if (paths[j] == 'L') {
						currentNode = currentNode.getLeft();
					} else {
						currentNode = currentNode.getRight();
					}
				}
			}
		}
		
		
	}

	private static BinaryTree createNode(int data) {
		return new BinaryTree(data, null, null);
	}

	private static void addLeftChildNode(BinaryTree node, int data) {
		BinaryTree newNode = createNode(data);
		node.setLeft(newNode);
	}

	private static void addRightChildNode(BinaryTree node, int data) {
		BinaryTree newNode = createNode(data);
		node.setRight(newNode);
	}

}
