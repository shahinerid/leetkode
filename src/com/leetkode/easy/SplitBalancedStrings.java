package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 1221. Split a String in Balanced Strings
 * Difficulty - Easy
 * 02/23/2020
 */
public class SplitBalancedStrings {

	public static int balancedStringSplit(String s) {

		int output = 0, L = 0, R = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'L')
				L++;
			if (c == 'R')
				R++;
			if (L == R)
				output++;
		}
		return output;
	}

	public static void main(String[] args) {

		System.out.println(balancedStringSplit("LRLRRRLL"));
	}

}
