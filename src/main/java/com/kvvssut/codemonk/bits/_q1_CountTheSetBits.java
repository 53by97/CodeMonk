package com.kvvssut.codemonk.bits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _q1_CountTheSetBits {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputs = Integer.parseInt(line);

		for (int i = 0; i < inputs; i++) {
			System.out.println(count1sInBinaryRepresentaionOfANumber(Integer.parseInt(br.readLine())));
		}
	}

	public static int count1sInBinaryRepresentaionOfANumber(int num) {
		int count = 0;
		while (num > 0) {
			num = num & (num - 1);
			count++;
		}
		return count;
	}

}
