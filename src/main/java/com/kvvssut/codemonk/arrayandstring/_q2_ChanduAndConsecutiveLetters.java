package com.kvvssut.codemonk.arrayandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _q2_ChanduAndConsecutiveLetters {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputs = Integer.parseInt(line);

		char outputArray[][] = new char[inputs][];

		for (int i = 0; i < inputs; i++) {
			line = br.readLine();
			char input[] = line.toCharArray();
			int inputLen = input.length;

			outputArray[i] = new char[inputLen];

			int k = 0;
			for (int j = 0; j < inputLen; k++) {
				outputArray[i][k] = input[j];
				while ((++j < inputLen) && (input[j] == outputArray[i][k])) {
					continue;
				}
			}

			char output[] = new char[k];
			for (int j = 0; j < output.length; j++) {
				output[j] = outputArray[i][j];
			}

			outputArray[i] = output;
		}

		for (int i = 0; i < outputArray.length; i++) {
			char outputArr[] = outputArray[i];
			for (int j = 0; j < outputArr.length; j++) {
				System.out.print(outputArr[j]);
			}
			System.out.print("\n");
		}
	}

}
