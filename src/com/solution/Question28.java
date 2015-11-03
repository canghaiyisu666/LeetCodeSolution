package com.solution;

/**
 * 题意：字符串中第一次出现给定字符串的位置
 */
public class Question28 {
	public static int strStr(String haystack, String needle) {
		if (needle.equals("") || haystack.equals(needle)
				|| haystack.indexOf(needle) == 0) {
			return 0;
		}

		if (haystack.equals("") || haystack.length() < needle.length()
				|| !haystack.contains(needle)) {
			return -1;
		}

		String tmp[] = haystack.split(needle);
		return tmp[0].length();

	}

	public static void main(String[] args) {
		System.out.println(strStr("aaa", "aaaa"));
	}
}
