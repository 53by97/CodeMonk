package com.kvvssut.codemonk.algo.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _q1_LinearSearchImpl {

	/*
	 * Linear search is used on a collections of items. It relies on the
	 * technique of traversing a list from start to end by exploring properties
	 * of all the elements that are found on the way.
	 */

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			String readLine = reader.readLine();
			String readLineArray[] = readLine.split(" ");
			int sizeOfInputs = Integer.parseInt(readLineArray[0]);
			int numberToSearch = Integer.parseInt(readLineArray[1]);

			readLine = reader.readLine();
			readLineArray = readLine.split(" ");
			for (int index = sizeOfInputs - 1; index >= 0; index--) {
				if (numberToSearch == Integer.parseInt(readLineArray[index])) {
					System.out.println(index + 1);
					return;
				}
			}
			System.out.println("-1");
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

}
