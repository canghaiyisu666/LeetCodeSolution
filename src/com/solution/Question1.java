package com.solution;

public class Question1 {
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res[0] = (i + 1);
					res[1] = (j + 1);
					return res;
				}
			}
		}

		return null;

	}

	public static void main(String[] args) {
		int[] res = twoSum(new int[] {2, 7, 11, 15},
				new Integer(9));

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}