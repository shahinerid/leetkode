package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 443. String Compression
 * Difficulty - Easy
 * 02/16/2020
 */
public class StringCompression {

	public static int compress(char[] chars) {

		int indx = 0, i = 0;

		while (i < chars.length) {
			char cchar = chars[i];
			int count = 0;
			while (i < chars.length && chars[i] == cchar) {
				i++;
				count++;
			}

			chars[indx++] = cchar;
			if (count > 1) {
				for (char c : Integer.toString(count).toCharArray()) {
					chars[indx++] = c;
				}
			}
		}
		return indx;
	}

	public static void main(String[] args) {

		char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

		int len = compress(chars);

		for (int i = 0; i < len; i++) {
			System.out.println(chars[i]);
		}
	}

}
