package com.kvvssut.codemonk.algo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _q2_PuchiAndLuggage {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputs = Integer.parseInt(line);

		int inputsArray[][] = new int[inputs][], sortedArray[][] = new int[inputs][];

		for (int i = 0; i < inputs; i++) {
			line = br.readLine();
			int inputLen = Integer.parseInt(line);
			inputsArray[i] = new int[inputLen];
			sortedArray[i] = new int[inputLen];
			for (int j = 0; j < inputLen; j++) {
				inputsArray[i][j] = Integer.parseInt(br.readLine());
				sortedArray[i][j] = inputsArray[i][j];
			}
		}

		for (int i = 0; i < inputs; i++) {
			int arrLen = inputsArray[i].length;
			Arrays.sort(sortedArray[i]);

			int index = 0, dist = 0, lastInput = 0;
			for (int j = 0; j < arrLen; j++) {
				int input = inputsArray[i][j];
				if (input >= lastInput) {
					for (; index < arrLen; index++) {
						if (sortedArray[i][index] == input) {
							sortedArray[i][index] = -1;
							break;
						}
						if (sortedArray[i][index] != -1) {
							dist++;
						}
					}
				} else {
					dist = 0;
					for (index = 0; index < arrLen; index++) {
						if (sortedArray[i][index] == input) {
							sortedArray[i][index] = -1;
							break;
						}
						if (sortedArray[i][index] != -1) {
							dist++;
						}
					}
				}

				System.out.print(dist + " ");
				lastInput = input;
			}
			System.out.println();
		}
	}

}
