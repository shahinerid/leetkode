package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 541. Reverse String II
 * Difficulty - Easy
 * 02/25/2020
 */
public class ReverseString2 {

	public static String reverseStr(String s, int k) {

		char[] str = s.toCharArray();
		int n = s.length();
		int i = 0;
		while (i < n) {
			int indx = Math.min(i + k - 1, n - 1);
			 	reverseString(str, i, indx);
			i += 2 * k;
		}
		return String.copyValueOf(str);
	}

	public static void reverseString(char[] s, int m, int n) {

		while (m < n) {
			char temp = s[m];
			s[m] = s[n];
			s[n] = temp;
			m++;
			n--;
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseStr("abdcf", 2));

	}

}
