package com.solution;

/**
 * 一个非负多位数保存在一个数组中，给这个数字加一，需要考虑到进位问题。
 */
public class Question66 {
	public static int[] plusOne(int[] digits) {
		digits[digits.length - 1] += 1;

		for (int i = digits.length - 1; i > -1; i--) {
			if (digits[i] / 10 == 1) {// 需要进位
				if (i != 0) {// 要进位的位不在第一位
					plus(digits, i);
				} else {// 给最高位进位
					int[] tmp = new int[digits.length + 1];
					for (int j = digits.length; j > 0; j--) {
						tmp[j] = digits[j - 1];
					}
					tmp[0] = 1;
					tmp[1] = 0;
					digits = tmp;
				}
			}
		}
		return digits;
	}

	public static int[] plus(int[] tmp, int flag) {
		tmp[flag] %= 10;
		tmp[flag - 1] += 1;
		return tmp;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 9, 9 };
		plusOne(a);
	}
}
