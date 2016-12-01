package com.kvvssut.codemonk.advanceddatastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrieSearchEngineImpl {

	public static final int ALPHABET_SIZE = 26;

	public static void main(String[] args) throws IOException {
		final String[] inputs = { "the", "a", "there", "answer", "any", "by", "bye", "their" };

		TrieImplNode root = new TrieImplNode();
		for (int i = 0; i < inputs.length; i++) {
			insertKey(root, inputs[i]);
		}

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));

			StringBuilder stringBuilder = new StringBuilder();
			char ch;
			while ((ch = (char) reader.read()) != '\n') {
				stringBuilder.append(ch);
				String[] words = searchProbableWords(root, stringBuilder.toString());
				for (String word : words) {
					System.out.print(word + ", ");
				}
				System.out.println();
			}

		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		System.out.println("Enter prefix to search : ");

	}

	public static void insertKey(TrieImplNode root, final String key) {
		int level, length = key.length(), index;

		for (level = 0; level < length; level++) {
			index = getIndexForChar(key.charAt(level));
			if (root.getTrieArray()[index] == null) {
				root.getTrieArray()[index] = new TrieImplNode();
			}
			root = root.getTrieArray()[index];
		}
		root.setLeaf(true);
	}

	public static String[] searchProbableWords(TrieImplNode root, final String key) {
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

class TrieImplNode {
	private TrieImplNode trieArray[];
	private boolean isLeaf;

	public TrieImplNode() {
		this.trieArray = new TrieImplNode[TrieSearchEngineImpl.ALPHABET_SIZE];
		this.isLeaf = false;
	}

	public TrieImplNode[] getTrieArray() {
		return trieArray;
	}

	public void setTrieImplNode(TrieImplNode[] trieArray) {
		this.trieArray = trieArray;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

}
