package com.solution;

public class Question9 {
	public static boolean isPalindrome(int x) {
		if (x == 0) {
			return true;
		}
		if (x < 0) {
			return false;
		}
		String input = String.valueOf(x);
		if (input.equals(new StringBuffer(input).reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
	}
}
