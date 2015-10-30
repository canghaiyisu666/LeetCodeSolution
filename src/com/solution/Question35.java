package com.solution;

/**
 * 给以个排好序的数组插入一个元素，方法返回插入位置
 * Here are few examples:
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
public class Question35 {
	public static int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;

	}

	public static void main(String[] args) {
		int[] a = new int[] { 1 };
		System.out.println(searchInsert(a, 0));
	}
}
