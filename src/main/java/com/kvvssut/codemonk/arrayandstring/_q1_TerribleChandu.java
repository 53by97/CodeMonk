package com.kvvssut.codemonk.arrayandstring;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _q1_TerribleChandu {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputs = Integer.parseInt(line);

		char inputsArray[][] = new char[inputs][];

		for (int i = 0; i < inputs; i++) {
			line = br.readLine();
			char input[] = line.toCharArray();
			int inputLen = input.length;

			inputsArray[i] = new char[inputLen];

			for (int j = 0; j < inputLen; j++) {
				inputsArray[i][j] = input[inputLen - j - 1];
			}
		}

		for (int i = 0; i < inputsArray.length; i++) {
			char outputArr[] = inputsArray[i];
			for (int j = 0; j < outputArr.length; j++) {
				System.out.print(outputArr[j]);
			}
			System.out.print("\n");
		}
	}

}
