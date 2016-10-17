package com.kvvssut.codemonk.arrayandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _q3_PrateekAndHisFriends {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputs = Integer.parseInt(line);

		long inputsArray[][] = new long[inputs][], sumArray[] = new long[inputs];

		for (int i = 0; i < inputs; i++) {
			line = br.readLine();
			String inputAndSum[] = line.split(" ");
			int inputLen = Integer.parseInt(inputAndSum[0]);
			sumArray[i] = Long.parseLong(inputAndSum[1]);

			inputsArray[i] = new long[inputLen];
			for (int j = 0; j < inputLen; j++) {
				inputsArray[i][j] = Long.parseLong(br.readLine());
			}
		}

		boolean matchFound;
		long inputArr[], sum = 0l;
		for (int i = 0; i < inputs; i++) {
			matchFound = false;
			inputArr = inputsArray[i];
			for (int j = 0; j < inputArr.length; j++) {
				sum = 0l;
				for (int k = j; k < inputArr.length; k++) {
					sum = sum + inputArr[k];
					if (sum >= sumArray[i]) {
						if (sum == sumArray[i]) {
							matchFound = true;
							j = inputArr.length;
						}
						break;
					}
				}
			}
			if (matchFound) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
