package com.leetkode.easy;

/*
 * @author - Md Mojahidul Islam
 * LeetCode # 709. To Lower Case
 * Difficulty - Easy
 * 02/23/2020
 */
public class ToLowerCase {
	
	 public static String toLowerCase(String str) {
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<str.length();i++) {
	        	char c = str.charAt(i);
	        	if(c>='A' && c<='Z') {
	        		c+=32;
	        	}
	        	sb.append(c);
	        }
	        
	        return sb.toString();
	    }

	public static void main(String[] args) {

		String inp = "abc";
		System.out.println(toLowerCase(inp));
	}

}
