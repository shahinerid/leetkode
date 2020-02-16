package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # Remove Duplicates from Sorted Array # 27
 * Difficulty - Easy
 * 02/08/2020
 */
public class RemoveElement {

	public static int removeElement(int[] nums, int val) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int c = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[c] = nums[i];
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {

		int[] nums = { 3,4,5,2, 2, 2, 2 };

		int len = removeElement(nums, 2);

		System.out.println("Number of remaining element = " + len);

		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
	}
}
