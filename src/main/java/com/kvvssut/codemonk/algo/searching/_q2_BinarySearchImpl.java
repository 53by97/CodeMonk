package com.kvvssut.codemonk.algo.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _q2_BinarySearchImpl {

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			String readLine = reader.readLine();
			int sizeOfInputs = Integer.parseInt(readLine);
			String readLineArray[] = reader.readLine().split(" ");
			int inputs[] = new int[sizeOfInputs];
			for (int i = 0; i < sizeOfInputs; i++) {
				inputs[i] = Integer.parseInt(readLineArray[i]);
			}

			Arrays.sort(inputs);

			int noOfQueries = Integer.parseInt(reader.readLine());
			for (int i = 0; i < noOfQueries; i++) {
				System.out.println(rankWithBinarySearch(inputs, 0, sizeOfInputs, Integer.parseInt(reader.readLine())));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static int rankWithBinarySearch(int input[], int low, int high, int key) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key > input[mid]) {
				low = mid + 1;
			} else if (key < input[mid]) {
				high = mid - 1;
			} else {
				return mid + 1;
			}
		}
		return -1;
	}

}
