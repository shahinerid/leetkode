package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # Remove Duplicates from Sorted Array # 26
 * Difficulty - Easy
 * 02/08/2020
 */
public class RemoveDuplicate {
	
	public static int removeDuplicates(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		if(nums.length==1) {
			return 1;
		}
		
		int c = 1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1]) {
				nums[c]=nums[i];
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,2,2,2,3,4,55,55,56};
		
		int len = removeDuplicates(nums);
		
		System.out.println("Number of unique element = "+ len);
		
		for(int i=0; i<len; i++) {
			System.out.println(nums[i]);
		}
	}

}
