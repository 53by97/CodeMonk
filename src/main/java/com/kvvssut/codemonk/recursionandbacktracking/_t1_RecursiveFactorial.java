package com.kvvssut.codemonk.recursionandbacktracking;

public class _t1_RecursiveFactorial {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(String.format("Num - %d \nFactorial - %d", num, calculateFactorial(num)));
	}

	public static int calculateFactorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * calculateFactorial(num - 1);
	}

}
