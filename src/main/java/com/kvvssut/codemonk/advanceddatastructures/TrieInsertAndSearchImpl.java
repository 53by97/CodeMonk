package com.kvvssut.codemonk.advanceddatastructures;

public class TrieInsertAndSearchImpl {

	public static final int ALPHABET_SIZE = 26;

	public static void main(String[] args) {
		final String[] inputs = { "the", "a", "there", "answer", "any", "by", "bye", "their" };

		TrieNode root = new TrieNode();
		for (int i = 0; i < inputs.length; i++) {
			insertKey(root, inputs[i]);
		}

		System.out.println("Present in dictionary : " + searchKey(root, "answer"));
		System.out.println("Present in dictionary : " + searchKey(root, "an"));
		System.out.println("Present in dictionary : " + searchKey(root, "there"));
		System.out.println("Present in dictionary : " + searchKey(root, "theri"));
		System.out.println("Present in dictionary : " + searchKey(root, "their"));

	}

	public static void insertKey(TrieNode root, final String key) {
		int level, length = key.length(), index;

		for (level = 0; level < length; level++) {
			index = getIndexForChar(key.charAt(level));
			if (root.getTrieArray()[index] == null) {
				root.getTrieArray()[index] = new TrieNode();
			}
			root = root.getTrieArray()[index];
		}
		root.setLeaf(true);
	}

	public static boolean searchKey(TrieNode root, final String key) {
		int level, length = key.length(), index;

		for (level = 0; level < length; level++) {
			index = getIndexForChar(key.charAt(level));
			if (root.getTrieArray()[index] == null) {
				return false;
			}
			root = root.getTrieArray()[index];
		}

		return root.isLeaf();
	}

	public static int getIndexForChar(char ch) {
		if (ch >= 95) {
			return ch - 97;
		} else {
			return ch - 65;
		}
	}

}

class TrieNode {
	private TrieNode trieArray[];
	private boolean isLeaf;

	public TrieNode() {
		this.trieArray = new TrieNode[TrieInsertAndSearchImpl.ALPHABET_SIZE];
		this.isLeaf = false;
	}

	public TrieNode[] getTrieArray() {
		return trieArray;
	}

	public void setTrieNode(TrieNode[] trieArray) {
		this.trieArray = trieArray;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

}
