package com.solution;


public class Question7 {
	public static int reverse(int x) {

		String str = Integer.toString(x);

		char[] ca = str.toCharArray();
		String res = "";
		int stop = -1;
		if (x < 0) {
			stop = 0;
		}
		for (int i = ca.length - 1; i > stop; i--) {
			res += ca[i];
		}
		long longValue = Long.valueOf(res).longValue();
		if (longValue > Integer.MAX_VALUE || longValue < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) longValue;
		// if (x != 0) {
		// ArrayList<Integer> list = new ArrayList<>();
		// int tmp = x;
		// if (x >= 0) {
		// while (tmp != 0) {
		// list.add(tmp % 10);
		// tmp = (tmp / 10);
		// }
		// String sum = "";
		// for (int i = 0; i < list.size(); i++) {
		//
		// sum += list.get(i).toString();
		// }
		// return Integer.valueOf(sum).intValue();
		// } else {
		// tmp = x * (-1);
		// while (tmp != 0) {
		// list.add(tmp % 10);
		// tmp = (tmp / 10);
		// }
		// String sum = "";
		// for (int i = 0; i < list.size(); i++) {
		//
		// sum += list.get(i).toString();
		// }
		// return Integer.valueOf(sum).intValue() * (-1);
		//
		// }
		// }
		// return 0;

	}

	public static void main(String[] args) {
		System.out.println(reverse(1646324359));
	}
}
