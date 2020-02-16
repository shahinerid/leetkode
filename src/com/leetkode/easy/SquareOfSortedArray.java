package com.leetkode.easy;

import java.util.Arrays;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 977. Squares of a Sorted Array
 * Difficulty - Easy
 * 02/16/2020
 */
public class SquareOfSortedArray {

	public static int[] sortedSquares(int[] A) {

		for (int i = 0; i < A.length; i++) {
			A[i] = (A[i]) * (A[i]);
		}
		Arrays.sort(A);

		return A;
	}

	public static void main(String[] args) {

		int a[] = { -7, -3, 2, 3, 11 };

		int b[] = sortedSquares(a);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
