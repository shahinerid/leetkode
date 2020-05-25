package com.leetkode.easy;

public class ReverseVowels {

	public static void reverseVowels(char[] s) {

		int m = 0, n = s.length - 1;
		while (m < n) {
			char temp = s[m];
			if(S)
			s[m] = s[n];
			s[n] = temp;
			m++;
			n--;
		}

	}

	public static void main(String[] args) {

		char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
		reverseVowels(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
