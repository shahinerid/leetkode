package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # Count and Say # 38
 * Difficulty - Easy
 * 01/25/2020
 */
public class CountAndSay {

	public static String countAndSay(int n) {

		String result = "1";

		for (int i = 1; i < n; i++) {
			result = findToSay(result);
		}

		return result;
	}

	public static String findToSay(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length();) {
			int j = 0;

			while (i + j < input.length() && input.charAt(i) == input.charAt(i + j)) {
				j++;
			}
			sb.append(j).append(input.charAt(i));

			i += j;
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println("Input number = 8, output = " + countAndSay(8));

	}

}
