package com.kvvssut.codemonk.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _q1_ChanduAndHisGirlfriend {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputs = Integer.parseInt(line);

		int inputsArray[][] = new int[inputs][];

		for (int i = 0; i < inputs; i++) {
			line = br.readLine();
			int inputLen = Integer.parseInt(line);
			inputsArray[i] = new int[inputLen];

			String[] input = br.readLine().split(" ");
			for (int j = 0; j < inputLen; j++) {
				inputsArray[i][j] = Integer.parseInt(input[j]);
			}
		}

		for (int i = 0; i < inputs; i++) {
			mergeSort(inputsArray[i], 0, inputsArray[i].length - 1);

			for (int j = inputsArray[i].length - 1; j >= 0; j--) {
				System.out.print(inputsArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void mergeSort(int inputs[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(inputs, start, mid);
			mergeSort(inputs, mid + 1, end);

			merge(inputs, start, mid, end);
		}
	}

	private static void merge(int[] inputs, int start, int mid, int end) {
		int p = start, q = mid + 1;
		int temp[] = new int[end - start + 1], k = 0;

		for (int i = start; i <= end; i++) {
			if (p > mid) {
				temp[k++] = inputs[q++];
			} else if (q > end) {
				temp[k++] = inputs[p++];
			} else if (inputs[p] < inputs[q]) {
				temp[k++] = inputs[p++];
			} else {
				temp[k++] = inputs[q++];
			}
		}

		for (int i = 0; i < k; i++) {
			inputs[start++] = temp[i];
		}
	}

}
