package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 1313. Decompress Run-Length Encoded List
 * Difficulty - Easy
 * 02/15/2020
 */
public class DecompressList {

	public static int[] decompressRLElist(int[] nums) {
		
		if(nums.length<2 || nums.length>=100 || (nums.length % 2 !=0)) {
			return null;
		}
		
		int ol = 0;

		for (int i = 0; i < nums.length; i = i + 2) {
			ol += nums[i];
		}

		int output[] = new int[ol];
		int indx = 0;

		for (int j = 0; j < nums.length; j+=2) {
			for (int k = 0; k < nums[j]; k++) {
				output[indx] = nums[j + 1];
				indx++;
			}
		}

		return output;
	}

	public static void main(String[] args) {

		int input[] = { 42,33 };

		int out[] = decompressRLElist(input);

		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
	}

}
