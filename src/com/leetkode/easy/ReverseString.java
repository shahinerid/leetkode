package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 344. Reverse String
 * Difficulty - Easy
 * 02/24/2020
 */
public class ReverseString {

	public static void reverseString(char[] s) {

		int m = 0, n = s.length - 1;
		while (m < n) {
			char temp = s[m];
			s[m] = s[n];
			s[n] = temp;
			m++;
			n--;
		}
	}

	public static void main(String[] args) {

		char[] s = { 'H','a','n','n','a','h' };
		reverseString(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
