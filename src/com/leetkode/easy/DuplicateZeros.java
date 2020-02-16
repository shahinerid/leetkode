package com.leetkode.easy;

public class DuplicateZeros {

	/*
	 * @author - Md Mojahidul Islam LeetCode # Duplicate Zeros # 1089 Difficulty -
	 * Easy 02/09/2020
	 */

	public static void duplicateZeros(int[] arr) {

		int zeros = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				zeros++;
		}

		int k = arr.length + zeros - 1;
		int l = arr.length - 1;

		for (int i = (arr.length - 1); i >= 0; i--) {

			if (k > l) {
				k--;
			} else {
				if (arr[i] != 0) {
					arr[k] = arr[i];
					k--;
				} else {
					arr[k] = arr[i];
					k--;
					arr[k] = arr[i];
					k--;
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] input = { 1, 0, 2, 0, 3 };
		duplicateZeros(input);

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
