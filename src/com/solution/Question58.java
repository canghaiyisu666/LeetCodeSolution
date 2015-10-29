package com.solution;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 */
public class Question58 {
	public static int lengthOfLastWord(String s) {
		if (s.trim().equals("") || s.length() == 0) {
			return 0;
		}
		String[] tmp = s.trim().split(" ");

		String last = tmp[tmp.length - 1];
		return last.length();

	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a "));
	}
}
